package lineasTelefonicas;

import java.util.ArrayList;

public class LlamadasController {
	
	Llamadas llamadas;

	public LlamadasController(Llamadas llamadas) {
		this.llamadas = llamadas;
	}
	
	public ArrayList<Llamada> listarLlamadas() {
		return llamadas.getLlamadas();
	}
	
	public void crearLlamada(Llamada llamada) {
		llamadas.guardarLlamada(llamada);
	}

}
