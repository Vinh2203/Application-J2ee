package com.suptrip.dao;

import java.util.List;

import com.suptrip.model.Transport;

public interface TransportDao {

	public Transport addTransport(Transport Transport);

	public Transport findTransportById(Long id);

	public List<Transport> getAllTransport();

	public void updateTransport(Transport Transport);

	public void removeTransport(Transport Transport);
}
