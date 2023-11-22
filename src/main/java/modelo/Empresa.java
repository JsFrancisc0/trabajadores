package modelo;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Trabajador> trabajadores;

	Empresa(){
		trabajadores = new ArrayList<>();
	}

	public ArrayList<Trabajador> getTrabajadores() {
		return this.trabajadores;
	}

	/**
	 * 
	 * @param trabajadores
	 */
	public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}

	/**
	 * 
	 * @param trabajador
	 */
	public void agregarTrabajador(Trabajador trabajador) {
		// TODO - implement modelo.Empresa.agregarTrabajador
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 */
	public void eliminarTrabajador(String nombre) {
		// TODO - implement modelo.Empresa.eliminarTrabajador
		throw new UnsupportedOperationException();
	}

}