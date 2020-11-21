package aeropuerto;

/**
 * Clase que representa un avion de corta distancia
 * @author Javier Fernandez
 * @see Avion
 * @see AvionSanitario
 */
public class AvionCortaDistancia extends Avion{
	private TipoMotor tipoMotor;
	
	/**
	 * Crea un avion de corta distancia
	 * @param patente Patente que se desea asignar
	 * @param capacidadMaxima Capacidad maxima que se desea asignar 
	 * @param capacidadCombustible Capacidad de combustible que se desea asignar
	 * @param tipoMotor Tipo de motor que se desea asignar
	 * @see TipoMotor
	 */
	public AvionCortaDistancia(String patente, int capacidadMaxima, double capacidadCombustible, TipoMotor tipoMotor) {
		super(patente, capacidadMaxima, capacidadCombustible);
		this.tipoMotor = tipoMotor;
	}
	
	/**
	 * Devuelve el tipo de motor del avion
	 * @return tipoMotor
	 * @see TipoMotor
	 */
	public TipoMotor getTipoMotor() {
		return tipoMotor;
	}

	/**
	 * Setea el tipo de motor del avion
	 * @param tipoMotor Tipo de motor que se desea setear
	 * @see TipoMotor
	 */
	public void setTipoMotor(TipoMotor tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	
	
}
