package lista3;

public class Tarefa2 {

	public static void main(String[] args) {
		
		int somaNumeros = 0;
		
		for(int i = 1; i <= 500; i++) {
			
			if(i % 2 != 0 && i % 3 == 0) {
				somaNumeros += i;
			}
		}
		
		System.out.println("A soma dos números ímpares que são  múltiplos de três e que se encontram no conjunto dos números de 1 até 500 é " + somaNumeros);

	}

}
