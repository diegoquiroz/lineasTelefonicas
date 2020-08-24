package lineasTelefonicas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Linea line1 = new Linea("6421390333");
		LlamadaCelular call1 = new LlamadaCelular(line1, 5);
		LlamadaLargaDistancia call2 = new LlamadaLargaDistancia(line1, 3);
		
		System.out.println(call2.calcularCosto());
		
		

	}

}
