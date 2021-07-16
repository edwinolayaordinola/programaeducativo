package com.progeduc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progeduc.model.TrabajosfinalesUsuarioAlianza;
import com.progeduc.repo.ITrabajosfinalesUsuarioAlianzaRepo;
import com.progeduc.service.ITrabajosfinales_UsuarioAlianzaService;

@Service
public class Trabajosfinales_UsuarioAlianzaServiceImpl implements ITrabajosfinales_UsuarioAlianzaService{
	
	@Autowired
	ITrabajosfinalesUsuarioAlianzaRepo trabajosfinalesUsuarioAlianzaRepo;
	
	@Override
	public Integer guardar(Integer trabajosfinalesid, Integer usuarioalianzaid) {
		return trabajosfinalesUsuarioAlianzaRepo.guardar(trabajosfinalesid, usuarioalianzaid);
	}

	@Override
	public Integer eliminar(Integer trabajosfinalesid) {
		return trabajosfinalesUsuarioAlianzaRepo.eliminar(trabajosfinalesid);
	}

	@Override
	public List<TrabajosfinalesUsuarioAlianza> listarByTrabajosfinalesId(Integer trabajofinalid) {
		return trabajosfinalesUsuarioAlianzaRepo.listarByTrabajosfinalesId(trabajofinalid);
	}
	
	@Override
	public List<TrabajosfinalesUsuarioAlianza> listarAll(){
		return trabajosfinalesUsuarioAlianzaRepo.listarAll();
	}
	
	@Override
	public TrabajosfinalesUsuarioAlianza buscar(Integer trabajofinalid, Integer usuarioalianzaid) {
		return trabajosfinalesUsuarioAlianzaRepo.buscar(trabajofinalid, usuarioalianzaid);
	}

}
