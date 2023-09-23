package com.cibertec.QuickSale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.QuickSale.model.Payment;
import com.cibertec.QuickSale.repo.IPaymentRepo;
import com.cibertec.QuickSale.servic.IPaymentService;

@Service
public class PaymentServiceImpl implements IPaymentService {

	@Autowired
	IPaymentRepo repo;
	
	@Override
	public Payment registrar(Payment p) {
		return repo.save(p);
	}

	@Override
	public Payment modificar(Payment p) {
		return repo.save(p);
	}

	@Override
	public List<Payment> listar() {
		return repo.findAll();
	}

	@Override
	public Payment listarPorId(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

}
