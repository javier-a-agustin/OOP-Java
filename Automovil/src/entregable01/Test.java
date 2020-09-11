package entregable01;

public class Test {

	public static void main(String[] args) {

//		Automovil auto1 = new Automovil();
//		Automovil auto2 = new Automovil("Dodge");
//		Automovil auto3 = new Automovil("Chevrolet", "cualquierMarca");
		Automovil auto = new Automovil("Ford", "Falcon", "AAA111");
		
//		System.out.println(auto1.toString());
//		System.out.println(auto2.toString());
//		System.out.println(auto3.toString());
		System.out.println(auto.toString());
		
		auto.setColor("Negro oscuro");
		auto.setAnio(1965);
		auto.setVelocidadMaxima(150);
		
		System.out.printf("El auto %s del año %d, tiene un color %s y una velocidad maxima de %f \n", auto.toString(), auto.getAnio(), auto.getColor(), auto.getVelocidadMaxima());
		
		auto.setPatente("BBB 222");
		System.out.printf("Patente cambiada a %s \n", auto.getPatente());
		System.out.println(auto.toString());
		
		auto.arrancar();
		
		System.out.printf("Velocidad maxima de %s es %f \n", auto.toString(), auto.getVelocidadMaxima());
		
		auto.avanzar(200);
		auto.avanzar(130);
		
		auto.setColor("Blue");
		System.out.printf("El color ahora es %s \n", auto.getColor());
		
		
		
		
		
	}

}
