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
import com.suptrip.model.PanierTemporaire;
import com.suptrip.model.User;

/**
 * Servlet implementation class ViewPanierOrder
 */
@WebServlet("/auth/ViewPanierOrder")
public class ViewPanierOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewPanierOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User u = (User) request.getSession().getAttribute("user");

		List<PanierTemporaire> liste_panier = DaoFactory.getDaoFactory().getPanierTemporaireDao()
				.getAllPanierTemporaire();

		List<PanierTemporaire> liste_trip_user = new ArrayList<PanierTemporaire>();

		for (PanierTemporaire l : liste_panier) {
			if (l.getUser().getIdBooster().equals(u.getIdBooster())) {
				liste_trip_user.add(l);

			}
		}
		request.setAttribute("liste_trip", liste_trip_user);
		request.setAttribute("number_trip_order", liste_trip_user.size());
		RequestDispatcher rd = request.getRequestDispatcher("/front/listeCommandeOrder.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
