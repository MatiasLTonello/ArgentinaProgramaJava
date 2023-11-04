package ar.edu.argentina.programa.javaIntermedio.clase1Example;

public class Producto {

	private String marca;
	private String nombre;
	private String descripcion;
	private String presentacion;
	private String unidadPresentacion;
	private String codigo;
	private Double precioVenta;
	
	public Producto(String marca, String nombre, String descripcion, String presentacion, String unidadPresentacion, String codigo, Double precioVenta) {
		super();
		this.marca = marca;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.presentacion = presentacion;
		this.unidadPresentacion = unidadPresentacion;
		this.codigo = codigo;
		this.precioVenta = precioVenta;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPresentacion() {
		return presentacion;
	}
	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}
	public Double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public String getUnidadPresentacion() {
		return unidadPresentacion;
	}
	public void setUnidadPresentacion(String unidadPresentacion) {
		this.unidadPresentacion = unidadPresentacion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}
