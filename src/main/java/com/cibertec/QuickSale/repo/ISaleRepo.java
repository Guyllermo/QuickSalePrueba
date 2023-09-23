package com.cibertec.QuickSale.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.QuickSale.model.Sale;

public interface ISaleRepo extends JpaRepository<Sale, Integer> {

}
