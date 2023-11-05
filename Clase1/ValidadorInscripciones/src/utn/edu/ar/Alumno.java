package utn.edu.ar;

import java.util.HashSet;

public class Alumno {

	private String dni;
	private String apellido;
	private HashSet<Materia> materiasAprobadas;
	
	public Boolean verificarSiLaMateriaEstaAprobada(Integer idMateria) {
		for(Materia materia : materiasAprobadas) {
			if(materia.getIdMateria() == idMateria) {
				return true;
			}
		}
		return false;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
