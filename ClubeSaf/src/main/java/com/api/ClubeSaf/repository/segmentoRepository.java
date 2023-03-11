package com.api.ClubeSaf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.api.ClubeSaf.model.segmento;

public interface segmentoRepository extends JpaRepository<segmento, Long> {
	
	@Query(value = "select seg.id_segmento, UPPER(seg.segmento) segmento from gr_segmentos seg,gr_parceiros par where par.id_segmento=seg.id_segmento and par.id_empresa= ?1 and UPPER(par.cidade) = UPPER(?2) group by seg.id_segmento,seg.segmento order by seg.segmento ASC", nativeQuery = true)
	 public List<segmento> findByLista(Long idPlano, String cidade);

}
