package com.progeduc.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progeduc.dto.CategoriaModalidadByOds;
import com.progeduc.dto.TrabajosfinalesParticipanteDto;
import com.progeduc.model.Trabajosfinales;
import com.progeduc.repo.ITrabajosfinalesParticipanteRepo;
import com.progeduc.repo.ITrabajosfinalesRepo;
import com.progeduc.service.ITrabajosfinalesService;


@Service
public class TrabajosfinalesServiceImpl implements ITrabajosfinalesService{
	
	@Autowired
	ITrabajosfinalesRepo trabajosfinalesRepo;
	
	@Autowired
	ITrabajosfinalesParticipanteRepo trabajosfinalesparticipanteRepo;
	
	@Override
	public Trabajosfinales saveTrabajofinaParticipante(TrabajosfinalesParticipanteDto dto) {
		
		trabajosfinalesRepo.save(dto.getTrabajosfinales());		
		trabajosfinalesparticipanteRepo.eliminar(dto.getTrabajosfinales().getId());
		dto.getListaparticipante().forEach(partitipanteid->{
				trabajosfinalesparticipanteRepo.guardar(dto.getTrabajosfinales().getId(), partitipanteid.getId());
			}
		);
		return dto.getTrabajosfinales();
	}
	
	@Override
	public int updateestado(Integer id, Integer estado,Integer peid){
		return trabajosfinalesRepo.updateestado(id, estado,peid);
	}
	
	@Override
	public int updateenviado(Integer id, Integer estado, Integer peid){
		return trabajosfinalesRepo.updateenviado(id, estado,peid);
	}
	
	@Override
	public int updateEnviados(Integer estado, Integer id) {
		return trabajosfinalesRepo.updateEnviados(estado, id);
	}
	
	@Override
	public int updateEstadoTrabajo(Integer id,Integer estadoTrabajoId) {
		return trabajosfinalesRepo.updateEstadoTrabajo(id, estadoTrabajoId);
	}
	
	@Override
	public Integer maxNumeracion(Integer programaeducativoid) {
		return trabajosfinalesRepo.maxNumeracion(programaeducativoid);
	}
	
	@Override
	public List<Trabajosfinales> listarhabilitados(Integer programaeducativoid){
		return trabajosfinalesRepo.listarhabilitados(programaeducativoid);
	}
	
	@Override
	public List<Trabajosfinales> listarHabilitadosEnviado(Integer programaeducativoid){
		return trabajosfinalesRepo.listarHabilitadosEnviado(programaeducativoid);
	}
	
	
	@Override
	public List<Trabajosfinales> listarhabilitados(){
		return trabajosfinalesRepo.listarhabilitados();
	}
	
	@Override
	public List<Trabajosfinales> listarhabilitadosbyanio(Integer programaeducativoid,Integer anio){
		return trabajosfinalesRepo.listarhabilitadosbyanio(programaeducativoid,anio);
	}
	
	@Override
	public List<Trabajosfinales> listarHabilitadosEnviados(Integer programaeducativoid){
		return trabajosfinalesRepo.listarHabilitadosEnviados(programaeducativoid);
	}
	
	@Override
	public Trabajosfinales registrar(Trabajosfinales obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Trabajosfinales modificar(Trabajosfinales obj) {
		// TODO Auto-generated method stub
		return trabajosfinalesRepo.save(obj);
	}

	@Override
	public List<Trabajosfinales> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Integer getNumeracion(Integer trabajofinalid) {
		return trabajosfinalesRepo.getNumeracion(trabajofinalid);
	}

	@Override
	public Trabajosfinales ListarporId(Integer id) {
		Optional<Trabajosfinales> pe = trabajosfinalesRepo.findById(id);
		return pe.isPresent() ? pe.get() : new Trabajosfinales();
	}

	@Override
	public boolean Eliminar(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Trabajosfinales> listarTrabajosPendientes() {
		return trabajosfinalesRepo.listarTrabajosPendientesAsignados();
	}

	@Override
	public List<Trabajosfinales> listarTrabajosEvaluados() {
		// TODO Auto-generated method stub
		return trabajosfinalesRepo.listarTrabajosEvaluados();
	}
	
	@Override
	public 	List<Trabajosfinales> BuscarCategoriaModalidad(Integer idcategoria, Integer idmodalidad,Integer peid){
		return trabajosfinalesRepo.BuscarCategoriaModalidad(idcategoria, idmodalidad,peid);
	}

	@Override
	public List<Trabajosfinales> listaTrabajosFinalesConNotaPromedioPorCategoriaModalidadDds(Integer idcategoria,
			Integer idmodalidad, Integer odsId) {
		return trabajosfinalesRepo.listaTrabajosFinalesConNotaPromedioPorCategoriaModalidadDds(idcategoria, idmodalidad, odsId);
	}

	@Override
	public List<CategoriaModalidadByOds> listarCategoriaModalidadByOds(Integer odsId) {
		List<CategoriaModalidadByOds> lista = new ArrayList<>();
		List<Object[]> listaObject = trabajosfinalesRepo.listarCategoriaModalidadByOds(odsId);
		for (Object[] objects : listaObject) {
			System.out.println(objects.length);
			CategoriaModalidadByOds c = new CategoriaModalidadByOds(Integer.parseInt(objects[0].toString()),Integer.parseInt(objects[1].toString()));
			lista.add(c);
		}
		
		return lista;
	}

	@Override
	public List<Trabajosfinales> listarTrabajosfinalesPorOds(Integer odsId) {
		return trabajosfinalesRepo.listarTrabajosfinalesPorOds(odsId);
	}

	@Override
	public List<Trabajosfinales> listaTrabajosEmpatadosPorCatModOdsPuesto(Integer idcategoria, Integer idmodalidad,
			Integer odsId, Integer puesto) {
		// TODO Auto-generated method stub
		return trabajosfinalesRepo.listaTrabajosEmpatadosPorCatModOdsPuesto(idcategoria, idmodalidad, odsId, puesto);
	}
	
	@Override
	public List<Trabajosfinales> listaTrabajosEmpatados() {
		// TODO Auto-generated method stub
		return trabajosfinalesRepo.listaTrabajosEmpatados();
	}

}
