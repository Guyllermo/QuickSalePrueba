package com.cibertec.QuickSale.servic;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cibertec.QuickSale.model.DetailsEvents;

@Service
public interface IDetailsEventsService {

	DetailsEvents registrar(DetailsEvents de);
	DetailsEvents modificar(DetailsEvents de);
	List<DetailsEvents> listar();
	DetailsEvents listarPorId(Integer id);
	void eliminar(Integer id);
}
