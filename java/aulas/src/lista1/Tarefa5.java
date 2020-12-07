package lista1;
import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double  n1, n2, n3;

		System.out.print("Insira a primeira nota: ");
		n1 = leia.nextDouble();
		System.out.println();
		System.out.print("Insira a segunda nota: ");
		n2 = leia.nextDouble();
		System.out.println();
		System.out.print("Insira a terceira nota: ");
		n3 = leia.nextDouble();
		System.out.println();

		System.out.println("A média é: " + (( (n1*2) + (n2*3) + (n3*5) )/10));
		
		leia.close();

	}

}
