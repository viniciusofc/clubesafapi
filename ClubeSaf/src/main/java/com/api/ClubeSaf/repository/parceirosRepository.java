package com.api.ClubeSaf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.ClubeSaf.model.filtroParceiros;
import com.api.ClubeSaf.model.parceiros;

public interface parceirosRepository extends JpaRepository<parceiros, Long>{
	@Query(value = "SELECT parceiro as label, id_parceiro as id from gr_parceiros order by parceiro ASC", nativeQuery = true)
	public List<parceiros> findByListaAllParceiros();
	
}
