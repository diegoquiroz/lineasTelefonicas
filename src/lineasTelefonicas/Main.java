package lineasTelefonicas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Linea linea1 = new Linea("2244266288");
		Linea linea2 = new Linea("1234567890");
		Linea linea3 = new Linea("2468101214");
		
		Llamadas database = new Llamadas();
		
		LlamadasController lc = new LlamadasController(database);
		
		LineaController lc1 = new LineaController(linea1, database);
		LineaController lc2 = new LineaController(linea2, database);
		LineaController lc3 = new LineaController(linea3, database);
		
		Scanner scanner = new Scanner(System.in);
		
		Linea lineaLlamada;
		Llamada call;
		LineaController lineaController;
		int input = 1;
		
		while(input != 0) {
			System.out.println("Introduce el número de la operación a realizar");
			System.out.println("0) Salir");
			System.out.println("1) Agregar una llamada telefónica");
			System.out.println("2) Ver información de las líneas");
			System.out.println("3) Obtener información de todas las líneas");
			System.out.println("4) Reiniciar líneas");
			
			input = scanner.nextInt();
			
			if (input == 1) {
				System.out.println("AGREGAR UNA NUEVA LLAMADA A LA BASE DE DATOS");
				System.out.println("¿De cuántos minutos fue?");
				int minutosLlamada = scanner.nextInt();
				
				System.out.println("¿De qué línea fue la llamada? 1, 2 ó 3");
				int lineaNum = scanner.nextInt();
				if (lineaNum == 1) lineaLlamada = linea1;
				else if (lineaNum == 2) lineaLlamada = linea2;
				else lineaLlamada = linea3;
				
				System.out.println("¿Qué tipo de llamada es? 1, 2 ó 3");
				System.out.println("1) Local");
				System.out.println("2) Larga distancia");
				System.out.println("3) Celular");
				int tipoLlamadaNum = scanner.nextInt();
				
				
				if (tipoLlamadaNum == 1) call = new LlamadaLocal(lineaLlamada, minutosLlamada);
				else if (tipoLlamadaNum == 2) call = new LlamadaLargaDistancia(lineaLlamada, minutosLlamada);
				else call = new LlamadaCelular(lineaLlamada, minutosLlamada);
				
				database.guardarLlamada(call);

				
			} else if (input == 2) {
				System.out.println("¿Qué línea quieres ver? 1, 2 ó 3");
				int lineaNum = scanner.nextInt();
				
				if (lineaNum == 1)
					lineaController = lc1;
				else if (lineaNum == 2)
					lineaController = lc2;
				else
					lineaController = lc3;
				
				System.out.format("Total de llamadas: %d \n", lineaController.listarLlamadas().size());
				System.out.format("Total de minutos: %d \n", lineaController.listarDuracionLlamadas());
				System.out.format("Total de costo: %f \n", lineaController.listarCostoLlamadas());
				
			} else if (input == 3) {
				System.out.format("Total de llamadas: %d \n", database.getSize());
				int sumaMinutos = lc1.listarDuracionLlamadas()+lc2.listarDuracionLlamadas()+lc3.listarDuracionLlamadas();
				System.out.format("Total de minutos: %d \n", sumaMinutos);
				float sumaCosto = lc1.listarCostoLlamadas()+lc2.listarCostoLlamadas()+lc3.listarCostoLlamadas();
				System.out.format("Total de costo: %f \n", sumaCosto);
				float promedio = sumaCosto/sumaMinutos;
				System.out.format("Promedio por minuto: %f \n", promedio);
				
			} else if (input == 4) {
				database = new Llamadas();
				lc1 = new LineaController(linea1, database);
				lc2 = new LineaController(linea2, database);
				lc3 = new LineaController(linea3, database);
			}

		}
		
	}

}
