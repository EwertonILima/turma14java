import java.util.Scanner;

public class Lista1Tarefa7 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double a,b,c,d,e,f;

		
		System.out.print("Insira o coeficiente a: ");
		a = leia.nextDouble();
		System.out.println();
		System.out.print("Insira o coeficiente b: ");
		b = leia.nextDouble();
		System.out.println();
		System.out.print("Insira o coeficiente c: ");
		c = leia.nextDouble();
		System.out.println();
		System.out.print("Insira o coeficiente d: ");
		d = leia.nextDouble();
		System.out.println();
		System.out.print("Insira o coeficiente e: ");
		e = leia.nextDouble();
		System.out.println();
		System.out.print("Insira o coeficiente f: ");
		f = leia.nextDouble();
		System.out.println();
		
		System.out.print("O resultado de x é: " + ((((c*e) - (b*f)) / ((a*e) - (b*d))) +  " e o resultado de y é: " + (((a*f) - (c*d)) / ((a*e) -(b*d)))));
	
		leia.close();
	}


}
