package lista2;
import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		double n1,n2,n3,n4;
		
		final double NUMEROLIMITE = 1000;
		
		System.out.print("Insira o primeiro numero: ");
		n1 = leia.nextDouble();
		System.out.println();
		System.out.print("Insira o segundo numero: ");
		n2 = leia.nextDouble();
		System.out.println();
		System.out.print("Insira o terceiro numero: ");
		n3 = leia.nextDouble();
		System.out.println();
		System.out.print("Insira o quarto numero: ");
		n4 = leia.nextDouble();
		System.out.println();

		if (Math.pow(n3, 2) >= NUMEROLIMITE){
			System.out.printf("O terceiro numero ao quadrado é: %.2f%n", Math.pow(n3, 2));		
		}
		else {
			System.out.printf("O primeiro  numero é %.1f e o seu quadrado %.2f %n" , n1, Math.pow(n1, 2));
			System.out.printf("O segundo numero é  %.1f e o seu quadrado %.2f %n" , n2, Math.pow(n2, 2));
			System.out.printf("O terceiro numero é  %.1f e o seu quadrado %.2f %n" , n3, Math.pow(n3, 2));
			System.out.printf("O quarto numero é  %.1f e o seu quadrado %.2f %n" , n4, Math.pow(n4, 2));
		
		}
		leia.close();
	}

}
