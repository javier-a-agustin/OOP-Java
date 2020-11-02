package camiones;

public class Camion {
	
	private String marca;
	private int añoAdquisicion;
	private Chofer chofer;
	
	private Acoplado acoplado;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAñoAdquisicion() {
		return añoAdquisicion;
	}
	public void setAñoAdquisicion(int añoAdquisicion) {
		this.añoAdquisicion = añoAdquisicion;
	}
	public Chofer getChofer() {
		return chofer;
	}
	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}
	
	public Acoplado getAcoplado() {
		return acoplado;
	}
	public void setAcoplado(Acoplado acoplado) {
		this.acoplado = acoplado;
	}
	
	
	
	
}
