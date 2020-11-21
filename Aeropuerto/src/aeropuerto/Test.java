package aeropuerto;

public class Test {

	public static void main(String[] args) {
		
		Empresa empresaUno = new Empresa("Empresa uno", "12341234");
		Empresa empresaDos = new Empresa("Empresa dos", "43214321");
		
		
		Avion avionLarga = new AvionLargaDistancia("ABC123", 150, 1000, false);
		Avion avionSanitario = new AvionSanitario("JHY333", 30, 140, TipoMotor.Turbina, "buen equipo");
		Avion avionCorta = new AvionCortaDistancia("OPP", 1, 3000, TipoMotor.Helice);
		
		Aeropuerto aeropuerto = new Aeropuerto();
		empresaUno.agregarAvion(avionLarga);
		empresaUno.agregarAvion(avionCorta);
		
		empresaDos.agregarAvion(avionSanitario);
		
		aeropuerto.agregarEmpresa(empresaUno);
		
		aeropuerto.agregarEmpresa(empresaDos);
		
		Persona pepe = new Persona("Pepe");
		Persona pepito = new Persona("Pepido");
		Persona pasajeroUno = new Persona("Pasajero uno");
		Persona pasajeroDos = new Persona("Persona con heridas");
		Persona pilotoUno = new Persona("El piloto");
		
		
		Vuelo vueloUno = new Vuelo(avionCorta, pilotoUno, "Miami", "Argentina");
		Vuelo vueloDos = new Vuelo(avionSanitario, pilotoUno, "Argentina", "Chile");
		Vuelo vueloTres = new Vuelo(avionLarga, pilotoUno, "Chile", "Miami");
		
		Pasaje pasajeUno = new Pasaje(pepe);
		Pasaje pasajeDos = new Pasaje(pepito);
		Pasaje pasajeTres = new PasajeSanitario(pasajeroDos);
		Pasaje pasajeCuatro = new PasajeSanitario(pasajeroDos);
		Pasaje pasajeCinco = new Pasaje(pasajeroUno);

		
		try {
			vueloUno.registrarPasaje(pasajeCinco);

			
		} catch (PasajeInvalidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		catch (CapacidadMaximaException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			vueloUno.registrarPasaje(pasajeUno);

			
		} catch (PasajeInvalidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		catch (CapacidadMaximaException e) {
			System.out.println(e.getMessage());
		}
		
		try {

			vueloUno.registrarPasaje(pasajeTres);

			
		} catch (PasajeInvalidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		catch (CapacidadMaximaException e) {
			System.out.println(e.getMessage());
		}
		
		try {

			vueloDos.registrarPasaje(pasajeCuatro);
			

			
		} catch (PasajeInvalidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		catch (CapacidadMaximaException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		try {

			vueloTres.registrarPasaje(pasajeUno);

			
		} catch (PasajeInvalidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		catch (CapacidadMaximaException e) {
			System.out.println(e.getMessage());
		}
		
		try {

			vueloTres.registrarPasaje(pasajeDos);
			
		} catch (PasajeInvalidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		catch (CapacidadMaximaException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			vueloTres.registrarPasaje(pasajeTres);
			
		} catch (PasajeInvalidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		catch (CapacidadMaximaException e) {
			System.out.println(e.getMessage());
		}
		

		empresaUno.agregarVuelo(vueloUno);
		empresaUno.agregarVuelo(vueloTres);
		
		empresaDos.agregarVuelo(vueloDos);

		aeropuerto.infoEmpresas();

		
	}

}
