package com.seavus.sas.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.seavus.sas.model.Film;

/**
 * Servlet implementation class servlet
 */
public class servlet extends HttpServlet {
	private static final String FILMS_JSP = "jsp/Main.jsp";
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		List<Film> list = new ArrayList<Film>();
		String parameterFilter = request.getParameter("filter");

		Film nameFilm = new Film("ss", 343, "3423", "dfdfd", "fdfd");
		list.add(nameFilm);
		
		if ("all".equals(parameterFilter)) {
			list.add(new Film("sdfgfgf", null, "nufdfdfdll", null, null));
			list.add(new Film("aaaa", null, "nulldfddf", null, null));
			list.add(new Film("bbb", null, "nulldfddf", null, null));
			list.add(new Film("swwrrr", null, "nulldfddf", null, null));
			list.add(new Film("sdsdfsd", null, "nulldfddf", null, null));
			list.add(new Film("sdsdfsd", null, "nulldfddf", null, null));
			list.add(new Film("sdsdfsd", null, "nulldfddf", null, null));

		}
		if ("my".equals(parameterFilter)) {
			list.add(new Film("sdfgfgf", null, "nufdfdfdll", null, null));
			list.add(new Film("aaaa", null, "nulldfddf", null, null));
			list.add(new Film("bbb", null, "nulldfddf", null, null));
		}

		request.setAttribute("Films", list);
		request.getRequestDispatcher(FILMS_JSP).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
