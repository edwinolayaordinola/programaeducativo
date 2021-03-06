package com.progeduc.service;

import com.progeduc.dto.EvaluacionRubricaQuestionarioDto;
import com.progeduc.model.Evaluacion;

public interface IEvaluacionService extends ICRUD<Evaluacion,Integer>{
	
	Integer saveEvalRubQuest(EvaluacionRubricaQuestionarioDto dto);
	
	int updateestado(Integer id, Integer estado);
	
	Integer updateEvalRubQuest(EvaluacionRubricaQuestionarioDto dto);
	
	Evaluacion getPorAnio(Integer anio);
	
	Evaluacion getPorAnioCategoriaNivelparticipacion(Integer anio,Integer idcategoria,Integer idnivelparticipacion);
	
	Evaluacion getPorAnioNivelparticipacionCategoria(Integer anio,Integer nivelparticipacion,Integer idcategoria);
	
	Evaluacion existe(Integer id_evaluacion,Integer anio,Integer categoria, Integer nivel_participacion);
}
