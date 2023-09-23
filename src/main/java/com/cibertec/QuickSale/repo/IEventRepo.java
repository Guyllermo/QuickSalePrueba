package com.cibertec.QuickSale.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.QuickSale.model.Event;

public interface IEventRepo extends JpaRepository<Event, Integer>{

}
