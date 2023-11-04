/**
 * 
 */
package ar.edu.argentina.programa.javaIntermedio.clase1Example;

/**
 * @author lu
 *
 */
public class Cliente {

	private String razonSocial;
	private Integer cuit;
	private Domicilio domicilioLegal;
	private Domicilio domicilioReal;
	private boolean consumidorFinal;
	
	
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public Integer getCuit() {
		return cuit;
	}
	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}
	public Domicilio getDomicilioLegal() {
		return domicilioLegal;
	}
	public void setDomicilioLegal(Domicilio domicilioLegal) {
		this.domicilioLegal = domicilioLegal;
	}
	public Domicilio getDomicilioReal() {
		return domicilioReal;
	}
	public void setDomicilioReal(Domicilio domicilioReal) {
		this.domicilioReal = domicilioReal;
	}
	public boolean isConsumidorFinal() {
		return consumidorFinal;
	}
	public void setConsumidorFinal(boolean consumidorFinal) {
		this.consumidorFinal = consumidorFinal;
	}
	
	
}
