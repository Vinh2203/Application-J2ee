package com.suptrip.restful;

import java.util.ArrayList;
import java.util.List;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.suptrip.model.Trip;

public class RestClient {
	protected Client client;

	protected WebResource webResource;

	public RestClient() {
		ClientConfig clientConfig = new DefaultClientConfig();
		
		client = Client.create(clientConfig);
		webResource = client.resource("http://localhost:8080/SupTrip/rest/listTrip");
	}

	public List<Trip> getTrips() {
		List<Trip> list = new ArrayList<Trip>();

		list = webResource.accept("application/json").get(new GenericType<List<Trip>>() {
		});
		return list;
	}
	
	public List<Trip> getTripsByCampus(Long id_campus) {
		List<Trip> list = new ArrayList<Trip>(); 
		List<Trip> list_trip = getTrips();
		if(id_campus == null){
			 list = list_trip;
		}else{
			for(Trip trip : list_trip){
				if(trip.getCampus().getIdCampus().equals(id_campus)){
					list.add(trip);
				}
			}
		}	
		
		return list;
	}

}