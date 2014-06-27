package com.seavus.sas.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.seavus.sas.model.User;
import com.seavus.sas.service.UserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userService = new UserService();

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// get request parameters for userID and password
		String userName = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		
		User user  = userService.getUser(userName, pwd);
		boolean userExist = user!=null;
		if(userExist){
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			//setting session to expiry in 30 mins
			session.setMaxInactiveInterval(30*60);
			Cookie userNameCookie = new Cookie("user", userName);
			userNameCookie.setMaxAge(30*60);
			response.addCookie(userNameCookie);
//			response.sendRedirect("jsp/LoginSuccess.jsp");
			response.sendRedirect("servlet");
		}else{
			RequestDispatcher rd = getServletContext().getRequestDispatcher("html/login.html");
			PrintWriter out= response.getWriter();
			out.println("<font color=red>Enter user name or password is wrong.</font>");
			rd.include(request, response);
		}

	}

	
	}


