package com.progeduc.service;

import com.progeduc.model.Postulacionconcurso;

public interface IPostulacionconcursoService extends ICRUD<Postulacionconcurso,Integer>{
	
	Postulacionconcurso getById(Integer programaeducativoid);
}
