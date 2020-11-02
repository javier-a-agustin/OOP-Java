package camiones;

public class Producto {
	
	private int codigo;
	private static int counter;
	private String descripcion;
	private float volumen;
//	private boolean rechazado = false;

	public Producto(float volumen) {
		this.volumen = volumen;
		this.codigo = ++Producto.counter;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getVolumen() {
		return volumen;
	}

	public void setVolumen(float volumen) {
		this.volumen = volumen;
	}

//	public boolean isRechazado() {
//		return rechazado;
//	}
//
//	public void setRechazado(boolean rechazado) {
//		this.rechazado = rechazado;
//	}
	
	
	

}
