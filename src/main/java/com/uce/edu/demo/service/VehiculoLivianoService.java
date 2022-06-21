package com.uce.edu.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IVehiculoRepo;
import com.uce.edu.demo.vehicular.Vehiculo;
@Service
@Qualifier("liviano")
public class VehiculoLivianoService implements IVehiculoService{

	@Autowired
	private IVehiculoRepo irepovehiculo;
	
	@Override
	public void ingresarVehiculo(Vehiculo v) {
		// TODO Auto-generated method stub

	}

	@Override
	public Vehiculo buscarVehiculo(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarVehiculo(Vehiculo v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrarVehiculo(String placa) {
		// TODO Auto-generated method stub
		
	}
	public BigDecimal calcularValorMatricula(String placa, BigDecimal precio) {
		BigDecimal valorM=precio.multiply(new BigDecimal(0.15));
		if(valorM.intValue()>2000) {
			valorM=valorM.multiply(new BigDecimal(0.07));
		}
		return valorM;
		
	}


}
