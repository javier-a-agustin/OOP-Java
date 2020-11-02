package camiones;

public class AcopladoCubierto extends Acoplado {
	
	public AcopladoCubierto(double volumenMaximo) {
		super(volumenMaximo);
	}
	
	public void cargarProducto(Producto producto) {
		// implementar "calcularVolumen" que calcule el volumen de empaquetado 
		
		if ( (producto instanceof ProductoFragil) && (this.getVolumenTemporal() + (producto.getVolumen() * 2 ) <= this.getVolumenMaximo() ) ){
			
			this.agregarProducto(producto);
			this.setVolumenTemporal(producto.getVolumen() * 2);
			
		} else if ((producto instanceof Producto) && (this.getVolumenTemporal() + (producto.getVolumen() * 1.1 ) <= this.getVolumenMaximo()) ) {
			
			this.agregarProducto(producto);
			this.setVolumenTemporal(producto.getVolumen() * 1.1 );
			
		} else {
			
			System.out.printf("Producto %d rechazado\n", producto.getCodigo());
			this.agregarProductoRechazado(producto);
			//producto.setRechazado(true);    //cambiar a toggle
			
		}
	}
}
