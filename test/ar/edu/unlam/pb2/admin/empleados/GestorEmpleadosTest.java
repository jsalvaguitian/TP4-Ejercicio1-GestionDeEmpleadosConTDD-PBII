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
		//Preparacion
		final String NOMBRE_EMPRESA = "ASUS";
		final Integer CANTIDAD_DE_EMPLEADOS_INICIALMENTE_CERO = 0;
		Empresa unaEmpresa;
		
		//Ejecucion
		unaEmpresa = new Empresa(NOMBRE_EMPRESA);
		
		//Validacion
		assertEquals(CANTIDAD_DE_EMPLEADOS_INICIALMENTE_CERO, unaEmpresa.obtenerCantidadDeEmpleados());
	}
	
	@Test
	public void queSePuedaRegistrarTresEmpleadosEnLaEmpresa() {
		//Preparacion
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
		final String FECHA_NACIMIENTO_TRES= "02-11-96";
		final Area DEPARTAMENTO_TRES = Area.AREA_MARKETING;
		
		final Integer CANTIDAD_ESPERADA_EMPLEADO_TRES = 3;
		
		empresa = new Empresa(NOMBRE_EMPRESA);
		Empleado unEmpleado = new Empleado(NOMBRE_UNO, APELLIDO_UNO, SALARIO_UNO, FECHA_NACIMIENTO, DEPARTAMENTO);
		Empleado empleadoDos  = new Empleado(NOMBRE_DOS, APELLIDO_DOS, SALARIO_DOS, FECHA_NACIMIENTO_DOS, DEPARTAMENTO_DOS);
		Empleado empleadoTres = new Empleado(NOMBRE_TRES, APELLIDO_TRES, SALARIO_TRES, FECHA_NACIMIENTO_TRES, DEPARTAMENTO_TRES);
		
		//Ejecucion
		empresa.agregarEmpleado(unEmpleado);
		empresa.agregarEmpleado(empleadoDos);
		empresa.agregarEmpleado(empleadoTres);
		
		//Validacion
		assertEquals(CANTIDAD_ESPERADA_EMPLEADO_TRES, empresa.obtenerCantidadDeEmpleados());
	}
	
	@Test
	public void queSePuedaRegistrarTresGerentesEnLaEmpresa() {
		//Preparacion
				final String NOMBRE_EMPRESA = "ASUS";
				final Integer CANTIDAD_DE_EMPLEADOS_INICIALMENTE_CERO = 0;
				Empresa empresa;

				final String NOMBRE_UNO = "Tom";
				final String APELLIDO_UNO = "Holland";
				final Double SALARIO_UNO = 45300.0;
				final String FECHA_NACIMIENTO = "21-09-96";
				final Area DEPARTAMENTO = Area.AREA_MARKETING;
				
				final String NOMBRE_DOS = "Keanu";
				final String APELLIDO_DOS = "Reaves";
				final Double SALARIO_DOS = 50400.0;
				final String FECHA_NACIMIENTO_DOS = "02-11-96";
				final Area DEPARTAMENTO_DOS = Area.AREA_SOPORTE;
				
				final String NOMBRE_TRES = "Pedro";
				final String APELLIDO_TRES = "Pascal";
				final Double SALARIO_TRES = 50300.0;
				final String FECHA_NACIMIENTO_TRES= "02-11-96";
				final Area DEPARTAMENTO_TRES = Area.AREA_DESARROLLO;
				
				final Integer CANTIDAD_ESPERADA_DE_GERENTE_TRES = 3;
				
				empresa = new Empresa(NOMBRE_EMPRESA);
				Empleado unEmpleado = new Empleado(NOMBRE_UNO, APELLIDO_UNO, SALARIO_UNO, FECHA_NACIMIENTO, DEPARTAMENTO);
				Empleado empleadoDos  = new Empleado(NOMBRE_DOS, APELLIDO_DOS, SALARIO_DOS, FECHA_NACIMIENTO_DOS, DEPARTAMENTO_DOS);
				Empleado empleadoTres = new Empleado(NOMBRE_TRES, APELLIDO_TRES, SALARIO_TRES, FECHA_NACIMIENTO_TRES, DEPARTAMENTO_TRES);
				
				//Ejecucion
				empresa.agregarEmpleado(unEmpleado);
				empresa.agregarEmpleado(empleadoDos);
				empresa.agregarEmpleado(empleadoTres);
		
	}
	
	@Test
	public void queSePuedaRegistrarDosDirectoresEnLaEmpresa() {
		//Preparacion
		final String NOMBRE_EMPRESA = "ASUS";
		final String NOMBRE_DIRECTOR = "Roberto";
		final String APELLIDO_DIRECTOR = "Random";
		final Double SALARIO = 105000.0;
		final String FECHA_NACIMIENTO = "03-11-1980";
		Director director;
		Empresa empresa = new Empresa(NOMBRE_EMPRESA);
		//Ejecucion
		director = new Director(NOMBRE_DIRECTOR, APELLIDO_DIRECTOR, SALARIO, FECHA_NACIMIENTO);
		
		//Validacion
	}
	
	

}
