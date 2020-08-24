package lineasTelefonicas;

public class LlamadaCelular extends Llamada {

	public LlamadaCelular(Linea linea, int duracion) {
		super(linea, duracion);
		this.setCosto((float)2.0);
		this.setTipo("Celular");
	}

	public LlamadaCelular(Linea linea, int duracion, float costo, String tipo) {
		super(linea, duracion, costo, tipo);
	}

}
