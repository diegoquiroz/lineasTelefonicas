package lineasTelefonicas;

public class LlamadaLargaDistancia extends Llamada {

	public LlamadaLargaDistancia(Linea linea, int duracion) {
		super(linea, duracion);
		this.setCosto((float)1.0);
		this.setTipo("Larga distancia");
	}

	public LlamadaLargaDistancia(Linea linea, int duracion, float costo, String tipo) {
		super(linea, duracion, costo, tipo);
	}

}
