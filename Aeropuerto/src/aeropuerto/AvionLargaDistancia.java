package aeropuerto;

/**
 * Clase que representa avion de larga distancia
 * @author Javier Fernandez
 * @see Avion
 */

public class AvionLargaDistancia extends Avion{
	private boolean cuentaConRadar;
	
	/**
	 * Crea un avion de larga distancia
	 * @param patente Patente que se desea asiganar al avion
	 * @param capacidadMaxima Capacidad Maxima que se desea asignar
	 * @param capacidadCombustible Capacidad de combustible que se desea asociar
	 * @param cuentaConRadar Cuenta con radar - Verdadero o Falso segun corresponda
	 */
	public AvionLargaDistancia(String patente, int capacidadMaxima, double capacidadCombustible, boolean cuentaConRadar) {
		super(patente, capacidadMaxima, capacidadCombustible);
		this.cuentaConRadar = cuentaConRadar;
	}

	/**
	 * Devuelve verdadero o falso segun corresponda
	 * @return cuentaConRadar
	 */
	public boolean cuentaConRadar() {
		return cuentaConRadar;
	}

	/**
	 * Setea el valor de verdad de cuentaConRadar del avion
	 * @param cuentaConRadar Cuenta con radar - Valor de verdad que se desea asignar
	 */
	public void setCuentaConRadar(boolean cuentaConRadar) {
		this.cuentaConRadar = cuentaConRadar;
	}
	
	
}
