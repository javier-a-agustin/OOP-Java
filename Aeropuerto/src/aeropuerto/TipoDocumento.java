package aeropuerto;

/**
 * Tipos de documentos existentes
 * 
 * @see Persona
 * 
 * @author Javier Fernandez
 */
public enum TipoDocumento {
	/**
	 * Documento Nacional de Identidad.
	 */
	DNI, 
	
	/**
	 * Libreta de Enrolamiento. Utilizado para los hombres
	 */
	LE, 
	
	/**
	 * Libreta C�vica. Utilizado para las mujeres
	 */
	LC, 
	
	/**
	 * Desconocido.
	 */
	DESC
}
