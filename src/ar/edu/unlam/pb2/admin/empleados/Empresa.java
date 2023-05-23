package ar.edu.unlam.pb2.admin.empleados;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList<Empleado> empleados;

	public Empresa(String nombre) {
		this.nombre = nombre;
		this.empleados = new ArrayList<>();
	}

	public Integer obtenerCantidadDeEmpleados() {
		return this.empleados.size();
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public void agregarEmpleado(Empleado unEmpleado) {
		this.empleados.add(unEmpleado);
	
	}

	public Empleado buscarElGerenteDeUnaAreaDeterminada(Integer area) {
		Area areaBuscada = this.buscarArea(area);

		for(Empleado buscado : this.empleados) {
			if(buscado instanceof Gerente && buscado.getDepartamento().equals(areaBuscada)) {
				return buscado;
			}
		}
		return null;
	}

	private Area buscarArea(Integer indiceArea) {
		Area arrayArea[] = Area.values();
		
		if(indiceArea>0 && indiceArea<= arrayArea.length) {
			return arrayArea[indiceArea-1];
		}
		
		return null;
	}
	
	

}
