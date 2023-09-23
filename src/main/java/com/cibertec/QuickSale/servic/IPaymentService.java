package com.cibertec.QuickSale.servic;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cibertec.QuickSale.model.Payment;

@Service
public interface IPaymentService {

	Payment registrar(Payment p);
	Payment modificar(Payment p);
	List<Payment> listar();
	Payment listarPorId(Integer id);
	void eliminar(Integer id);
}

