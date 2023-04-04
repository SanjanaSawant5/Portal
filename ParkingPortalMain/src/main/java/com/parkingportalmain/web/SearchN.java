package com.parkingportalmain.web;

import java.io.IOException;

import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.parkingportalmain.bean.Search;
import com.parkingportalmain.conprov.ConProv;
import com.parkingportalmain.dao.SearchDao;

 
@WebServlet("/SearchServlet")
public class SearchN extends HttpServlet {
	private static final long serialVersionUID = 1L;
        
    public SearchN() {
        super();
         
    }
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		String property_code = request.getParameter("property_code");
		String property_name = request.getParameter("property_name");
		
		try {
			Connection connection = ConProv.getConn();
			SearchDao dao = new SearchDao(connection);
			Search search = dao.callStoredProcedure(property_code, property_name);
			if (search != null) {
				HttpSession session = request.getSession();
				session.setAttribute("search", search);
				RequestDispatcher dispatcher = request.getRequestDispatcher("UserDetail.jsp");
				dispatcher.forward(request, response);
			} else {
				response.sendRedirect("Error.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("Error.jsp");
		}
	}

}
