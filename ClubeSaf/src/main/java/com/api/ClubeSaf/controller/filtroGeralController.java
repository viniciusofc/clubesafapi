package com.api.ClubeSaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ClubeSaf.model.filtroGeral;
import com.api.ClubeSaf.model.segmento;
import com.api.ClubeSaf.service.filtroGeralService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/geral")
public class filtroGeralController {

	@Autowired
	private filtroGeralService filtroGeralservice;
	
	@GetMapping("/lista/{id}")
	public ResponseEntity<Object> listaSegmentosAll(@PathVariable Long id){
		List<filtroGeral> result = filtroGeralservice.filtrarSegmentosAll(id);
		return ResponseEntity.ok(result);
	}
}
