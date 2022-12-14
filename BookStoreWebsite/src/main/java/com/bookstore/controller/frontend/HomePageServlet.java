package com.bookstore.controller.frontend;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomePageServlet
 */
@WebServlet("")
public class HomePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HomePageServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//Redirecionar para o index
		String page = "frontend/index.jsp";
		RequestDispatcher dispatcher =  request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
