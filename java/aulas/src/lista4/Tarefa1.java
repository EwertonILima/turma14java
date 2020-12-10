package lista4;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] vetorPontuacao = new int [5];
		int maiorPontuacao = 0;
		
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Insira o %dº o valor: ", i + 1);
			vetorPontuacao[i] = leia.nextInt();
			
			if (vetorPontuacao[i] > maiorPontuacao) {
				maiorPontuacao = vetorPontuacao[i];
			}
		}
		
		System.out.println();
		System.out.print("Os valores dos vetor são: ");
		for(int i = 0; i <5; i++) {
			System.out.print( vetorPontuacao[i] + ", ");
		}
		
		System.out.println();
		System.out.printf("A maior pontuação é %d.", maiorPontuacao);
		
		leia.close();
	}

}
