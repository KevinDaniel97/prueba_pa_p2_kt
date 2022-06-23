package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.service.IMatriculaGestorService;
import com.uce.edu.demo.service.IPropietarioService;
import com.uce.edu.demo.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2KtApplication implements CommandLineRunner{

	@Autowired
	private IVehiculoService vehiculoService;
	
	@Autowired
	private IPropietarioService propietarioService;
	
	@Autowired
	private IMatriculaGestorService gestorService;
	

	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2KtApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//1
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Chebrolet");
		vehiculo.setPlaca("PRT393");
		vehiculo.setPrecio(new BigDecimal(20000));
		vehiculo.setTipo("L");
		this.vehiculoService.insertar(vehiculo);
		//2
		vehiculo.setPrecio(new BigDecimal(40000));
		vehiculo.setMarca("Chevrolet");
		this.vehiculoService.actualizar(vehiculo);
		//3
		Propietario pro = new Propietario();
		pro.setApellido("Toapnata");
		pro.setNombre("Kevin");
		pro.setCedula("1725845869");
		pro.setFechaNacimiento(LocalDateTime.now());
		this.propietarioService.crear(pro);
		//4
		this.gestorService.generar("1725845869", "PRT393");
	}

}
