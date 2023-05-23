package ar.edu.unlam.pb2.admin.empleados;

/*
Gestor de Empleados

Empleado
	departamento (no me pide pero lo agrego)
	nombre
	apellido
	salario
	fecha_nacimiento
------------------------------
Saber del gerente encargado de c/empleado
-----------------------------
Cada gerente tiene una cochera 
--------------------------
Empleado de tipo Ingeniero
	su salario base esta afectado por algo "para la productividad"
--------------------------
Empleado tipo Director
	tiene cochera
	tiene sueldo_extra
------------------------------
Empresa 
	tiene muchos empleados
***************************
Gerente tiene muchos Empleados
1 Empleado tiene 1 Gerente

 */

import static org.junit.Assert.*;

import org.junit.Test;

public class GestorEmpleadosTest {

	@Test
	public void queUnaEmpresaInicialmenteTengaUnaListaDeEmpleadosVaciaYUnNombre() {
		// Preparacion
		final String NOMBRE_EMPRESA = "ASUS";
		final Integer CANTIDAD_DE_EMPLEADOS_INICIALMENTE_CERO = 0;
		Empresa unaEmpresa;

		// Ejecucion
		unaEmpresa = new Empresa(NOMBRE_EMPRESA);

		// Validacion
		assertEquals(CANTIDAD_DE_EMPLEADOS_INICIALMENTE_CERO, unaEmpresa.obtenerCantidadDeEmpleados());
	}

	@Test
	public void queSePuedaRegistrarTresEmpleadosEnLaEmpresa() {
		// Preparacion
		final String NOMBRE_EMPRESA = "ASUS";
		final Integer CANTIDAD_DE_EMPLEADOS_INICIALMENTE_CERO = 0;
		Empresa empresa;

		final String NOMBRE_UNO = "Belen";
		final String APELLIDO_UNO = "Guitian";
		final Double SALARIO_UNO = 15300.0;
		final String FECHA_NACIMIENTO = "02-11-96";
		final Area DEPARTAMENTO = Area.AREA_SOPORTE;

		final String NOMBRE_DOS = "Homero";
		final String APELLIDO_DOS = "Simpson";
		final Double SALARIO_DOS = 20400.0;
		final String FECHA_NACIMIENTO_DOS = "02-11-96";
		final Area DEPARTAMENTO_DOS = Area.AREA_SOPORTE;

		final String NOMBRE_TRES = "Lenny";
		final String APELLIDO_TRES = "Smith";
		final Double SALARIO_TRES = 50300.0;
		final String FECHA_NACIMIENTO_TRES = "02-11-96";
		final Area DEPARTAMENTO_TRES = Area.AREA_MARKETING;

		final Integer CANTIDAD_ESPERADA_EMPLEADO_TRES = 3;

		empresa = new Empresa(NOMBRE_EMPRESA);
		Empleado unEmpleado = new Empleado(NOMBRE_UNO, APELLIDO_UNO, SALARIO_UNO, FECHA_NACIMIENTO, DEPARTAMENTO);
		Empleado empleadoDos = new Empleado(NOMBRE_DOS, APELLIDO_DOS, SALARIO_DOS, FECHA_NACIMIENTO_DOS,
				DEPARTAMENTO_DOS);
		Empleado empleadoTres = new Empleado(NOMBRE_TRES, APELLIDO_TRES, SALARIO_TRES, FECHA_NACIMIENTO_TRES,
				DEPARTAMENTO_TRES);

		// Ejecucion
		empresa.agregarEmpleado(unEmpleado);
		empresa.agregarEmpleado(empleadoDos);
		empresa.agregarEmpleado(empleadoTres);

		// Validacion
		assertEquals(CANTIDAD_ESPERADA_EMPLEADO_TRES, empresa.obtenerCantidadDeEmpleados());
	}

	@Test
	public void queSePuedaRegistrarDosGerentesEnLaEmpresa() {
		// Preparacion
		final String NOMBRE_EMPRESA = "ASUS";
		Empresa empresa;

		final String NOMBRE = "Keanu";
		final String APELLIDO = "Reaves";
		final Double SALARIO = 50400.0;
		final String FECHA_NACIMIENTO = "02-11-96";
		final Area DEPARTAMENTO = Area.AREA_SOPORTE;
		final Integer COCHERA = 7;

		final String NOMBRE_DOS = "Pedro";
		final String APELLIDO_DOS = "Pascal";
		final Double SALARIO_DOS = 50300.0;
		final String FECHA_NACIMIENTO_DOS = "02-11-96";
		final Area DEPARTAMENTO_DOS = Area.AREA_DESARROLLO;
		final Integer OTRA_COCHERA = 9;


		final Integer CANTIDAD_ESPERADA_DE_GERENTE_DOS = 2;

		empresa = new Empresa(NOMBRE_EMPRESA);
		
		Gerente gerente = new Gerente(NOMBRE, APELLIDO, SALARIO, FECHA_NACIMIENTO, DEPARTAMENTO, COCHERA);
		Empleado gerenteDos = new Gerente(NOMBRE_DOS, APELLIDO_DOS, SALARIO_DOS, FECHA_NACIMIENTO_DOS,DEPARTAMENTO_DOS, OTRA_COCHERA);

		// Ejecucion
		empresa.agregarEmpleado(gerente);
		empresa.agregarEmpleado(gerenteDos);
		
		assertEquals(CANTIDAD_ESPERADA_DE_GERENTE_DOS, empresa.obtenerCantidadDeEmpleados());

	}
	
	@Test
	public void queSePuedaConocerElGerenteYLosEmpleadosDeUnaAreaDeterminada() {
		//EMPRESA
		final String NOMBRE_EMPRESA = "ASUS";
		Empresa empresa = new Empresa(NOMBRE_EMPRESA);
		//GERENTE
		final String NOMBRE_GERENTE = "Keanu";
		final String APELLIDO_GERENTE = "Reaves";
		final Double SALARIO_GERENTE = 50400.0;
		final String FECHA_NACIMIENTO_GERENTE = "02-11-96";
		final Area DEPARTAMENTO_GERENTE = Area.AREA_SOPORTE;
		final Integer COCHERA_GERENTE = 10;
		Gerente gerenteSoporte = new Gerente(NOMBRE_GERENTE, APELLIDO_GERENTE, SALARIO_GERENTE,FECHA_NACIMIENTO_GERENTE,DEPARTAMENTO_GERENTE, COCHERA_GERENTE);
		
		//EMPLEADOS
		final String NOMBRE_UNO = "Belen";
		final String APELLIDO_UNO = "Guitian";
		final Double SALARIO_UNO = 15300.0;
		final String FECHA_NACIMIENTO = "02-11-96";
		final Area DEPARTAMENTO = Area.AREA_SOPORTE;
		Empleado empleado = new Empleado(NOMBRE_UNO, APELLIDO_UNO, SALARIO_UNO, FECHA_NACIMIENTO, DEPARTAMENTO);

		final String NOMBRE_DOS = "Homero";
		final String APELLIDO_DOS = "Simpson";
		final Double SALARIO_DOS = 20400.0;
		final String FECHA_NACIMIENTO_DOS = "02-11-96";
		final Area DEPARTAMENTO_DOS = Area.AREA_SOPORTE;
		Empleado empleadoDos = new Empleado(NOMBRE_DOS, APELLIDO_DOS, SALARIO_DOS, FECHA_NACIMIENTO_DOS, DEPARTAMENTO_DOS);
		
		final Integer AREA = 6;
		
		//Ejecucion
		empresa.agregarEmpleado(gerenteSoporte);
		empresa.agregarEmpleado(empleado);
		empresa.agregarEmpleado(empleadoDos);
		
		//Validacion
		//CONOCER GERENTE DE UNA AREA
		assertEquals(gerenteSoporte, empresa.buscarElGerenteDeUnaAreaDeterminada(AREA));
		
		
	}
	
	@Test
	public void queSePuedaAgregarDosDirectoresEnLaEmpresa() {
		// Preparacion
		final String NOMBRE_EMPRESA = "ASUS";
		final String NOMBRE_DIRECTOR = "Roberto";
		final String APELLIDO_DIRECTOR = "Random";
		final Double SALARIO_BASICO = 100000.0;
		final String FECHA_NACIMIENTO = "09-09-1980";
		final Integer COCHERA_DIRECTOR = 1;

		
		Director director;
		final Double SUELDO_EXTRA_X_SER_DIRECTIVO = 23000.89;
		final String NOMBRE_DIRECTOR_DOS = "Marco";
		final String APELLIDO_DIRECTOR_DOS = "Alias";
		final Double SALARIO_BASICO_DOS = 110000.0;
		final String OTRA_FECHA_NACIMIENTO = "23-11-1980";
		final Integer OTRA_COCHERA_DIRECTOR= 5;
		final Double SUELDO_TOTAL_ESPERADO = 123000.89;
		
		final Integer CANTIDAD_DIRECTOR_DOS = 2;
		Empleado director2;
		
		Empresa empresa = new Empresa(NOMBRE_EMPRESA);
		
		// Ejecucion
		director = new Director(NOMBRE_DIRECTOR, APELLIDO_DIRECTOR, SALARIO_BASICO, FECHA_NACIMIENTO, SUELDO_EXTRA_X_SER_DIRECTIVO, COCHERA_DIRECTOR);
		director2 = new Director(NOMBRE_DIRECTOR_DOS, APELLIDO_DIRECTOR_DOS, SALARIO_BASICO_DOS, OTRA_FECHA_NACIMIENTO,SUELDO_EXTRA_X_SER_DIRECTIVO, OTRA_COCHERA_DIRECTOR);
		
		empresa.agregarEmpleado(director);
		empresa.agregarEmpleado(director2);
		
		// Validacion
		assertEquals(CANTIDAD_DIRECTOR_DOS, empresa.obtenerCantidadDeEmpleados());
		assertEquals(SUELDO_TOTAL_ESPERADO, director.conocerSueldoTotal(),0.1); // No funciona si declaro como Empleado y no como director
	}
	
	/*
	 * Empleado de tipo Ingeniero su salario base esta afectado por algo
	 * "para la productividad"
	 */

	@Test
	public void queSePuedaAumentarElSueldoBasicoPorUnBonusParaLaProductividadAUnEmpleadoIngenieroEnLaEmpresa() {

		// Preparacion
		final String NOMBRE_EMPRESA = "Asus";
		Empresa empresa = new Empresa(NOMBRE_EMPRESA);
		final Double SUELDO_TOTAL_ESPERADO = 16800.0;
		// EMPLEADOS
		final String NOMBRE_UNO = "Juan";
		final String APELLIDO_UNO = "Monteagudo";
		final Double SALARIO_UNO = 15300.0;
		final String FECHA_NACIMIENTO = "12-11-96";
		final Area DEPARTAMENTO = Area.AREA_DESARROLLO;
		Ingeniero inge = new Ingeniero(NOMBRE_UNO, APELLIDO_UNO, SALARIO_UNO, FECHA_NACIMIENTO, DEPARTAMENTO);
		
		final Double AUMENTO_X_PRODUCTIVIDAD = 1500.0;
		
		inge.setAumentoXProductividad(AUMENTO_X_PRODUCTIVIDAD);	
		
		
		empresa.agregarEmpleado(inge);
		assertEquals(SUELDO_TOTAL_ESPERADO, inge.conocerSueldoTotal(),0.1);


	}
	
	


}
