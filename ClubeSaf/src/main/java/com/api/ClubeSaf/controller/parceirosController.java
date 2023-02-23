package com.api.ClubeSaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ClubeSaf.model.filtroParceiros;
import com.api.ClubeSaf.model.parceiros;
import com.api.ClubeSaf.service.parceirosService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/parceiros")
public class parceirosController {

	@Autowired
	private parceirosService parceirosservice;
	

	@GetMapping("/listar")
	public ResponseEntity<Object> listaAllEmpresas(){
		List<parceiros> result = parceirosservice.filtrarParceirosAll();
		return ResponseEntity.ok(result);
	}

		
}
