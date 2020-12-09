package lista3;

import java.util.Scanner;

public class Tarefa6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, contador = 1, somador = 1;
		
		System.out.print("Insira um numero: ");
		numero = leia.nextInt();
		do{
		
			contador++;
			somador = somador + contador;
		
		}while(contador != numero);
		
		System.out.println(somador);
		
		
		leia.close();
	}

}
