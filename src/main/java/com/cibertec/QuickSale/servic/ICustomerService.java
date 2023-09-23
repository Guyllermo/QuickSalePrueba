package com.cibertec.QuickSale.servic;

import java.util.List;

import com.cibertec.QuickSale.model.Customer;

public interface ICustomerService {

	Customer registrar(Customer cu);
	Customer modificar(Customer cu);
	List<Customer> listar();
	Customer listarPorId(Integer id);
	void eliminar(Integer id);
}
