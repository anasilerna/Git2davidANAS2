package git2;

import java.util.Random;
import java.util.Scanner;

public class Git2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Búsqueda de un número
		
		  Scanner scanner = new Scanner(System.in);
	      System.out.print("Introduce el número a buscar: ");
	      int numero = scanner.nextInt();

		Random Rn = new Random();
		int[][] tablero = new int[5][5];
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = Rn.nextInt(100) + 1;
			}
		}
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j]);
			}
			System.out.println();
		}
	      boolean encontrado = false;
	      for (int i = 0; i < 5; i++) {
	          for (int j = 0; j < 5; j++) {
	              if (tablero[i][j] == numero) {
	                  System.out.println("Número encontrado en la posición: (" + i + ", " + j + ")");
	                  encontrado = true;
	                  break;
	              }
	          }
	          if (encontrado) break;
	      }

	      if (!encontrado) {
	          System.out.println("Número no encontrado.");
	      }
	}
