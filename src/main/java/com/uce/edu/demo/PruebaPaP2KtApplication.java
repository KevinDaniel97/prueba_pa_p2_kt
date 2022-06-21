package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.service.IMatriculaService;
import com.uce.edu.demo.vehicular.Propietario;
import com.uce.edu.demo.vehicular.VehiculoPesado;



@SpringBootApplication
public class PruebaPaP2KtApplication implements CommandLineRunner{
	@Autowired
	private Propietario propietario1;
	
	@Autowired
	@Qualifier("liviano")
	private VehiculoPesado vehiculoliv;
	
	@Autowired
	@Qualifier("pesado")
	private VehiculoPesado vehiculop;
	
	@Autowired
	private IMatriculaService iMatriculaSer;

	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2KtApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		this.propietario1.setNombre("juanito");
		this.propietario1.setApellido("Toapanta");
		this.propietario1.setCedula("1725845869");
		
		this.vehiculop.setMarca("toyota");
		this.vehiculop.setPlaca("PRT45");
		this.vehiculop.setTipo("pesado");
		//this.iMatriculaSer.ingresarMatricula(vehiculop, propietario1);
		
		//this.iMatriculaSer.imprimirMatricula(vehiculop);
		
		
		
		
	}

}
