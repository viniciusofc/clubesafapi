package com.api.ClubeSaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.ClubeSaf.model.filtroParceiros;
import com.api.ClubeSaf.model.parceiros;
import com.api.ClubeSaf.repository.parceirosRepository;

@Component
public class parceirosService  {

	@Autowired
	private parceirosRepository parceirosrepository;
	
	
	public List<parceiros> filtrarParceirosAll() {
		List<parceiros> result = parceirosrepository.findByListaAllParceiros();
		if (result != null) {
			return result;
		} else {
			return null;
		}
	}
	
}
