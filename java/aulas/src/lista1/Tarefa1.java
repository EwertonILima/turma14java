package lista1;
import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		int idadeAnos, idadeMeses, idadeDias;
		
		System.out.print("Insira uma idade expressa em anos: ");
		idadeAnos = leia.nextInt();
		System.out.print("Insira uma idade expressa em meses: ");
		idadeMeses = leia.nextInt();
		System.out.print("Insira uma idade expressa em dias: ");
		idadeDias = leia.nextInt();
		System.out.println();
		
		System.out.println("Total em dias é: " + ( (idadeAnos*365) + (idadeMeses*30) + idadeDias ) + " dia(s).");
		
		
		leia.close();
	}

}
