package aeropuerto;

import java.util.ArrayList;

/**
 * Clase que representa un Vuelo
 * @author Javier Fernandez
 * 
 * @see Avion
 * @see Persona
 * @see Pasaje
 */

public class Vuelo {
	private Avion avion;
	private Persona piloto;
	private Persona copiloto;
	private String origen;
	private String destino;
	private int capacidadTemporal = 0;
	private int codigo;
	private ArrayList<Persona> auxiliares;
	private ArrayList<Pasaje> pasajes;

	private static int counter = 0;
	
	/**
	 * Crea un vuelo
	 * @param avion Avion que se desea asignar
	 * @param piloto Piloto que se desea asignar
	 * @param origen Origen del vuelo que se desea asignar
	 * @param destino Destino del vuelo que se desea asignar
	 * @see Avion
	 * @see Persona
	 */
	public Vuelo(Avion avion, Persona piloto, String origen, String destino) {
		
		this.auxiliares = new ArrayList<Persona>();
		this.pasajes = new ArrayList<Pasaje>();				// Creacion de los arreglos
		
		this.avion = avion;
		this.piloto = piloto;
		this.origen = origen;
		this.destino = destino;
		this.codigo = ++Vuelo.counter;
	}
	
	/**
	 * Devuelve el avion asignado al vuelo
	 * @return avion
	 */
	public Avion getAvion() {
		return avion;
	}
	
	/**
	 * Setea el avion del vuelo
	 * @param avion Avion que se desea setear
	 */
	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	/**
	 * Devuelve el piloto del vuelo
	 * @return piloto
	 */
	public Persona getPiloto() {
		return piloto;
	}

	/**
	 * Setea el piloto del vuelo
	 * @param piloto Piloto que se desea setear
	 */
	public void setPiloto(Persona piloto) {
		this.piloto = piloto;
	}

	/**
	 * Devuelve el copiloto del vuelo
	 * @return copiloto
	 */
	public Persona getCopiloto() {
		return copiloto;
	}
	
	/**
	 * Setea el copiloto del vuelo
	 * @param copiloto Copiloto que se desea setear
	 */
	public void setCopiloto(Persona copiloto) {
		this.copiloto = copiloto;
	}
	
	/**
	 * Devuelve el origen del vuelo
	 * @return origen
	 */
	public String getOrigen() {
		return origen;
	}

	/**
	 * Setea el origen del vuelo
	 * @param origen Origen que se desea setear
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * Devuelve el destino del vuelo
	 * @return destino
	 */
	public String getDestino() {
		return destino;
	}

	/**
	 * Setea el destino del vuelo
	 * @param destino Destino que se desea setear
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}

	/**
	 * Devuelve el arreglo de auxiliares correspondientes al vuelo
	 * @return auxiliares
	 */
	public ArrayList<Persona> getAuxiliares() {
		return auxiliares;
	}
	
	/**
	 * Setea los auxiliares del vuelo
	 * @param auxiliares Auxiliares que se desea setear
	 */
	public void setAuxiliares(ArrayList<Persona> auxiliares) {
		this.auxiliares = auxiliares;
	}
	
	/**
	 * Agrega un auxiliar al vuelo
	 * @param auxiliar Auxiliar que se desea agregar
	 */
	public void agregarAuxiliar(Persona auxiliar) {
		this.auxiliares.add(auxiliar);
	}

	/**
	 * Devuelve los pasajes correspondientes al vuelo
	 * @return pasajes
	 */
	public ArrayList<Pasaje> getPasajes() {
		return pasajes;
	}

	/**
	 * Devuelve el codigo Unico del vuelo
	 * @return codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * Registra un pasaje en el vuelo. 
	 * @param pasaje Pasaje que se desea registrar
	 * @see Pasaje
	 * @see PasajeSanitario
	 * @see PasajeInvalidoException
	 * @see CapacidadMaximaException
	 * @throws PasajeInvalidoException Si un pasaje es invalido se lanza PasajeInvalidoException
	 * @throws CapacidadMaximaException Si la capacidad maxima es superada se lanza CapacidadMaximaException
	 */
	public void registrarPasaje(Pasaje pasaje) throws PasajeInvalidoException, CapacidadMaximaException{
		
		if ((pasaje instanceof PasajeSanitario) && !(avion instanceof AvionSanitario)) {
			throw new PasajeInvalidoException(pasaje);
		} else {
			if (this.capacidadTemporal == this.avion.getCapacidadMaxima() ) {
				throw new CapacidadMaximaException(pasaje);
			} else {
				this.pasajes.add(pasaje);
				this.capacidadTemporal++;
			}
		}
	}
	
	/**
	 * Muestra la informacion del vuelo: Informacion del avion, origen, destino y lista de pasajeros.
	 */
	public void mostrarInfoVuelo() {
		System.out.printf("Vuelo nro: %d - avion: %s - origen: %s - destino: %s \n", this.codigo, this.avion, this.origen, this.destino);
		System.out.println("Lista de pasajeros:");
		
		if (this.pasajes.isEmpty()) {
			System.out.println("		Este vuelo no tiene pasajeros asignados");
		} else {
			for (Pasaje pasaje : this.pasajes) {
				
				System.out.printf("		* %s\n", pasaje.getPasajero() );
			}
		}			
	}
	
	@Override
	public boolean equals(Object obj) {
		Vuelo vuelo = (Vuelo) obj;
		return this.origen == vuelo.getOrigen() && this.destino == vuelo.getDestino();
	}
	
}
