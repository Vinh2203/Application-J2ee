package com.suptrip.restful;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.suptrip.model.Trip;

@Path("/listTrip")
public class ListTrip {

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Trip> getListTripByCampis(){
		List<Trip> list = Trip.getListTrip();
		return list;
	}
}
