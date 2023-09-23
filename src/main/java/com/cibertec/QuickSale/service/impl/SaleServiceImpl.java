package com.cibertec.QuickSale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.QuickSale.model.Sale;
import com.cibertec.QuickSale.repo.ISaleRepo;
import com.cibertec.QuickSale.servic.ISaleService;

@Service
public class SaleServiceImpl implements ISaleService {

	@Autowired
	ISaleRepo repo;
	
	@Override
	public Sale registrar(Sale s) {
		return repo.save(s);
	}

	@Override
	public Sale modificar(Sale s) {
		return repo.save(s);
	}

	@Override
	public List<Sale> listar() {
		return repo.findAll();
	}

	@Override
	public Sale listarPorId(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
}
