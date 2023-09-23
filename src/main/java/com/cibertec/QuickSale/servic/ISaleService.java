package com.cibertec.QuickSale.servic;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cibertec.QuickSale.model.Sale;

@Service
public interface ISaleService {

	Sale registrar(Sale s);
	Sale modificar(Sale s);
	List<Sale> listar();
	Sale listarPorId(Integer id);
	void eliminar(Integer id);
}
