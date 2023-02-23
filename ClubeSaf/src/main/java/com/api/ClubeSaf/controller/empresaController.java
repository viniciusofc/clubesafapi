package com.api.ClubeSaf.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.ClubeSaf.model.empresa;
import com.api.ClubeSaf.service.empresaService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/empresas")
public class empresaController {

	
	@Autowired
	private empresaService empresaservice;

	@GetMapping("/listar")
	public ResponseEntity<Object> listaAllEmpresas(){
		List<empresa> result = empresaservice.filtrarEmpresasAll();
		return ResponseEntity.ok(result);
	}
		
	
}
