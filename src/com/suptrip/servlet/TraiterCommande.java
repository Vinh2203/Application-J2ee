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

/**
 * Servlet implementation class TraiterCommande
 */
@WebServlet("/auth/traiterCommande")
public class TraiterCommande extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraiterCommande() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Commande> liste_commande = DaoFactory.getDaoFactory().getCommandeDao().getAllCommande();
		List<Panier> liste_panier = DaoFactory.getDaoFactory().getPanierDao().getAllPanier();
		HashMap<Commande, List<Trip>> liste_trip_user = new HashMap<Commande, List<Trip>>();
		
		for(Commande c : liste_commande){
			if(c.getEtatCommande()== 1){
				List<Trip> list = new ArrayList<Trip>();
				for (Panier p : liste_panier) {
					if (p.getCommande().getIdCommande().equals(c.getIdCommande())) {

						list.add(p.getTrip());
					}
				}	
				liste_trip_user.put(c,list);
			}
		}
		request.setAttribute("traiter_commande",liste_trip_user);
		RequestDispatcher rd = request.getRequestDispatcher("/front/traiterCommande.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
