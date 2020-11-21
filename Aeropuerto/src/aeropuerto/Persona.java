package aeropuerto;

/**
 * Clase que representa a Persona
 * @author Javier Fernandez
 */
public class Persona {
	private String apellido;
	private String nombre;
	private int numeroDocumento;
	private TipoDocumento tipoDocumento;
	
	/**
	 * Crea una persona 
	 * @param nombre Nombre de la persona
	 */
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 *  Devuelve el apellido de la persona
	 *  @return apellido
	 */
	public String getApellido() {
		return apellido;
	}
	
	/**
	 * Setea el apellido de una persona
	 * @param apellido Apellido que se desea setear
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 *  Devuelve el nombre de la persona
	 *  @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Setea el nombre de una persona
	 * @param nombre Nombre que se desea setear
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Devuelve el numero de documento de la persona
	 * @return numeroDocumento
	 */
	public int getNumeroDocumento() {
		return numeroDocumento;
	}
	
	/**
	 * Setea el numero de documento de una persona
	 * @param numeroDocumento Numero de documento que se desea setear
	 * @see TipoDocumento
	 */
	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
	/**
	 * Devuelve el tipo de documento de la persona
	 * @return tipoDocumento
	 * @see TipoDocumento
	 */
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	
	/**
	 * Setea el tipo de documento de una persona
	 * @param tipoDocumento Tipo de documento que se desea setear
	 * @see TipoDocumento
	 */
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}	
	
	@Override
	public String toString() {
		return this.nombre;
	}
}
