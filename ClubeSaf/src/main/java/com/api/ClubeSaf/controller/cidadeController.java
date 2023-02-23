package com.api.ClubeSaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.ClubeSaf.model.cidade;
import com.api.ClubeSaf.service.cidadeService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/cidades")
public class cidadeController {

	@Autowired
	private cidadeService cidadeservice;
	
	@GetMapping("/listar/{idPlano}")
	public ResponseEntity<Object> listaCidades(@PathVariable Long idPlano){
		List<cidade> result = cidadeservice.filtrarCidades(idPlano);
		return ResponseEntity.ok(result);
	}
}
