package aeropuerto;

/**
 * Clase abstracta que representa un avion
 * @author Javier Fernandez
 * @see AvionCortaDistancia
 * @see AvionLargaDistancia
 * @see AvionSanitario
 */
public abstract class Avion {
	private String patente;
	private int capacidadMaxima;
	private double horasMaxVuelo;
	private double capacidadCombustible;
	
	/**
	 * Crea un Avion
	 * @param patente Patente que se desea setear
	 * @param capacidadMaxima Capacidad maxima que se desea setear
	 * @param capacidadCombustible Capacidad de combustible que se desea setear
	 */	
	public Avion(String patente, int capacidadMaxima, double capacidadCombustible) {
		this.patente = patente;
		this.capacidadMaxima = capacidadMaxima;
		this.capacidadCombustible = capacidadCombustible;
	}
	
	/**
	 * Crea un Avion
	 * @param patente Patente que se desea setear
	 * @param capacidadMaxima Capacidad maxima que se desea setear
	 * @param capacidadCombustible Capacidad de combustible que se desea setear	 
	 * @param horasMaxVuelo Horas maximas de vuelo que se desea setear
	 */
	public Avion(String patente, int capacidadMaxima, double capacidadCombustible, double horasMaxVuelo) {
		this(patente, capacidadMaxima, capacidadCombustible);
		this.horasMaxVuelo = horasMaxVuelo;
	}
	
	/**
	 * Devuelve la patente del avion
	 * @return patente
	 */
	public String getPatente() {
		return patente;
	}
	
	/**
	 * Setea la patente del avion
	 * @param patente Patente que se desea setear
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	/**
	 * Devuelve la capacidad maxima del avion
	 * @return capacidadMaxima
	 */
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}
	/**
	 * Setea la capacidad maxima del avion
	 * @param capacidadMaxima Capacidad Maxima que se desea setear
	 */
	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	
	/**
	 * Devuelve las horas maximas de vuelo del avion
	 * @return horasMaxVuelo
	 */
	public double getHorasMaxVuelo() {
		return horasMaxVuelo;
	}
	
	/**
	 * Setea las horas maximas de vuelo del avion
	 * @param horasMaxVuelo Horas maximas de vuelo que se desea setear
	 */
	public void setHorasMaxVuelo(double horasMaxVuelo) {
		this.horasMaxVuelo = horasMaxVuelo;
	}
	
	/**
	 * Devuelve la capacidad de combustible del avion
	 * @return capacidadCombustible
	 */
	public double getCapacidadCombustible() {
		return capacidadCombustible;
	}
	
	/**
	 * Setea la capacidad de combustible de un avion
	 * @param capacidadCombustible Capacidad de combustible que se desea setear
	 */
	public void setCapacidadCombustible(double capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}
	
	@Override
	public String toString() {
		return String.format("Patente: %s - Capacidad maxima: %d - Capacidad combustible: %f", this.patente, this.capacidadMaxima, this.capacidadCombustible);
	}
	

}
