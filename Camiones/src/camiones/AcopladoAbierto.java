package camiones;

public class AcopladoAbierto extends Acoplado{
	
	public AcopladoAbierto(double volumenMaximo) {
		super(volumenMaximo);
	}
	
	public void cargarProducto(Producto producto) {
		
		if (producto instanceof ProductoFragil) {
			System.out.printf("Producto %d no se puede cargar en este tipo de acoplado\n", producto.getCodigo());
		} else if ( this.getVolumenTemporal() + (producto.getVolumen() * 1.1 ) <= this.getVolumenMaximo()  ) {
			this.agregarProducto(producto);
		} else {
			System.out.printf("Producto %d rechazado por exceso de volumen\n", producto.getCodigo());
			this.agregarProductoRechazado(producto);

		}
	}
}
