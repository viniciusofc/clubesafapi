package com.api.ClubeSaf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.ClubeSaf.model.cidade;
import com.api.ClubeSaf.model.filtroParceiros;

public interface filtroParceirosRepository extends JpaRepository<filtroParceiros, Long>{

	@Query(value = "select * from gr_parceiros par,gr_segmentos seg where  par.id_segmento=seg.id_segmento and par.id_empresa= ?1 and par.cidade= ?2 and par.id_segmento= ?3 ", nativeQuery = true)
	 public List<filtroParceiros> findByListaAllParceiros(Long idEmp, String cidade, Long idSeg);
	 
	 @Query(value = "select * from gr_parceiros par,gr_empresas emp,gr_cidades cid,gr_segmentos seg,zr_cepbr_cidades cidz\r\n"
	 		+ " where par.id_empresa=emp.id_empresa and par.id_cidade=cid.id_cidade and par.id_segmento=seg.id_segmento and cidz.id_cidade=cid.c_cidade and emp.id_empresa=?1 and upper(par.parceiro) like (%?2%) or\r\n"
	 		+ " par.id_empresa=emp.id_empresa and par.id_cidade=cid.id_cidade and par.id_segmento=seg.id_segmento and  cidz.id_cidade=cid.c_cidade and emp.id_empresa=?1 and upper(seg.segmento) like (%?2%) or \r\n"
	 		+ " par.id_empresa=emp.id_empresa and par.id_cidade=cid.id_cidade and par.id_segmento=seg.id_segmento and  cidz.id_cidade=cid.c_cidade and emp.id_empresa=?1 and upper(cidz.cidade) like (%?2%) ", nativeQuery = true)
		 public List<filtroParceiros> findByFiltroGeralParceiros(Long idEmp, String param);
}
