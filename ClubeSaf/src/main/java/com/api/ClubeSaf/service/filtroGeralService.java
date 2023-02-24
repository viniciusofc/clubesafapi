package com.api.ClubeSaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ClubeSaf.model.filtroGeral;
import com.api.ClubeSaf.model.segmento;
import com.api.ClubeSaf.repository.filtroGeralRepository;

@Service
public class filtroGeralService {

	@Autowired
	private filtroGeralRepository filtroGeralrepository;
	
	public List<filtroGeral> filtrarSegmentosAll(Long IdEmpresa){
		List<filtroGeral> result = filtroGeralrepository.findByListaAll(IdEmpresa);
		if ( result != null) {
			return result;
		} else {
			return null;
		}
	}
}
