import java.util.Scanner;

public class Lista1Tarefa6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		double x1,y1,x2,y2;

		System.out.print("Insira a coordenada x1: ");
		x1 = leia.nextDouble();
		System.out.println();
		System.out.print("Insira a coordenada y1: ");
		y1 = leia.nextDouble();
		System.out.println();
		System.out.print("Insira a coordenada x2: ");
		x2 = leia.nextDouble();
		System.out.println();
		System.out.print("Insira a coordenada y2: ");
		y2 = leia.nextDouble();
		System.out.println();
		
		
		
		System.out.printf("A distancia entre ele é: %.2f" , Math.sqrt(Math.pow((x2-x1), 2) + (Math.pow((y2-y1), 2))));
		
		leia.close();
	}

}
