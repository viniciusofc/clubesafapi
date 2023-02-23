package com.api.ClubeSaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.ClubeSaf.model.cidade;
import com.api.ClubeSaf.repository.cidadeRepository;

@Service
public class cidadeService {

	@Autowired
	private cidadeRepository cidaderepository;
	
	public List<cidade> filtrarCidades(Long idPlano){
		List<cidade> result = cidaderepository.findByLista(idPlano);
		if ( result != null) {
			return result;
		} else {
			return null;
		}
	}
}
