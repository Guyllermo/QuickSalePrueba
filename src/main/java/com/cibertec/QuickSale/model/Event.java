package com.cibertec.QuickSale.model;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "event")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEvent;
	private String title;
	private String description;
	private Date dateEvent;
	private String image;
	private String Place;
	private int ticketsQuantity;
	private double unitPrice;
	private String status;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Sale", referencedColumnName = "idSale")
	private Sale sale;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Customer", referencedColumnName = "idCustomer")
	private Customer customer;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Category", referencedColumnName = "idCategory")
	private Category category;
	
}
