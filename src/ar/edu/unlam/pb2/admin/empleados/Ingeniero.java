package ar.edu.unlam.pb2.admin.empleados;

public class Ingeniero extends Empleado{
	private Double aumentoXProductividad;

	public Ingeniero(String nombre, String apellido, Double salario, String fechaNacimiento, Area depto) {
		super(nombre, apellido, salario, fechaNacimiento, depto);
		this.aumentoXProductividad = 0.0;
	}

	public void setAumentoXProductividad(Double aumentoXProductividad) {
		this.aumentoXProductividad = aumentoXProductividad;
		
	}

	public double conocerSueldoTotal() {
		salario += this.aumentoXProductividad;
		return salario;
	}

}
