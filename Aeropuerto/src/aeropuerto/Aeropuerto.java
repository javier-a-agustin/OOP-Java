package aeropuerto;
import java.util.ArrayList;

/**
 * Clase que representa un aeropuerto
 * @author Javier Fernandez
 * @see Empresa
 */
public class Aeropuerto {
	
	private ArrayList<Empresa> empresas;
	
	/**
	 * Crea un aeropuerto
	 */
	public Aeropuerto() {
		this.empresas = new ArrayList<Empresa>();
	}
	
	/**
	 * Agrega una empresa a la lista de empresas del aeropuerto
	 * @param empresa Empresa que se desea agregar
	 */
	public void agregarEmpresa(Empresa empresa) {
		this.empresas.add(empresa);
	}
	
	/**
	 * Devuelve la lista de empresas que posee el aeropuerto
	 * @return empresas
	 */
	public ArrayList<Empresa> getEmpresas() {
		return this.empresas;
	}
	
	/**
	 * Muestra la informacion del aeropuerto. Mostrando por cada empresa los vuelos asociados
	 */
	public void infoEmpresas() {
		
		if (this.empresas.isEmpty()) {
			// Si no tengo ninguna empresa asociada
			System.out.println("Ninguna empresa registrada");
			
		} else {
			// Si tengo alguna empresa asociada las muestro
			for (Empresa empresa : this.empresas) {
				
				if (empresa.getVuelos().isEmpty()) {
					// Si no tengo vuelos asociados a mi empresa
					System.out.printf("\n=> Empresa: %s -- sin vuelos registrados\n", empresa.getNombreComercial());
				} else {
					// Si tengo vuelos asociados los muestro
					System.out.printf("\n=> Empresa: %s\n", empresa.getNombreComercial());
					empresa.mostrarVuelos();
				}
				
			}
		}
	
	}

}
