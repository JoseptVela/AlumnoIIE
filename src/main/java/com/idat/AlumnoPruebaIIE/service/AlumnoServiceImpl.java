package com.idat.AlumnoPruebaIIE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.AlumnoPruebaIIE.model.Alumno;
import com.idat.AlumnoPruebaIIE.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	
	//List<Alumno> listarAlumno = new ArrayList<>();
	//
	//public AlumnoServiceImpl() {
	//	
	//	listarAlumno.add(new Alumno(1,"Vela","Harly"));
	//	listarAlumno.add(new Alumno(2,"Quispe","Diego"));
	//	listarAlumno.add(new Alumno(3,"Bermejo","Karen"));
	//	
	//}
	
	@Autowired
	private AlumnoRepository repository;
	
	@Override
	public List<Alumno> listar() {
		//Alumno a1 = new Alumno(1,"Vela","Harly");
		return repository.findAll();
	}

	@Override
	public Alumno obtenerId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Alumno alumno) {
		repository.save(alumno);

	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void actualizar(Alumno alumno) {
		repository.saveAndFlush(alumno);
	}

}
