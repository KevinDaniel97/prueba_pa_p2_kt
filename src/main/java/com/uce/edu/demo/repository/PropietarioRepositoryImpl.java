package com.uce.edu.demo.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	@Override
	public void crear(Propietario propietario) {
		// TODO Auto-generated method stub
		System.out.println("Se crea el propietario: "+propietario);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se crea el propietario con la cedula: "+cedula);
	}

	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		Propietario p = new Propietario();
		p.setApellido("Kevin");
		p.setNombre("Toapanta");
		p.setFechaNacimiento(LocalDateTime.now());
		p.setCedula(cedula);
		return p;
	}

}
