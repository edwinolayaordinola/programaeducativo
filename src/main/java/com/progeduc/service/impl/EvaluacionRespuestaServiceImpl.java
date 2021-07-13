package com.progeduc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progeduc.dto.EvaluacionRubricaQuestionarioDto;
import com.progeduc.model.Evaluacion;
import com.progeduc.model.EvaluacionResultado;
import com.progeduc.model.UsuarioAlianza;
import com.progeduc.repo.IEvaluacionQuestionarioRepo;
import com.progeduc.repo.IEvaluacionRepo;
import com.progeduc.repo.IEvaluacionRespuestaRepo;
import com.progeduc.repo.IEvaluacionRubricaRepo;
import com.progeduc.repo.IQuestionarioRepo;
import com.progeduc.repo.IQuestionarioRespuestaRepo;
import com.progeduc.repo.IRubricaRepo;
import com.progeduc.service.IEvaluacionRespuestaService;
import com.progeduc.service.IEvaluacionService;

@Service
public class EvaluacionRespuestaServiceImpl implements IEvaluacionRespuestaService{
	
	@Autowired
	IEvaluacionRespuestaRepo evaRepo;

	@Override
	public EvaluacionResultado registrar(EvaluacionResultado obj) {
		// TODO Auto-generated method stub
		return evaRepo.save(obj);
	}

	@Override
	public EvaluacionResultado modificar(EvaluacionResultado obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EvaluacionResultado> listar() {
		return (List<EvaluacionResultado>) evaRepo.findAll();
	}

	@Override
	public EvaluacionResultado ListarporId(Integer id) {
		Optional<EvaluacionResultado> optionalEntity =  evaRepo.findById(id);
		if(optionalEntity.isPresent()) {
			return optionalEntity.get();
		}else {
			return null;
		}
	}

	@Override
	public boolean Eliminar(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
}