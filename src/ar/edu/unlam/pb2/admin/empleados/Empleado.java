package ar.edu.unlam.pb2.admin.empleados;

public class Empleado {
	private String nombre;
	private String apellido;
	protected Double salario;
	private String fechaNacimiento;
	protected Area departamento;


	public Empleado(String nombre, String apellido, Double salario, String fechaNacimiento,
			Area depto) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
		this.departamento = depto;
	}
	
	//Por el director
	public Empleado(String nombre, String apellido, Double salario, String fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Double getSalario() {
		return salario;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public Area getDepartamento() {
		return departamento;
	}
	
}
