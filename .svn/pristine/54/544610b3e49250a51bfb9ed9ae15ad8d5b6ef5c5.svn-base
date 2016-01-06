package com.suptrip.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suptrip.dao.*;
import com.suptrip.model.Campus;
import com.suptrip.model.Number;
import com.suptrip.model.User;

/**
 * Servlet implementation class CreerCompte
 */
@WebServlet("/creerCompte")
public class CreerCompte extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreerCompte() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher rd = request.getRequestDispatcher("/front/creerCompte.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id_user");
		String password = request.getParameter("password_user");
		String name = request.getParameter("name_user");
		String email = request.getParameter("email_user");
		String campus = request.getParameter("campusId");
		if (Number.isNumber(id)) {
			Long id_user = Long.parseLong(id);
			User i = DaoFactory.getDaoFactory().getUserDao().findUserById(id_user);
			if(i != null){
				request.getSession().setAttribute("login", "1");
				RequestDispatcher rd = request.getRequestDispatcher("/front/creerCompte.jsp");
				rd.forward(request, response);
			}else{
				String password_md5 = User.getMD5(password);
				Long campusId = Long.parseLong(campus);
				Campus c = DaoFactory.getDaoFactory().getCampusDao().findCampusById(campusId);
				User u = new User(id_user, c, name, email, password_md5, 2);
				DaoFactory.getDaoFactory().getUserDao().addUser(u);
				Boolean test = true;
				request.getSession().setAttribute("user", u);
				request.getSession().setAttribute("test", test);
				response.sendRedirect(request.getContextPath() + "/home");
			}	
		} else {
			request.getSession().setAttribute("login", "2");
			RequestDispatcher rd = request.getRequestDispatcher("/front/creerCompte.jsp");
			rd.forward(request, response);
		}

	}

}
