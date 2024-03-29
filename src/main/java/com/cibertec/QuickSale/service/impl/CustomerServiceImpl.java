package com.cibertec.QuickSale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.QuickSale.model.Customer;
import com.cibertec.QuickSale.repo.ICustomerRepo;
import com.cibertec.QuickSale.servic.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerRepo repo;

	@Override
	public Customer registrar(Customer cu) {
		return repo.save(cu);
	}

	@Override
	public Customer modificar(Customer cu) {
		return repo.save(cu);
	}

	@Override
	public List<Customer> listar() {
		return repo.findAll();
	}

	@Override
	public Customer listarPorId(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
	
	

}
