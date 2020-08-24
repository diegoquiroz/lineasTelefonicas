package lineasTelefonicas;

public class Llamada {

	private Linea linea;
	private int duracion;
	private float costo;
	private String tipo;
	private float CostoTotal;

	public Llamada(Linea linea, int duracion) {
		this.linea = linea;
		this.duracion = duracion;
	}
	
	public Llamada(Linea linea, int duracion, float costo, String tipo) {
		this.linea = linea;
		this.duracion = duracion;
		this.costo = costo;
		this.tipo = tipo;
	}
	
	/**
	 * @return void
	 */
	public float calcularCosto() {
		float duracionFloat = (float)duracion;
		this.CostoTotal = duracionFloat * costo;
		return CostoTotal;
	}

	/**
	 * @return the linea
	 */
	public Linea getLinea() {
		return linea;
	}

	/**
	 * @param linea the linea to set
	 */
	public void setLinea(Linea linea) {
		this.linea = linea;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	/**
	 * @return the costo
	 */
	public float getCosto() {
		return costo;
	}

	/**
	 * @param costo the costo to set
	 */
	public void setCosto(float costo) {
		this.costo = costo;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
