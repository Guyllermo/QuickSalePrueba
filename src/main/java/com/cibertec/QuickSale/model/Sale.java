package com.cibertec.QuickSale.model;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "sale")
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSale;
	
	private Date saleDate;
	private String operationNumber;
	private double total;
	private int Quantity;
	private String status;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_event", referencedColumnName = "idEvent")
	private Event event;
	
}
