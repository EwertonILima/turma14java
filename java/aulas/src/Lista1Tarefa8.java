import java.util.Scanner;

public class Lista1Tarefa8 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica;
		
		System.out.print("Insira o custo de fabrica: ");
		custoFabrica = leia.nextDouble();
		System.out.println();

		System.out.printf("\nO custo do consumidor é: %.2f", ((custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45))));
		
		leia.close();
	}

}
