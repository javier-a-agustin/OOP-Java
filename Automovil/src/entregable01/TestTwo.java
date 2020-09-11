package entregable01;

public class TestTwo {

	public static void main(String[] args) {
		
		Automovil auto = new Automovil();
		
		System.out.println(auto.toString());
		
		auto.setMarca("Dodge");
		
		// System.out.println(auto.toString());
		
		auto.setAnio(2020);
		auto.setModelo("Ram");
		auto.setPatente("ZZZ 999");
		auto.setColor("Blanco");
		auto.setVelocidadMaxima(300);
		
		System.out.println(auto.toString());
		
		auto.arrancar();
		
		auto.avanzar(400);
		auto.avanzar(200);
		auto.frenar();
		
		auto.setColor("Rojo");
		System.out.println(auto.getColor());
		
	}

}
