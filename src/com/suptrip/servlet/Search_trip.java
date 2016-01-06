package com.suptrip.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suptrip.model.Campus;
import com.suptrip.model.Trip;
import com.suptrip.restful.RestClient;

/**
 * Servlet implementation class Search_trip
 */
@WebServlet("/search_trip")
public class Search_trip extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search_trip() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String campus = (String) request.getParameter("campus");
		@SuppressWarnings("unchecked")
		List<Campus> l_c  =  (List<Campus>) request.getSession().getAttribute("listCampus");
		Campus c = new Campus();
		
		for(Campus test : l_c){
			if(test.getName().equals(campus)){
				c = test;
				break;
			}
		}
		
		RestClient rc = new RestClient();
		List<Trip> list = rc.getTripsByCampus(c.getIdCampus());
		request.setAttribute("name_campus",campus);
		request.setAttribute("liste_trip_order",list);
		RequestDispatcher rd = request.getRequestDispatcher("/front/index.jsp");
		rd.forward(request, response);
	}

}
