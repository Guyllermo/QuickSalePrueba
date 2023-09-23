package com.cibertec.QuickSale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.QuickSale.model.DetailsEvents;
import com.cibertec.QuickSale.repo.IDetailsEventsRepo;
import com.cibertec.QuickSale.servic.IDetailsEventsService;

@Service
public class DetailsEventsServiceImpl implements IDetailsEventsService{
	
	@Autowired
	IDetailsEventsRepo repo;

	@Override
	public DetailsEvents registrar(DetailsEvents de) {
		return repo.save(de);
	}

	@Override
	public DetailsEvents modificar(DetailsEvents de) {
		return repo.save(de);
	}

	@Override
	public List<DetailsEvents> listar() {
		return repo.findAll();
	}

	@Override
	public DetailsEvents listarPorId(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
}
