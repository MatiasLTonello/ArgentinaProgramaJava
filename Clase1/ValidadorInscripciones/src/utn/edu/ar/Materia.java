package utn.edu.ar;

import java.util.*;

public class Materia {
    private String nombre;
    private Integer idMateria;
    private List<Materia> correlativasNecesarias;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativasNecesarias = new ArrayList<>();
    }

    public void agregarCorrelativa(Materia materia) {
        correlativasNecesarias.add(materia);
    }

    public List<Materia> getCorrelativasNecesarias() {
        return correlativasNecesarias;
    }
}