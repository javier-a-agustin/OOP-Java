package entregable01;

public class Automovil {
	private String marca;
	private String modelo;
	private int anio;
	private String patente;
	private String color;
	private double velocidadMaxima;
	
	public Automovil() {
		// Empty constructor
		this("");
	}
	
	public Automovil(String marca) {
		// Constructor with one parameter
		this(marca, "");
	}
	
	public  Automovil(String marca, String modelo) {
		// Constructor with two parameters
		this(marca, modelo, "");
	}
	
	
	public  Automovil(String marca, String modelo, String patente) {
		// Constructor with three parameters
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %s", this.marca, this.modelo, this.patente);		
	}
	
	public void arrancar() {
		System.out.println(String.format("Encendiendo el %s", this.toString())); 
	}
	
	public void avanzar(double velocidad) {
		
		if (velocidad > this.velocidadMaxima ) {
			System.out.printf("%f km/h es muy rapido! este auto no puede ir a esa velocidad \n", velocidad);
		} else {
			System.out.printf("Avanzando a ... %f km/h \n", velocidad);
		}
	
	}
	
	public void frenar() {
		System.out.println("Frenando...");
	}
	
	
	// Getters and Setters

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	} 
}
