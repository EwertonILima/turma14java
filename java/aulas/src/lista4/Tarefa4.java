package lista4;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz3x3 = new int[3][3];
		int somaTotal = 0, somaDiagonal = 0;
		
		System.out.println("Insira os valores da Matriz3x3: ");
		System.out.println();
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				System.out.printf("Valor da Matriz[%d][%d]: ", l , c);
				matriz3x3[l][c] = leia.nextInt();
				somaTotal += matriz3x3[l][c];
				somaDiagonal += (l == c )? matriz3x3[l][c] : 0 ; 
			}
			System.out.println();
		}
		
		System.out.println("A soma de todos os valores é: " + somaTotal);
		System.out.println("A soma da diagonal principal é: " + somaDiagonal);
		
		
		leia.close();
	}

}
