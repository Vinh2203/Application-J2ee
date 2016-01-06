package com.suptrip.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suptrip.dao.DaoFactory;
import com.suptrip.model.Commande;
import com.suptrip.model.Panier;
import com.suptrip.model.Trip;
import com.suptrip.model.User;

/**
 * Servlet implementation class HistoireCommande
 */
@WebServlet("/auth/histoireCommande")
public class HistoireCommande extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HistoireCommande() {
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

		List<Commande> liste_commande = DaoFactory.getDaoFactory().getCommandeDao().getAllCommande();
		List<Panier> liste_panier = DaoFactory.getDaoFactory().getPanierDao().getAllPanier();

		List<Commande> liste_commande_user = new ArrayList<Commande>();

		HashMap<Commande, List<Trip>> liste_trip_user = new HashMap<Commande, List<Trip>>();

		for (Commande c : liste_commande) {
			if (c.getUser().getIdBooster().equals(u.getIdBooster())) {
				List<Trip> liste_trip = new ArrayList<Trip>();
				liste_commande_user.add(c);
				for (Panier p : liste_panier) {
					if (p.getCommande().getIdCommande().equals(c.getIdCommande())) {

						liste_trip.add(p.getTrip());
					}

				}
				liste_trip_user.put(c, liste_trip);
			}
		}

		request.setAttribute("liste_trip", liste_trip_user);

		RequestDispatcher rd = request.getRequestDispatcher("/front/listeCommande.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
