package lista2;
import java.util.Scanner;

public class Tarefa4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		
		int numero;
		String status;
	
		System.out.print("Insira um numero: ");
		numero = leia.nextInt();

		if (numero > 0) {
			status = "POSITIVO!";
			if (numero % 2 == 0) {
				System.out.println("O n�mero " + numero + " � PAR e � " + status);
			}
			else {
				System.out.println("O n�mero " + numero + " � IMPAR e � " + status);
			}
		}
		else if (numero < 0) {
			status = "NEGATIVO!";
			if (numero % 2 == 0) {
				System.out.println("O n�mero " + numero + " � PAR e � " + status);
			}
			else {
				System.out.println("O n�mero " + numero + " � IMPAR e � " + status);
			}
		}
		else {
			System.out.println("Numero inv�lido ou igual a zero");
		}
		
		leia.close();

	}

}
