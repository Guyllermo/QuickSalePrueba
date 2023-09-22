package com.cibertec.QuickSale.model;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detailsevents")
public class DetailsEvents {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDetailsEvents;
	
	private String description;
	private String title;
	private String importante;
	private String link;
	private String comentarios;
	private String urlImageRef;
	private String status;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_Event", referencedColumnName = "idEvent")
	private Event event;
	
}
