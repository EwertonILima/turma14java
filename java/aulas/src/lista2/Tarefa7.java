package lista2;

import java.util.Scanner;

public class Tarefa7 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		double baseTriangulo, alturaTriangulo;
		
		System.out.println("Insira o valor para ser base do Triangulo em centimetros: ");
		baseTriangulo = leia.nextDouble();
		System.out.println("Insira o valor para ser altura do Triangulo em centimetros:");
		alturaTriangulo = leia.nextDouble();

		if(baseTriangulo > 0 && alturaTriangulo > 0) {
			System.out.println("Os valores são válidos");
			System.out.printf("A aréa do triangulo é: %.2f cm" , (baseTriangulo * alturaTriangulo) / 2);
		}
		else {
			System.out.println("Insira valores positivos maiores que zero");
		}
		
		leia.close();
	}


}
