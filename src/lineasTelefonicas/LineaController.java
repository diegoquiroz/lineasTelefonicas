package lineasTelefonicas;

import java.util.stream.Collectors;
import java.util.ArrayList;

public class LineaController {
	
	Linea linea;
	Llamadas llamadas;

	public LineaController(Linea linea, Llamadas llamadas) {
		this.linea = linea;
		this.llamadas = llamadas;
	}
	
	public ArrayList<Llamada> listarLlamadas() {
		return (ArrayList<Llamada>) llamadas.getLlamadas().stream().filter(obj -> obj.getLinea() == linea).collect(Collectors.toList());
	}
	
	public int listarDuracionLlamadas() {
		int suma = 0;
		for (int i = 0; i < listarLlamadas().size(); i++) {
			suma = suma + listarLlamadas().get(i).getDuracion();
		}
		return suma;
	}
	
	public float listarCostoLlamadas() {
		float suma = 0;
		for (int i = 0; i < listarLlamadas().size(); i++) {
			suma = suma + (listarLlamadas().get(i).getCosto() * listarLlamadas().get(i).getDuracion());
		}
		return suma;
	}

}
