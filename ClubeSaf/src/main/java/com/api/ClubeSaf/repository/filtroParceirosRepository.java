package com.api.ClubeSaf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.ClubeSaf.model.cidade;
import com.api.ClubeSaf.model.filtroParceiros;

public interface filtroParceirosRepository extends JpaRepository<filtroParceiros, Long>{

	@Query(value = "select * from gr_parceiros par,gr_segmentos seg,gr_cidades cid,zr_cepbr_cidades zcid where zcid.id_cidade=cid.c_cidade and par.id_cidade=cid.id_cidade and \r\n"
			+ "par.id_segmento=seg.id_segmento and par.id_empresa= ?1 and par.id_cidade=?2 and par.id_segmento=?3 ", nativeQuery = true)
	 public List<filtroParceiros> findByListaAllParceiros(Long idEmp, Long idCid, Long idSeg);
}
