package git2;

import java.util.Scanner;

public class Git2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Búsqueda de un número
		
		  Scanner scanner = new Scanner(System.in);
	      System.out.print("Introduce el número a buscar: ");
	      int numero = scanner.nextInt();

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
