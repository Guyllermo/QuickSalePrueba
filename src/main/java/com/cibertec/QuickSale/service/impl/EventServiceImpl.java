package com.cibertec.QuickSale.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.QuickSale.model.Event;
import com.cibertec.QuickSale.repo.IEventRepo;
import com.cibertec.QuickSale.servic.IEventService;

@Service
public class EventServiceImpl implements IEventService {

	@Autowired
	IEventRepo repo;
	
	@Override
	public Event registrar(Event e) {
		return repo.save(e);
	}

	@Override
	public Event modificar(Event e) {
		return repo.save(e);
	}

	@Override
	public List<Event> listar() {
		return repo.findAll();
	}

	@Override
	public Event listarPorId(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

}
