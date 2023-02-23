package com.api.ClubeSaf.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.api.ClubeSaf.model.empresa;


public interface empresaRepository extends JpaRepository<empresa, Long>{

	@Query(value = "SELECT empresa as label, id_empresa as id from gr_empresas order by id ASC", nativeQuery = true)
	 public List<empresa> findByLista();
}
