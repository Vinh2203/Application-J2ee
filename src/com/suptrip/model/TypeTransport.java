package com.suptrip.model;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "typetransport")
public class TypeTransport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_type_transport")
	private Long idType;

	@Column(name = "type_transport")
	private String type;

	public TypeTransport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TypeTransport(Long idType, String type) {
		super();
		this.idType = idType;
		this.type = type;
	}

	public Long getIdType() {
		return idType;
	}

	public void setIdType(Long idType) {
		this.idType = idType;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
