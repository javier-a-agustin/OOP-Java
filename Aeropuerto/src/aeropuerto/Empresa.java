package aeropuerto;
import java.util.ArrayList;

/**
 * Representacion de una empresa
 * @author Javier Fernandez
 * @see Avion
 * @see Vuelo
 */

public class Empresa {
	private String nombreComercial;
	private String cuit;
	private String razonSocial;
	
	ArrayList<Avion> flotaAviones;
	ArrayList<Vuelo> vuelos;
	
	/**
	 * Crea una empresa
	 * 
	 */
	public Empresa() {
		this.flotaAviones = new ArrayList<Avion>();
		this.vuelos = new ArrayList<Vuelo>();
	}
	
	/**
	 * Crea una empresa 
	 * @param nombreComercial Nombre comercial que se desea setear a la empresa
	 */
	public Empresa (String nombreComercial) {
		this();
		this.nombreComercial = nombreComercial;
	}
	
	/**
	 * Crea una empresa
	 * @param nombreComercial Nombre comercial que se desea setear a la empresa
	 * @param cuit Cuit que se desea setear a la empresa
	 */
	public Empresa (String nombreComercial, String cuit) {
		this();
		this.cuit = cuit;
		this.nombreComercial = nombreComercial;
	}

	/**
	 * Devuelve el nombre comercial de la empresa
	 * @return nombreComercial
	 */
	public String getNombreComercial() {
		return nombreComercial;
	}

	/**
	 * Setea el nombre comercial de la empresa
	 * @param nombreComercial Nombre comercial  que se desea setear
	 */
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	/**
	 * Devuelve el cuit de la empresa
	 * @return cuit
	 */
	public String getCuit() {
		return cuit;
	}

	/**
	 * Setea el cuit de la empresa
	 * @param cuit Cuit que se desea setear
	 */
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	/**
	 * Devuelve la razon social de la empresa
	 * @return razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}
	
	/**
	 * Setea la razon social de la empresa
	 * @param razonSocial Razon social que se desea asociar
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	/**
	 * Devuelve la flota de aviones que dispone la empresa
	 * @return flotaAviones
	 */
	public ArrayList<Avion> getFlotaAviones() {
		return flotaAviones;
	}
	
	/**
	 * Devuelve los vuelos que dispone la empresa
	 * @return vuelos
	 */
	public ArrayList<Vuelo> getVuelos() {
		return vuelos;
	}

	/**
	 * Setea la flota de aviones
	 * @param flotaAviones Flota de aviones que se desea setear
	 */
	public void setFlotaAviones(ArrayList<Avion> flotaAviones) {
		this.flotaAviones = flotaAviones;
	}
	
	/**
	 * Agrega un avion a la flota de aviones
	 * @param avion Avion que se desea agregar
	 */
	public void agregarAvion(Avion avion) {
		this.flotaAviones.add(avion);
	}
	
	/**
	 * Agrega un grupo de aviones a la flota de aviones
	 * @param aviones Lista de aviones que se desea agregar a la flota
	 */
	public void agregarAviones(Avion[] aviones) {
		for (Avion avion : aviones) {
			this.flotaAviones.add(avion);
		}
	}
	
	/**
	 * Agrega un vuelo a la lista de vuelos
	 * @param vuelo Vuelo que se desea agregar
	 */
	public void agregarVuelo(Vuelo vuelo) {
		this.vuelos.add(vuelo);
	}
	
	/**
	 * Muestra la informacion de cada vuelo asociado a la empresa
	 */
	public void mostrarVuelos() {
		
		for (Vuelo vuelo : this.vuelos) {
			System.out.println("- ".repeat(70));
			vuelo.mostrarInfoVuelo();

		}
		
	}
	
	
	
}
