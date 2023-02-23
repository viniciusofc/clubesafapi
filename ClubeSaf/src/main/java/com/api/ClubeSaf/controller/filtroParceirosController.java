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
import com.api.ClubeSaf.model.filtroParceiros;
import com.api.ClubeSaf.service.filtroParceirosService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/filtroParceiros")
public class filtroParceirosController {

	@Autowired
	private filtroParceirosService  FiltroParceirosService;
	
	@GetMapping("/listar/{idEmp}/{idCid}/{idSeg}")
	public ResponseEntity<Object> listaResultFiltroParceiros(@PathVariable Long idEmp, @PathVariable Long idCid, @PathVariable Long idSeg){
		List<filtroParceiros> result = FiltroParceirosService.ParceirosFiltro(idEmp, idCid, idSeg);
		return ResponseEntity.ok(result);
	}
}
