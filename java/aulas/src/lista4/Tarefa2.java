package lista4;

import java.util.Random;
import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Random aleatorio = new Random();
		
		final int  LANCAMENTOS = 10;
		int[] valores = new int[LANCAMENTOS];
		int somaLancamento = 0, maiorLancamento = 0, contaMaior = 0;
		
		System.out.println("Jogue o dado [1-6]");
		
		for(int i = 1; i <= LANCAMENTOS; i++){
			
			/*System.out.printf(" %d� lan�amento: ", i);
			valores[i - 1] = leia.nextInt();*/
			
			valores[i - 1] = aleatorio.nextInt(6) + 1;
			System.out.printf(" %d� lan�amento: %d%n", i, valores[i -1]);
			somaLancamento += valores[i - 1];
			
			if(valores[i - 1] >= maiorLancamento) {
				
				if(valores[i - 1] > maiorLancamento) {
					contaMaior = 0;
				}
				maiorLancamento = valores[i - 1];
				contaMaior++;
			}
		}
		System.out.println("O maior lan�amento foi: " + maiorLancamento);
		System.out.println("A m�dia dos valores lan�ados foi " +  somaLancamento / LANCAMENTOS);
		System.out.println("A maior pontua��o foi lan�ada " + contaMaior + " vezes");
		
		leia.close();
	}

}
