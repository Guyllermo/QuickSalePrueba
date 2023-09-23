package com.cibertec.QuickSale.servic;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cibertec.QuickSale.model.Event;

@Service
public interface IEventService {

	Event registrar(Event e);
	Event modificar(Event e);
	List<Event> listar();
	Event listarPorId(Integer id);
	void eliminar(Integer id);
}
