package com.suptrip.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suptrip.dao.DaoFactory;
import com.suptrip.model.Commande;

/**
 * Servlet implementation class ValiderCommandeCLient
 */
@WebServlet("/auth/valideCommandeClient")
public class ValiderCommandeCLient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValiderCommandeCLient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id_commande = (String) request.getParameter("id_commande_encours");
		Long id = Long.parseLong(id_commande);
		Commande c = DaoFactory.getDaoFactory().getCommandeDao().findCommandeById(id);
		c.setEtatCommande(2);
		DaoFactory.getDaoFactory().getCommandeDao().updateCommande(c);
		response.sendRedirect(request.getContextPath() + "/auth/traiterCommande");
	}

}
