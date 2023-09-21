package com.cibertec.QuickSale.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCustomer;
	private String fullName;
	private String Dni;
	private int edad;
	private String email;
	private String password;
	private String status;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Event", referencedColumnName = "idEvent")
	private Event event;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_DetailsEvents", referencedColumnName = "idDetailsEvents")
	private DetailsEvents detailsevent;
	
}
