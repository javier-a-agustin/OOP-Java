package aeropuerto;

/**
 * Clase que reprenseta un avion de tipo sanitario
 * @author Javier Fernandez
 * @see AvionCortaDistancia
 * @see Avion
 */
public class AvionSanitario extends AvionCortaDistancia{
	private String descripcionEquipamiento;
	
	/**
	 * Crea un avion sanitario
	 * @param patente Patente que se desea asignar
	 * @param capacidadMaxima Capacidad maxima que se desea asignar 
	 * @param capacidadCombustible Capacidad de combustible que se desea asignar
	 * @param tipoMotor Tipo de motor que se desea asignar
	 * @param descripcionEquipamiento Descripcion del equipamiento medico que se desea setear
	 * @see TipoMotor
	 */
	public AvionSanitario(String patente, int capacidadMaxima, double capacidadCombustible, TipoMotor tipoMotor, String descripcionEquipamiento) {
		super(patente, capacidadMaxima, capacidadCombustible, tipoMotor);
		this.descripcionEquipamiento = descripcionEquipamiento;
	}

	/**
	 * Devuelve la descripcion del equipamiento medico del avion
	 * @return descripcionEquipamiento
	 */
	public String getDescripcionEquipamiento() {
		return descripcionEquipamiento;
	}

	/**
	 * Setea la descripcion del equipamiento medico del avion
	 * @param descripcionEquipamiento Descripcion del equipamiento que se desea setear
	 */
	public void setDescripcionEquipamiento(String descripcionEquipamiento) {
		this.descripcionEquipamiento = descripcionEquipamiento;
	}
	
	
}
