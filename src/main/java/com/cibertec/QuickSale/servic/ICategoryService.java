package com.cibertec.QuickSale.servic;

import java.util.List;


import com.cibertec.QuickSale.model.Category;

public interface ICategoryService {

	Category registrar(Category c);
	Category modificar(Category c);
	List<Category> listar();
	Category listarPorId(Integer id);
	void eliminar(Integer id);
}
