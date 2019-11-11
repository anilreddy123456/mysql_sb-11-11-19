package com.javatechie.spring.mysql.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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


	@PutMapping("/header/{id}")
	public ResponseEntity<POHeader> updateEmployee(@PathVariable(value = "id") Long headerId,
			@Valid @RequestBody POHeader headerDetails) throws ResourceNotFoundException {
		POHeader header = dao.findById(headerId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + headerId));

		header.setpONumber(headerDetails.getpONumber());
		header.setLogicalSystem(headerDetails.getLogicalSystem());
		header.setCurrency(headerDetails.getCurrency());
		header.setIncoTerms(headerDetails.getIncoTerms());
		header.setPaymentTerms(headerDetails.getPaymentTerms());
		header.setpOCreatedBy(headerDetails.getpOCreatedBy());
		header.setPoDate(headerDetails.getPoDate());
		header.setVendorID(headerDetails.getVendorID());
		header.setpOType(headerDetails.getpOType());
		
		final POHeader updatedHeader = dao.save(header);
		return ResponseEntity.ok(updatedHeader);
	}
}
