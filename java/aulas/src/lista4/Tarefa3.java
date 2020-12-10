package lista4;

import java.util.Random;
import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Random aleatorio = new Random();
		
		int[][] matrizN1 = new int[4][6], matrizN2 = new int[4][6], matrizM1 = new int[4][6], matrizM2 = new int[4][6];
		
		//Valores e montagem da MatrizN1
		System.out.println("Matriz N1");
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				/*
				System.out.println();
				System.out.printf("Informe os dados da MatrizN2[%d][%d]: ", l ,c);
				matrizN2[l][c] = leia.nextInt();*/
				matrizN1[l][c] = aleatorio.nextInt(5) + 3;
				System.out.print("[" + matrizN1[l][c] + "] ");
			}
			System.out.println();
		}
		
		//Valores e montagem da MatrizN2
		System.out.println();
		System.out.println("Matriz N2");
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				/*
				System.out.println();
				System.out.printf("Informe os dados da MatrizN2[%d][%d]: ", l ,c);
				matrizN2[l][c] = leia.nextInt();*/
				matrizN2[l][c] = aleatorio.nextInt(5) + 3;
				System.out.print("[" + matrizN2[l][c] + "] ");
			}
			System.out.println();
		}
		
		//Valores e montagem da MatrizM1
		System.out.println("Matriz M1 é  a soma das Matrizes N1 e N2:");
		System.out.println();
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				matrizM1[l][c] = matrizN1[l][c] + matrizN2[l][c];
				System.out.print("[" + matrizM1[l][c] + "] ");
			}
			System.out.println();
		}
		
		//Valores e montagem da MatrizM2
		System.out.println();
		System.out.println("Matriz M2 é  a subtração das Matrizes N1 e N2::");
		System.out.println();
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				matrizM2[l][c] = matrizN1[l][c] - matrizN2[l][c];
				System.out.print("[" + matrizM2[l][c] + "] ");
			}
			System.out.println();
		}
		
		
		leia.close();
	}

}
