package com.api.ClubeSaf.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.api.ClubeSaf.model.cidade;

public interface cidadeRepository extends JpaRepository<cidade, Long>{
	
	@Query(value = "select cid.id_cidade,zcid.cidade from gr_cidades cid,gr_parceiros par,zr_cepbr_cidades zcid where zcid.id_cidade=cid.c_cidade and par.id_cidade=cid.id_cidade and par.id_empresa = ?1 group by cid.id_cidade,zcid.cidade", nativeQuery = true)
	 public List<cidade> findByLista(Long idPlano);
}
