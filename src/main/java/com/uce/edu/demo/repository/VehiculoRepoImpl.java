package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.vehicular.Vehiculo;
@Repository
public class VehiculoRepoImpl implements IVehiculoRepo{

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("vehiculo insertado"+v);
	}

	@Override
	public Vehiculo buscar(String  placa) {
		// TODO Auto-generated method stub
		System.out.println("buscando vehiculo"+placa);

		return null;
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("actualizando vehiculo"+v);

	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("eliminar vehiculo"+placa);

	}

}
