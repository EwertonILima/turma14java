package lista3;

public class Tarefa2 {

	public static void main(String[] args) {
		
		int somaNumeros = 0;
		
		for(int i = 1; i <= 500; i++) {
			
			if(i % 2 != 0 && i % 3 == 0) {
				somaNumeros += i;
			}
		}
		
		System.out.println("A soma dos n�meros �mpares que s�o  m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500 � " + somaNumeros);

	}

}
