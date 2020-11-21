package aeropuerto;

/**
 * Representacion de pasaje
 * @author Javier Fernandez
 * @see PasajeSanitario
 */

public class Pasaje {
	
	private static int counter;
	private int codigo;
	private int numeroAsiento;
	private Persona pasajero;
	
	/**
	 * Crea un pasaje
	 * @param pasajero Pasajero que se desea asociar al pasaje
	 */	
	public Pasaje(Persona pasajero) {
		this.codigo = ++Pasaje.counter;
		this.pasajero = pasajero;
	}
	
	/**
	 * Crea un pasaje
	 * @param numeroAsiento Numero de asiento que se desea asociar al pasaje
	 * @param pasajero Pasajero que se desea asociar al pasaje
	 */
	public Pasaje(int numeroAsiento, Persona pasajero) {
		this(pasajero);
		this.numeroAsiento = numeroAsiento;
	}

	/**
	 * Devuelve el codigo del pasaje
	 * @return codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Devuelve el numero de asiento del pasaje
	 * @return numeroAsiento
	 */
	public int getNumeroAsiento() {
		return numeroAsiento;
	}

	/**
	 * Setea el numero de asiento del pasaje
	 * @param numeroAsiento Numero de Asiento que se desea setear
	 */
	public void setNumeroAsiento(int numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}

	/**
	 * Devuelve el pasajero asociado al pasaje
	 * @return pasajero
	 */
	public Persona getPasajero() {
		return pasajero;
	}
	
	/**
	 * Setea un pasajero al pasaje
	 * @param pasajero Pasajero que se desea asociar
	 */
	public void setPasajero(Persona pasajero) {
		this.pasajero = pasajero;
	}
	
	@Override
	public String toString() {
		return String.format("%d", this.codigo);
	}
	
}
