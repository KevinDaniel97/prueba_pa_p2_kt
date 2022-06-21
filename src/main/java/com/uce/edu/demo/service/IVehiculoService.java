package com.uce.edu.demo.service;

import com.uce.edu.demo.vehicular.Vehiculo;

public interface IVehiculoService {
	
	public void ingresarVehiculo(Vehiculo v);
	
	public Vehiculo buscarVehiculo(String placa);
	
	public void actualizarVehiculo(Vehiculo v);
	
	public void borrarVehiculo(String placa);

	

}
