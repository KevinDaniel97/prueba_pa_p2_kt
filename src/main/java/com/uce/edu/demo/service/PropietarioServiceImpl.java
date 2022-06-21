package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IPropietarioRepo;
import com.uce.edu.demo.vehicular.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService{


	@Autowired
	private IPropietarioRepo iRepoProp;

	
	
	@Override
	public void eliminarPropietario(String cedula) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void ingresarPropietario(Propietario v) {
		// TODO Auto-generated method stub
		
	}





}
