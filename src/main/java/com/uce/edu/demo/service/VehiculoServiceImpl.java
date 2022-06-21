package com.uce.edu.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IVehiculoRepo;
import com.uce.edu.demo.vehicular.Vehiculo;
@Service
public class VehiculoServiceImpl implements IVehiculoService{

	@Autowired 
	private IVehiculoRepo vehiculoRepo;
	
	@Override
	public void ingresarVehiculo(Vehiculo v) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.insertar(v);
	}

	@Override
	public Vehiculo buscarVehiculo(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscar(placa);
	}

	@Override
	public void actualizarVehiculo(Vehiculo v) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.actualizar(v);
	}

	@Override
	public void borrarVehiculo(String placa) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.eliminar(placa);
	}

	public BigDecimal valorVehicular(String placa,BigDecimal precio) {
		return null;
		
	}
}
