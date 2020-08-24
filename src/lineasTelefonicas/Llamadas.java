package lineasTelefonicas;

import java.util.ArrayList;

public class Llamadas {

	private ArrayList<Llamada> llamadasList;
	
	public Llamadas() {
		this.llamadasList = new ArrayList<Llamada>();
	}
	
	public ArrayList<Llamada> getLlamadas() {
		return llamadasList;
	}
	
	public void guardarLlamada(Llamada llamada) {
		llamadasList.add(llamada);
	}
	
	public void eliminarLlamada(Llamada llamada) {
		llamadasList.remove(llamada);
	}
	
	public int getSize() {
		return llamadasList.size();
	}

}
