package com.javatechie.spring.mysql.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.javatechie.spring.mysql.api.model.POHeader;

public interface HeaderDao extends JpaRepository<POHeader, Long>{

}
