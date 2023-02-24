package com.api.ClubeSaf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.ClubeSaf.model.filtroGeral;
import com.api.ClubeSaf.model.segmento;

public interface filtroGeralRepository extends JpaRepository<filtroGeral, Long>{
	
	@Query(value = "select parceiro as label from gr_parceiros where excluido=false and id_empresa=?1 GROUP BY parceiro union all select s.segmento as label from gr_parceiros p,gr_segmentos s where s.id_segmento=p.id_segmento and p.excluido=false and id_empresa=?1 GROUP BY s.segmento order by label ", nativeQuery = true)
	 public List<filtroGeral> findByListaAll(Long IdEmpresa);
}
