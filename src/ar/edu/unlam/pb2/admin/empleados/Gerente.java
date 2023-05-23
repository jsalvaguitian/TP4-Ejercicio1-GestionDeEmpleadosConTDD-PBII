package ar.edu.unlam.pb2.admin.empleados;

public class Gerente extends Empleado{
	private Integer cochera;

	public Gerente(String nombre, String apellido, Double salario, String fechaNacimiento, Area depto,Integer cochera) {
		super(nombre, apellido, salario, fechaNacimiento, depto);
		this.cochera = cochera;
	}

	public Integer getCochera() {
		return cochera;
	}

	public void setCochera(Integer cochera) {
		this.cochera = cochera;
	}
	
	

}
