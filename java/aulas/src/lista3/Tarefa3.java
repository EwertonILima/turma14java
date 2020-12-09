package lista3;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numerosInseridos = 0, somaNumeros = 0, contaNumeros = 0;
		
		while(numerosInseridos >=0) {
			System.out.print("Insira um numero: ");
			numerosInseridos = leia.nextInt();
			if(numerosInseridos >=0){
				
				somaNumeros += numerosInseridos;
				contaNumeros++;
			}
			
		}
		
		System.out.printf("A soma de todos os numeros inseridos é %d%n", somaNumeros);
		System.out.printf("A média dos valores inseridos é %.2f%n",(double) (somaNumeros / contaNumeros));
		System.out.printf("A quantidade de numeros inseridos é %d%n", contaNumeros);
		
		
		leia.close();
	}

}
