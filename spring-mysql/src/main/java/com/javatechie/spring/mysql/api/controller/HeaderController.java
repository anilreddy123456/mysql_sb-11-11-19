package com.javatechie.spring.mysql.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.mysql.api.dao.HeaderDao;
import com.javatechie.spring.mysql.api.model.POHeader;

@RestController
@RequestMapping("/api")
public class HeaderController {
	@Autowired
	private HeaderDao dao;

	@PostMapping("/save")
	public String create(@RequestBody List<POHeader> tickets) {
		dao.saveAll(tickets);
		System.out.println(tickets.toString());
		return "ticket booked : " + tickets.size();
	}

	@GetMapping("/getall")
	public List<POHeader> getTickets() {
		return (List<POHeader>) dao.findAll();
	}

}
