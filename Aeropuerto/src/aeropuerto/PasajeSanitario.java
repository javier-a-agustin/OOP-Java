package aeropuerto;

/**
 * Representacion de pasaje de tipo Pasaje Sanitario
 * @author Javier Fernandez
 * @see Pasaje
 */
public class PasajeSanitario extends Pasaje{
	
	private Persona doctor;
	
	/**
	 * Crea un pasaje sanitario
	 * @param pasajero Pasajero que se desea asociar al pasaje sanitario
	 */
	public PasajeSanitario(Persona pasajero) {
		super(pasajero);
	}
	
	/**
	 * Devuelve el doctor asociado al pasaje sanitario
	 * @return doctor
	 */
	public Persona getDoctor() {
		return doctor;
	}

	/**
	 * Setea un doctor al pasaje sanitario
	 * @param doctor Doctor que se desea asociar al pasaje
	 */
	public void setDoctor(Persona doctor) {
		this.doctor = doctor;
	}
	
	
}
