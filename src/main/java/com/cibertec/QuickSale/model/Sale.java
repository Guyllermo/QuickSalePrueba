package com.cibertec.QuickSale.model;

import java.sql.Date;

public class Sale {

	private long idSale;
	private long idPayment;
	private long idCustomer;
	private long idEvent;
	private Date saleDate;
	private String operationNumber;
	private double total;
	private int Quantity;
	private String status;
}
