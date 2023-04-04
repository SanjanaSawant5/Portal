package com.parkingportalmain.web;

import java.io.IOException;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.parkingportalmain.conprov.ConProv;

 
@WebServlet("/SearchN")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     
    public SearchServlet() {
        super();
         
    }

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		String property_code = request.getParameter("property_code");
		String property_name = request.getParameter("property_name");
		
		Connection connection = ConProv.getConn();
		
		try {
			String storedProcedureCall = "CALL search(?,?)";
			CallableStatement stmt = connection.prepareCall("storedProcedureCall");
			stmt.setString(1, property_code);
			stmt.setString(2, property_name);
			boolean hasResult = stmt.execute();
			
			if (hasResult) {
				ResultSet rs = stmt.getResultSet();
	        if (rs.next()) {
	        	HttpSession session = request.getSession();
	        	RequestDispatcher dispatcher = request.getRequestDispatcher("UserDetail.jsp");
	        	dispatcher.forward(request, response);
	        }
			} else {
				response.sendRedirect("Error.jsp");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
