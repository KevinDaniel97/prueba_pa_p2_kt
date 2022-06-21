package com.uce.edu.demo.vehicular;

import org.springframework.stereotype.Component;


public class VehiculoLiviano  extends Vehiculo{

	private String cilindraje;
	

	public String getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}
	
	
}
