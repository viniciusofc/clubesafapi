package com.api.ClubeSaf.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.api.ClubeSaf.model.cidade;

public interface cidadeRepository extends JpaRepository<cidade, Long>{
	
	@Query(value = "select ROW_NUMBER() OVER (ORDER BY 0) AS id, UPPER(cidade) as cidade from gr_parceiros where id_empresa = ?1 group by cidade order by cidade ASC", nativeQuery = true)
	 public List<cidade> findByLista(Long idPlano);
}
