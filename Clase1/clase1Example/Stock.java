package ar.edu.argentina.programa.javaIntermedio.clase1Example;

import java.util.ArrayList;
import java.util.List;

public class Stock {

	private List<ItemStock> items = new ArrayList<ItemStock>();

	public List<ItemStock> getItems() {
		return items;
	}

	public void setItems(List<ItemStock> item) {
		this.items = item;
	}
	
	public ItemStock getItemByCodigo(String codigo) {
		for (ItemStock item : this.getItems()) {
			if (item.getProducto().getCodigo().equals(codigo))
				return item;
		}
		return null;
	}
	
	public boolean descontarStock (String codigo, int cantidad) {
		ItemStock i = this.getItemByCodigo(codigo);
		if (i.getCantidadDisponible() > cantidad) {
			i.setCantidadDisponible(i.getCantidadDisponible() - cantidad);
			return true;
		}
		return false;
	}
}
