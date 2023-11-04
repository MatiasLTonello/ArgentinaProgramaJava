package ar.edu.argentina.programa.javaIntermedio.clase1Example;

public class LineaOrdenDePedido {

	private Producto producto;
	private int cantidad;
	
	public LineaOrdenDePedido(Producto producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
