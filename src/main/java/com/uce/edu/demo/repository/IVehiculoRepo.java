package com.uce.edu.demo.repository;

import com.uce.edu.demo.vehicular.Vehiculo;

public interface IVehiculoRepo {

	//CRUD
		//C: crear/insertar
		public void insertar(Vehiculo v);
		
		//R: leer/buscar
		public Vehiculo buscar(String placa);
		
		//U: actualizar
		public void actualizar(Vehiculo v);
			
		//D: eliminar
		public void eliminar(String cedula);
}
