package git2;

import java.util.Random;

public class Git2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	}

}
