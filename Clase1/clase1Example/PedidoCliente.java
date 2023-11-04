package ar.edu.argentina.programa.javaIntermedio.clase1Example;

public class PedidoCliente {

	static Stock stock = new Stock();
	static Producto p1 = new Producto( "coca", "coca", "gaseosa saber coca", "500", "ml","cc500ml", 100.5D);
	static Producto p2 = new Producto( "canole", "tomate", "pure de tomate", "360", "grs", "cpt360grs", 233.88D);
	static OrdenDePedido pedido = new OrdenDePedido();
	
	private static void initStock() {
		ItemStock itemStock1 = new ItemStock(p1, 80);
		ItemStock itemStock2 = new ItemStock(p2, 150);
		stock.getItems().add(itemStock1);
		stock.getItems().add(itemStock2);
	}
	
	
	private static void initPedido() {
		LineaOrdenDePedido linea1 = new LineaOrdenDePedido(p1, 30);
		LineaOrdenDePedido linea2 = new LineaOrdenDePedido(p2, 10);
		pedido.getLineas().add(linea1);
		pedido.getLineas().add(linea2);
	}
	
	
	public static void main(String[] args) {
		initStock();
		initPedido();
		
		for(LineaOrdenDePedido l : pedido.getLineas()) {
			if (stock.descontarStock(l.getProducto().getCodigo(), l.getCantidad())) {
				System.out.println("nuevo stock de " + l.getProducto().getNombre() +" : "+stock.getItemByCodigo(l.getProducto().getCodigo()).getCantidadDisponible());
			}
			else {
				System.out.println("No hay stock suficiente para el producto"+ l.getProducto().getNombre());
			}
		}
	}

}
