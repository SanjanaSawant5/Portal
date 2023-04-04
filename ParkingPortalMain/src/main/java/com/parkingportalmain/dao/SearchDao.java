package com.parkingportalmain.dao;

import java.sql.CallableStatement;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.parkingportalmain.bean.Search;

 

public class SearchDao {
	
	private Connection con;
	
	public SearchDao(Connection con) {
		this.con = con;
	}
	
	public Search callStoredProcedure(String property_code, String property_name) {
		
		Search search = null;
		
		try {
			String storedProcedureCall = "CALL property(?,?)";
			CallableStatement stmt = this.con.prepareCall(storedProcedureCall);
			stmt.setString(1, property_code);
			stmt.setString(2, property_name);
			boolean hasResult = stmt.execute();
			
			if (hasResult) {
				ResultSet rs = stmt.getResultSet();
				if (rs.next()) {
					int propertycode = rs.getInt("propertycode");
					String propertyname = rs.getString("propertyname");
					int unit = rs.getInt("unit");
					String name = rs.getString("name");
					int parkingspace1 = rs.getInt("parkingspace1");
					String parkinglevel1 = rs.getString("parkinglevel1");
					String parkingtype1 = rs.getString("parkingtype1");
					String vehiclenumber1 = rs.getString("vehiclenumber1");
	        		String registrationtenantname1 = rs.getString("registrationtenantname1");
	        		String licensenumber1 = rs.getString("licensenumber1");
	        		String vehiclemodel1 = rs.getString("vehiclemodel1");
	        		String registrationv1doc = rs.getString("registrationv1doc");
	        		String registrationexpiredate1 = rs.getString("registrationexpiredate1");
	        		String insurancev1doc = rs.getString("insurancev1doc");
	        		String insuranceexpiredate1 = rs.getString("insuranceexpiredate1");
	        		String status1 = rs.getString("status1");
					int parkingspace2 = rs.getInt("parkingspace2");
					String parkinglevel2 = rs.getString("parkinglevel2");
					String parkingtype2 = rs.getString("parkingtype2");
	        		String vehiclenumber2 = rs.getString("vehiclenumber2");
	        		String registrationtenantname2 = rs.getString("registrationtenantname2");
	        		String licensenumber2 = rs.getString("licensenumber2");
	        		String vehiclemodel2 = rs.getString("vehiclemodel2");
	        		String registrationv2doc = rs.getString("registrationv2doc");
	        		String registrationexpiredate2 = rs.getString("registrationexpiredate2");
	        		String insurancev2doc = rs.getString("insurancev2doc");
	        		String insuranceexpiredate2 = rs.getString("insuranceexpiredate2");
	        		String status2 = rs.getString("status2");
	        		search = new Search(property_code, propertyname, propertycode, unit, name,
	        				parkingspace1, parkinglevel1, parkingtype1, vehiclenumber1,
	        				registrationtenantname1, licensenumber1, vehiclemodel1,
	        				registrationv1doc, registrationexpiredate1, insurancev1doc, 
	        				insuranceexpiredate1, status1, parkingspace2, parkinglevel2, 
	        				parkingtype2, vehiclenumber2, registrationtenantname2, licensenumber2,
	        				vehiclemodel2, registrationv2doc, registrationexpiredate2, insurancev2doc,
	        				insuranceexpiredate2, status2);					
				}
			}
			
			hasResult = stmt.getMoreResults();
			if(hasResult) {
				ResultSet rs = stmt.getResultSet();
				while(rs.next()) {
			}
		}
		
	} catch(SQLException e) {
		e.printStackTrace();
	}
		return search;
	}
}
