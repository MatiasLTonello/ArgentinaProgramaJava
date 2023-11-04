package ar.edu.argentina.programa.javaIntermedio.clase1Example;

import java.util.Date;

public class ItemStock {
	
	private Producto producto;
	private int cantidadDisponible;
	private int cantidadReservada;
	private Date fechaReserva;
	
	public ItemStock(Producto producto, int cantidadDisponible) {
		super();
		this.producto = producto;
		this.cantidadDisponible = cantidadDisponible;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidadDisponible() {
		return cantidadDisponible;
	}
	public void setCantidadDisponible(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	public int getCantidadReservada() {
		return cantidadReservada;
	}
	public void setCantidadReservada(int cantidadReservada) {
		this.cantidadReservada = cantidadReservada;
	}
	public Date getFechaReserva() {
		return fechaReserva;
	}
	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}
	
	
}
