import java.util.Scanner;

public class Lista1Tarefa4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Insira o primeiro numero: ");
		a = leia.nextInt();
		System.out.println();
		System.out.print("Insira o segundo numero: ");
		b = leia.nextInt();
		System.out.println();
		System.out.print("Insira o terceiro numero: ");
		c = leia.nextInt();
		System.out.println();
		
		System.out.println("Resultado da expressão é: "  + ((Math.pow((a + b), 2) + (Math.pow((b + c), 2))) / 2));
		
		leia.close();
	}

}
