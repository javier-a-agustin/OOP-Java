package aeropuerto;

/**
 * Clase para representar la excepcion de Capacidad maxima superada
 * @author Javier Fernandez
 */
public class CapacidadMaximaException extends LogicException{
	
	private Pasaje pasaje;
	
	/**
	 * Crea una excepcion CapacidadMaximaException
	 * @param pasaje Pasaje que se desea asociar a la excepcion
	 */
	public CapacidadMaximaException(Pasaje pasaje) {
		this.pasaje = pasaje;
	}
	
	/**
	 * Devuelve el pasaje asociado a la excepcion
	 * @return pasaje
	 */
	public Pasaje getPasaje() {
		return this.pasaje;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return String.format("El pasaje %s no se puede cargar debido que no hay lugar en el avion", this.pasaje);
	}
}
