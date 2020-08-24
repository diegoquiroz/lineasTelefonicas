package lineasTelefonicas;

public class LineaController {
	
	Linea linea;
	Llamadas llamadas;

	public LineaController(Linea linea, Llamadas llamadas) {
		this.linea = linea;
		this.llamadas = llamadas;
	}
	
	public void listarLlamadas() {
		llamadas.getLlamadas().stream().filter(obj -> obj.getLinea() == linea);	
	}

}
