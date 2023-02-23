package com.api.ClubeSaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.ClubeSaf.model.segmento;
import com.api.ClubeSaf.service.segmentoService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/segmentos")
public class segmentoController {

	@Autowired
	private segmentoService segmentoservice;
	
	@GetMapping("/listar/{idPlano}/{idCid}")
	public ResponseEntity<Object> listaSegmentos(@PathVariable Long idPlano, @PathVariable Long idCid){
		List<segmento> result = segmentoservice.filtrarSegmentos(idPlano, idCid);
		return ResponseEntity.ok(result);
	}
	
}
