package lista6;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Aviao aviao1 = new Aviao();
		

		System.out.println("Ligar motor do avião?");
		aviao1.motoLigado = leia.next().toUpperCase();
		System.out.println("Quanto de combustivel deseja colocar?");
		aviao1.combustivel = leia.nextInt();
		
		System.out.println();
		System.out.print("Autorização: ");
		aviao1.liberacaoPista();
		
		aviao1.percurso();
		
		leia.close();
	}

}
