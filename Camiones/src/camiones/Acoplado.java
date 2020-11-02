package camiones;

import java.util.Stack;

public abstract class Acoplado {
	
	private double capacidadMaxima;
	private double capacidadTemporal;
	private double volumenMaximo;
	private double volumenTemporal = 0;
	
	private Stack<Producto> productos = new Stack<Producto>();
	
	private Stack<Producto> productosRechazados = new Stack<Producto>();

	
	public Acoplado(double volumenMaximo) {
		this.volumenMaximo = volumenMaximo;
	}
	
	public abstract void cargarProducto(Producto producto);

	public Stack<Producto> getProductos() {
		return productos;
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.push(producto);
	}
	
	public void agregarProductoRechazado(Producto producto) {
		this.productosRechazados.push(producto);
	}

	public double getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(double capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public double getCapacidadTemporal() {
		return capacidadTemporal;
	}

	public void setCapacidadTemporal(double capacidadTemporal) {
		this.capacidadTemporal = capacidadTemporal;
	}

	public double getVolumenMaximo() {
		return volumenMaximo;
	}

	public void setVolumenMaximo(double volumenMaximo) {
		this.volumenMaximo = volumenMaximo;
	}

	public double getVolumenTemporal() {
		return volumenTemporal;
	}

	public void setVolumenTemporal(double volumenTemporal) {
		this.volumenTemporal += volumenTemporal;
	}
	
	
	
}
