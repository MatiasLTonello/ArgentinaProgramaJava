package utn.edu.ar;

import java.util.*;

public class Materia {
    private String nombre;
    private Integer idMateria;
    private List<Materia> correlativasNecesarias;

    public Materia(String nombre) {
        this.setNombre(nombre);
        this.correlativasNecesarias = new ArrayList<>();
    }

    public void agregarCorrelativa(Materia materia) {
        correlativasNecesarias.add(materia);
    }

    public List<Materia> getCorrelativasNecesarias() {
        return correlativasNecesarias;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(Integer idMateria) {
		this.idMateria = idMateria;
	}
}