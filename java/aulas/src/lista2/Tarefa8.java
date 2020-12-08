package lista2;

import java.util.Scanner;

public class Tarefa8 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Insira um numero: ");
		numero = leia.nextDouble();

		if(numero > 100) {
			System.out.println("A variavel numerica é: " + numero);
		}
		else {
			numero = 0;
			System.out.println("A variavel numerica é menor que 100 e vai ficar com o valor: "+ numero);
		}
		
		leia.close();

	}

}
