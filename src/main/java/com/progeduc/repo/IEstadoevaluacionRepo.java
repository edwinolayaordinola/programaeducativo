package com.progeduc.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.progeduc.model.Estadoevaluacion;

@Repository
public interface IEstadoevaluacionRepo extends CrudRepository<Estadoevaluacion,Integer>{

}
