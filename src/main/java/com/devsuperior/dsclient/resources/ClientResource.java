package com.devsuperior.dsclient.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsclient.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<Client> findAll() {
		Client c = new Client(1L, "Maria", "1061589922", 2500.0, null, null);
		return ResponseEntity.ok().body(c);
	}
}
