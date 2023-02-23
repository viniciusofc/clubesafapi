package com.api.ClubeSaf.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.api.ClubeSaf.model.empresa;
import com.api.ClubeSaf.repository.empresaRepository;

@Service
public class empresaService {

	@Autowired
	private empresaRepository empresarepository;
	
	public List<empresa> filtrarEmpresasAll() {
		List<empresa> result = empresarepository.findByLista();
		if ( result != null) {
			return result;
		} else {
			return null;
		}
	}
	
}
