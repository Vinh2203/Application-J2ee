package com.suptrip.servlet;

import java.io.IOException;
import java.util.Date;
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
import com.suptrip.model.PanierTemporaire;
import com.suptrip.model.User;

/**
 * Servlet implementation class ValiderCommande
 */
@WebServlet("/auth/ValiderCommande")
public class ValiderCommande extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValiderCommande() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date date = new Date();
		Commande commande = new Commande();
		User u = (User) request.getSession().getAttribute("user");
		commande.setDateCommande(date);
		commande.setEtatCommande(1);
		commande.setUser(u);
		DaoFactory.getDaoFactory().getCommandeDao().addCommande(commande);
		
		List<PanierTemporaire> liste_panier = DaoFactory.getDaoFactory().getPanierTemporaireDao().getAllPanierTemporaire();
		
		for (PanierTemporaire l : liste_panier) {
			if (l.getUser().getIdBooster().equals(u.getIdBooster())) {
				Panier panier = new Panier();
				panier.setCommande(commande);
				panier.setTrip(l.getTrip());
				DaoFactory.getDaoFactory().getPanierDao().addPanier(panier);
				DaoFactory.getDaoFactory().getPanierTemporaireDao().removePanierTemporaire(l);
			}
		}
		
		request.setAttribute("Validation_Commande",true);
		RequestDispatcher rd = request.getRequestDispatcher("/front/index.jsp");
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
