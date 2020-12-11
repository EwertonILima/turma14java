package lista5;

public class Tarefa4 {

	public static void main(String[] args) {

		double i =1, j = 2, l = 1;
		double resultado, somaTotal = 0.0;
					
				System.out.println("soma= ");
				for( i = 1; i <= 50; i++){

					System.out.printf("%.0f/%.0f = " ,l ,i);
					
					resultado = (l/i);
					somaTotal = somaTotal + resultado;
					System.out.printf("%.2f",resultado);
					l += j;
					System.out.println();
				}

				System.out.printf("A soma total é %.2f",somaTotal);
	}

}
