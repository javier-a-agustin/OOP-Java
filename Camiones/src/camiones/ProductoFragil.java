package camiones;

public class ProductoFragil extends Producto{
	
	private float valorRespaldo;
	
	public ProductoFragil(float volumen) {
		super(volumen);
	}
	
	public ProductoFragil(float volumen, float valorRespaldo) {
		this(volumen);		// Preguntar si es con this o con super directamente
		this.valorRespaldo = valorRespaldo;
	}

	public float getValorRespaldo() {
		return valorRespaldo;
	}

	public void setValorRespaldo(float valorRespaldo) {
		this.valorRespaldo = valorRespaldo;
	}
	
	
}
