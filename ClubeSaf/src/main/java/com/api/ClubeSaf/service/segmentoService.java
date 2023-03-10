package com.api.ClubeSaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.ClubeSaf.model.segmento;
import com.api.ClubeSaf.repository.segmentoRepository;

@Service
public class segmentoService {

	@Autowired
	private segmentoRepository segmentorepository;
	
	public List<segmento> filtrarSegmentos(Long idPlano, String cidade){
		List<segmento> result = segmentorepository.findByLista(idPlano, cidade);
		if ( result != null) {
			return result;
		} else {
			return null;
		}
	}
	
	
}
