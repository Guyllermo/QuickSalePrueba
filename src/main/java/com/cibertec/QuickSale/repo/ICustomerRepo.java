package com.cibertec.QuickSale.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.QuickSale.model.Customer;

public interface ICustomerRepo extends JpaRepository<Customer, Integer>{

}
