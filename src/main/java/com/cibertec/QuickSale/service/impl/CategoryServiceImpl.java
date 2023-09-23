package com.cibertec.QuickSale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.QuickSale.model.Category;
import com.cibertec.QuickSale.repo.ICategoryRepo;
import com.cibertec.QuickSale.servic.ICategoryService;

@Service
public class CategoryServiceImpl implements ICategoryService {

	@Autowired
	ICategoryRepo repo;
	
	@Override
	public Category registrar(Category c) {
		return repo.save(c);
	}

	@Override
	public Category modificar(Category c) {
		return repo.save(c);
	}

	@Override
	public List<Category> listar() {
		return repo.findAll();
	}

	@Override
	public Category listarPorId(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

}
