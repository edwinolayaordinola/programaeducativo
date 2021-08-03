package com.progeduc.repo;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.progeduc.model.Rubrica;

@Repository
@Transactional(readOnly = true)
public interface IRubricaRepo extends CrudRepository<Rubrica,Integer>{
	
	@Transactional
	@Modifying	
	@Query("update Rubrica p set p.estado = ?2 WHERE p.id = ?1")
	int updateestado(@Param("id") Integer id, @Param("estado") Integer estado);
	
}
