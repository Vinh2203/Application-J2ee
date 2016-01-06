package com.suptrip.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suptrip.dao.DaoFactory;
import com.suptrip.model.Number;
import com.suptrip.model.PanierTemporaire;
import com.suptrip.model.User;



@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/front/pageLogin.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Recup�ration de l'attribut idBooster , password du formulaire de
		// login
		String userName = (String) request.getParameter("idBooster");
		String password = (String) request.getParameter("password");

		
		if(Number.isNumber(userName)){
			Long id = Long.parseLong(userName);
			User u = DaoFactory.getDaoFactory().getUserDao().findUserById(id);
			if (u == null) {
				request.getSession().setAttribute("test",false);
			} else {
				if (u.getPassword().equals(User.getMD5(password))) {
					request.getSession().setAttribute("user", u);
					request.getSession().setAttribute("test", true);
					
					List<PanierTemporaire> liste_panier = DaoFactory.getDaoFactory().getPanierTemporaireDao().getAllPanierTemporaire();
					List<PanierTemporaire> liste_trip_user = new ArrayList<PanierTemporaire>();
					
					for (PanierTemporaire l : liste_panier) {
						if (l.getUser().getIdBooster().equals(u.getIdBooster())) {
							liste_trip_user.add(l);
						}
					}
					request.getSession().setAttribute("number_trip_order", liste_trip_user.size());
				} else {
					request.getSession().setAttribute("test", false);
				}
			}
		}else{
			request.getSession().setAttribute("test", false);
		}
		
		
		// On redirige vers le servlet de home,
		response.sendRedirect(request.getContextPath() + "/home");

	}

}
