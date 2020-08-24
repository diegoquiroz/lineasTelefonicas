package lineasTelefonicas;

public class LlamadaLocal extends Llamada {

	public LlamadaLocal(Linea linea, int duracion) {
		super(linea, duracion);
		this.setCosto((float)0.5);
		this.setTipo("Local");
	}

	public LlamadaLocal(Linea linea, int duracion, float costo, String tipo) {
		super(linea, duracion, costo, tipo);
	}

}
