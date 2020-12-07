import java.util.Scanner;

public class Lista1Tarefa2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idadeDias;
		
		System.out.print("Insira uma idade expressa em dias: ");
		idadeDias = leia.nextInt();
		System.out.println();
		
		System.out.println("O seu tempo na terra é: " + (idadeDias / 365) + " ano(s), " + (idadeDias % 365 / 30) + " mes(es), " + (idadeDias % 365 % 30)  + " dia(s)");
		
		leia.close();
	}

}
