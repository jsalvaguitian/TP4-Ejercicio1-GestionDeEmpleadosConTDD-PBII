package ar.edu.unlam.pb2.admin.empleados;

public class Director extends Empleado {
	private Double sueldoExtra;
	private Integer cochera;
	
	public Director(String nombre, String apellido, Double salario, String fechaNacimiento,  Double sueldoExtra, Integer cochera) {
		super(nombre, apellido, salario, fechaNacimiento);
		this.sueldoExtra = sueldoExtra;
		this.cochera = cochera;
	}

	public Double conocerSueldoTotal() {
		return this.getSalario() + this.sueldoExtra;
		
	}

	public Double getSueldoExtra() {
		return sueldoExtra;
	}

	public void setSueldoExtra(Double sueldoExtra) {
		this.sueldoExtra = sueldoExtra;
	}

	public Integer getCochera() {
		return cochera;
	}

	public void setCochera(Integer cochera) {
		this.cochera = cochera;
	}
	
	

}
