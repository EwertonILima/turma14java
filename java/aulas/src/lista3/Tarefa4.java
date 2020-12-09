package lista3;

import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeroMultiplicado = 0;
		
		System.out.print("Insira um numero: ");
		numeroMultiplicado  = leia.nextInt(); 
		System.out.print(numeroMultiplicado + " ");
		while(numeroMultiplicado < 100) {
			System.out.print(numeroMultiplicado*3 + " ");
			numeroMultiplicado = numeroMultiplicado * 3;
		}
		
		leia.close();

	}

}
