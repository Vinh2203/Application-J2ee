package com.suptrip.servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suptrip.dao.DaoFactory;
import com.suptrip.model.Campus;
import com.suptrip.model.Option;
import com.suptrip.model.Transport;
import com.suptrip.model.Trip;
import com.suptrip.model.TypeTransport;
import com.suptrip.model.Ville;

/**
 * Servlet implementation class ModifierDonner
 */
@WebServlet("/auth/modifierDonne")
public class ModifierDonner extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ModifierDonner() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		RequestDispatcher rd = request.getRequestDispatcher("/front/modifierDonner.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String result = (String) request.getParameter("campus");
		String id_campus = (String) request.getParameter("id_campus");
		String id_ville = (String) request.getParameter("id_ville");
		String id_type = (String) request.getParameter("id_type");
		String id_trip = (String) request.getParameter("id_trip");
		
		List<Ville> list_ville = DaoFactory.getDaoFactory().getVilleDao().getAllVille();
		List<TypeTransport> list_type = DaoFactory.getDaoFactory().getTypeTransportDao().getAllTypeTransport();
		List<Campus> list_campus = DaoFactory.getDaoFactory().getCampusDao().getAllCampus();
		List<Trip> list_trip = DaoFactory.getDaoFactory().getTripDao().getAllTrip();

		request.setAttribute("list_campus", list_campus);
		request.setAttribute("list_ville", list_ville);
		request.setAttribute("list_type", list_type);
		request.setAttribute("list_trip", list_trip);
		if(result != null){
			if (result.equals("Ville")) {
				request.getSession().setAttribute("test_ville", true);
				request.getSession().removeAttribute("test_campus");
				request.getSession().removeAttribute("test_type");
				request.getSession().removeAttribute("test_trip");
	
			}
	
			if (result.equals("Type Transport")) {
				request.getSession().setAttribute("test_type", true);
				request.getSession().removeAttribute("test_campus");
				request.getSession().removeAttribute("test_ville");
				request.getSession().removeAttribute("test_trip");
			}
	
			if (result.equals("Campus")) {
				request.getSession().setAttribute("test_campus", true);
				request.getSession().removeAttribute("test_ville");
				request.getSession().removeAttribute("test_type");
				request.getSession().removeAttribute("test_trip");
			}
			if (result.equals("Tour voyage")) {
				request.getSession().setAttribute("test_trip", true);
				request.getSession().removeAttribute("test_campus");
				request.getSession().removeAttribute("test_type");
				request.getSession().removeAttribute("test_ville");
			}
		}

		if (id_campus != null) {
			Long id = Long.parseLong(id_campus);
			Campus campus = DaoFactory.getDaoFactory().getCampusDao().findCampusById(id);
			String nom_campus = (String) request.getParameter("nom_campus");
			String ville = (String) request.getParameter("ville");
			Long ville_new = Long.parseLong(ville);
			Ville v = DaoFactory.getDaoFactory().getVilleDao().findVilleById(ville_new);
			campus.setName(nom_campus);
			campus.setVille(v);
			DaoFactory.getDaoFactory().getCampusDao().updateCampus(campus);
			request.setAttribute("changerment", true);
			list_campus = DaoFactory.getDaoFactory().getCampusDao().getAllCampus();
			request.setAttribute("list_campus", list_campus);
			
		}

		if (id_ville != null) {
			Long id = Long.parseLong(id_ville);
			Ville v = DaoFactory.getDaoFactory().getVilleDao().findVilleById(id);
			String nom_ville = (String) request.getParameter("nom_ville");
			String nom_pays = (String) request.getParameter("nom_pays");
			v.setNomVille(nom_ville);
			v.setPays(nom_pays);
			DaoFactory.getDaoFactory().getVilleDao().updateVille(v);
			request.setAttribute("changerment", true);
			 list_ville = DaoFactory.getDaoFactory().getVilleDao().getAllVille();
			 request.setAttribute("list_ville", list_ville);
		}

		if (id_type != null) {
			Long id = Long.parseLong(id_type);
			TypeTransport t = DaoFactory.getDaoFactory().getTypeTransportDao().findTypeTransportById(id);
			String type = (String) request.getParameter("type");
			t.setType(type);
			DaoFactory.getDaoFactory().getTypeTransportDao().updateTypeTransport(t);
			request.setAttribute("changerment", true);
			list_type = DaoFactory.getDaoFactory().getTypeTransportDao().getAllTypeTransport();
			request.setAttribute("list_type", list_type);
		}

		if (id_trip != null) {
			Long id = Long.parseLong(id_trip);
			String id_option = (String) request.getParameter("id_option");
			Long option = Long.parseLong(id_option);
			Option o = DaoFactory.getDaoFactory().getOptionDao().findOptionById(option);
			Trip t = DaoFactory.getDaoFactory().getTripDao().findTripById(id);
			String id_transport = (String) request.getParameter("id_transport");
			Long transport = Long.parseLong(id_transport);
			Transport r = DaoFactory.getDaoFactory().getTransportDao().findTransportById(transport);
			
			String date_dept = (String) request.getParameter("date_dept");
			String date_retour = (String) request.getParameter("date_retour");
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date date;
			try {
				date = (Date) formatter.parse(date_dept);
				r.setDateDept(date);
				date = (Date) formatter.parse(date_retour);
				r.setDateRetour(date);

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String ville = (String) request.getParameter("ville_dept");
			Long l = Long.parseLong(ville);
			Ville v = DaoFactory.getDaoFactory().getVilleDao().findVilleById(l);
			r.setVille_dept(v);
			ville = (String) request.getParameter("ville_arrive");
			l = Long.parseLong(ville);
			v = DaoFactory.getDaoFactory().getVilleDao().findVilleById(l);
			r.setVille_arrive(v);
			String campus = (String) request.getParameter("campus");
			id = Long.parseLong(campus);
			Campus c = DaoFactory.getDaoFactory().getCampusDao().findCampusById(id);
			o.setTransport(r);
			t.setCampus(c);
			t.setOption(o);
			DaoFactory.getDaoFactory().getTransportDao().updateTransport(r);;
			DaoFactory.getDaoFactory().getOptionDao().updateOption(o);
			DaoFactory.getDaoFactory().getTripDao().updateTrip(t);
			request.setAttribute("changerment", true);
			list_trip = DaoFactory.getDaoFactory().getTripDao().getAllTrip();
			request.setAttribute("list_trip", list_trip);
		}

		request.setAttribute("name_search", result);
		RequestDispatcher rd = request.getRequestDispatcher("/front/modifierDonner.jsp");
		rd.forward(request, response);
	}

}
