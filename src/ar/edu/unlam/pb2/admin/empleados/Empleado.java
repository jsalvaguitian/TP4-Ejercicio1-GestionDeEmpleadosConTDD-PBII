package ar.edu.unlam.pb2.admin.empleados;

public class Empleado {
	private String nombre;
	private String apellido;
	private Double salario;
	private String fechaNacimiento;
	private Area departamento;


	public Empleado(String nombre, String apellido, Double salario, String fechaNacimiento,
			Area depto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
		this.departamento = depto;
	}
	
	public Empleado(String nombre, String apellido, Double salario, String fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
	}


}
