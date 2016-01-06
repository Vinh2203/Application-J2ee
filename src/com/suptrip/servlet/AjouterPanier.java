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
import com.suptrip.model.Trip;
import com.suptrip.model.User;

/**
 * Servlet implementation class AjouterPanier
 */
@WebServlet("/auth/AjouterPanier")
public class AjouterPanier extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjouterPanier() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id_trip = (String) request.getParameter("id_trip");
		Long id = Long.parseLong(id_trip);

		User u = (User) request.getSession().getAttribute("user");

		Trip trip = DaoFactory.getDaoFactory().getTripDao().findTripById(id);
		PanierTemporaire panier = new PanierTemporaire();
		panier.setTrip(trip);
		panier.setUser(u);
		DaoFactory.getDaoFactory().getPanierTemporaireDao().addPanierTemporaire(panier);

		List<PanierTemporaire> liste_panier = DaoFactory.getDaoFactory().getPanierTemporaireDao()
				.getAllPanierTemporaire();

		List<PanierTemporaire> liste_trip_user = new ArrayList<PanierTemporaire>();

		for (PanierTemporaire l : liste_panier) {
			if (l.getUser().getIdBooster().equals(u.getIdBooster())) {
				liste_trip_user.add(l);

			}
		}
		request.getSession().setAttribute("number_trip_order", liste_trip_user.size());
		response.sendRedirect(request.getContextPath() + "/home");

	}

}
