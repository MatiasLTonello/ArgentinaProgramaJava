package ar.edu.argentina.programa.javaIntermedio.clase1Example;

import java.util.ArrayList;
import java.util.List;

public class OrdenDePedido {

	private List<LineaOrdenDePedido> lineas = new ArrayList<LineaOrdenDePedido>();

	public List<LineaOrdenDePedido> getLineas() {
		return lineas;
	}

	public void setLineas(List<LineaOrdenDePedido> linea) {
		this.lineas = linea;
	}
	
	
}
