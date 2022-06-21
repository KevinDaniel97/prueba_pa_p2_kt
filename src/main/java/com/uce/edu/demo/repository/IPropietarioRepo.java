package com.uce.edu.demo.repository;

import com.uce.edu.demo.vehicular.Vehiculo;

public interface IPropietarioRepo {

	//C: crear/insertar
	public void insertar(Vehiculo v);
	
	
	//D: eliminar
	public void eliminar(String cedula);
}
