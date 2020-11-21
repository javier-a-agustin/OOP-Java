package aeropuerto;

/**
 * Clase para representar la excepcion de Pasaje Invalido
 * @author Javier Fernandez
 */

public class PasajeInvalidoException extends LogicException{
	
	private Pasaje pasaje;
	
	/**
	 * Crea una excepcion Pasaje invalido
	 * @param pasaje Pasaje que se desea asociar a la excepcion
	 */	
	public PasajeInvalidoException(Pasaje pasaje) {
		this.pasaje = pasaje;
	}
	
	/**
	 * Devuelve el pasaje invalido
	 * @return pasaje
	 */
	public Pasaje getPasaje() {
		return this.pasaje;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return String.format("El pasaje %s no se puede cargar a este tipo de vuelo.", this.pasaje);
	}
	
}
