package com.suptrip.servlet;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.suptrip.dao.DaoFactory;
import com.suptrip.model.Campus;

import com.suptrip.model.Trip;
import com.suptrip.model.User;
import com.suptrip.restful.RestClient;

/*
 * Controller qui s'execute quand on est � la racine du contexte, donc au lancement de l'application (http://localhost:port/suptrip/)
 * Chemin a pr�ciser dans le fichier web.xml
 * 
 */

@WebServlet("/home")
public class RootServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RootServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	List<Campus> listCampus = DaoFactory.getDaoFactory().getCampusDao().getAllCampus();
    	request.getSession().setAttribute("listCampus", listCampus);
    	
    	// Set de la liste dans la requete pour l'utiliser dans la vue.
    	List<User> listUser = DaoFactory.getDaoFactory().getUserDao().getAllUser();
    	List<Trip> listTrip =  DaoFactory.getDaoFactory().getTripDao().getAllTrip();
    
		RestClient rc = new RestClient();
		List<Trip> list = rc.getTrips();
	
		request.getSession().setAttribute("liste_trip_order",list);
		request.getSession().setAttribute("number_user",listUser.size());
		request.getSession().setAttribute("number_trip",listTrip.size());
		RequestDispatcher rd = request.getRequestDispatcher("/front/index.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

}
