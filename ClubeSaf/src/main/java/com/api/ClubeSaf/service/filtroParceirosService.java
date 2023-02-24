package com.api.ClubeSaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ClubeSaf.model.filtroParceiros;
import com.api.ClubeSaf.model.parceiros;
import com.api.ClubeSaf.repository.filtroParceirosRepository;

@Service
public class filtroParceirosService {

	@Autowired
	private filtroParceirosRepository FiltroParceirosepository;
	
	public List<filtroParceiros> ParceirosFiltro(Long idEmp, String cidade, Long idSeg) {
		List<filtroParceiros> result = FiltroParceirosepository.findByListaAllParceiros(idEmp, cidade, idSeg);
		if (result != null) {
			return result;
		} else {
			return null;
		}
	}
	
	public List<filtroParceiros> ParceirosFiltroGeral(Long idEmp, String param) {
		List<filtroParceiros> result = FiltroParceirosepository.findByFiltroGeralParceiros(idEmp, param);
		if (result != null) {
			return result;
		} else {
			return null;
		}
	}
}
