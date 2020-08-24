package lineasTelefonicas;

public class LlamadasController {
	
	Llamadas llamadas;

	public LlamadasController(Llamadas llamadas) {
		this.llamadas = llamadas;
	}
	
	public void listarLlamadas() {
		llamadas.getLlamadas();
	}
	
	public void crearLlamada(Llamada llamada) {
		llamadas.guardarLlamada(llamada);
	}

}
