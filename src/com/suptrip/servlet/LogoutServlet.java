package com.suptrip.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;    

    public LogoutServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// On recupere l'objet session et on supprime l'attribut userNameSession puis on redirige l'utilisateur vers la racine du site.
	
		request.getSession().removeAttribute("test");
		
		request.removeAttribute("liste_commande");
		request.removeAttribute("liste_trip");
		request.removeAttribute("number_trip_order");
		response.sendRedirect(request.getContextPath() + "/home");	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

}
