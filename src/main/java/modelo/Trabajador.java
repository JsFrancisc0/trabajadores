package modelo;

public class Trabajador extends Persona {

	private String isapre;
	private String afp;

	public Trabajador(String nombre, String apellido, String rut, String isapre, String afp){

		setNombre(nombre);
		setApellido(apellido);
		setRut(rut);
		setIsapre(isapre);
		setAfp(afp);

	}

	public Trabajador(){}

	public String getIsapre() {
		return this.isapre;
	}

	/**
	 * 
	 * @param isapre
	 */
	public void setIsapre(String isapre) {
		this.isapre = isapre;
	}

	public String getAfp() {
		return this.afp;
	}

	/**
	 * 
	 * @param afp
	 */
	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String toString(){

		return getNombre();
	}

}