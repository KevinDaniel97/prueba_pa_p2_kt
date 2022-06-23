package com.uce.edu.demo.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Se inserta el vehiculo: "+vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Se actualiza el vehiculo: "+vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se elimina el vehiculo con placa: "+placa);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la placa: "+placa);
		Vehiculo vehi = new Vehiculo();
		vehi.setPlaca(placa);
		vehi.setMarca("Chevrolet");
		vehi.setTipo("P");
		vehi.setPrecio(new BigDecimal(1200));
		return vehi;
	}

}
