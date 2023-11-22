package modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class Empresa {

	private ArrayList<Trabajador> trabajadores;

	public Empresa(){
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

		trabajadores.add(trabajador);
	}

	/**
	 * 
	 * @param rut
	 */
	public void eliminarTrabajador(String rut) {

		Iterator<Trabajador> iterator = getTrabajadores().iterator();

		while (iterator.hasNext()) {
			Trabajador trabajador = iterator.next();
			if (trabajador.getRut().equalsIgnoreCase(rut)) {
				iterator.remove();
			}
		}

	}

	public Trabajador buscarTrabajador(String rut){

		Trabajador trabajadorEncontrado = new Trabajador();

		for (Trabajador i : getTrabajadores()){
			if (i.getRut().equalsIgnoreCase(rut)){
				trabajadorEncontrado = i;
			}
		}

		return trabajadorEncontrado;
	}

}