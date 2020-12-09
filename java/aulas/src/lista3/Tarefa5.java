package lista3;

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int contador = 233, acm = 5;
		
		do {
			
			System.out.print(contador + " ");
			contador = contador + acm;
			
			if(contador >= 300 && contador <= 400) {
				acm = 3;
			}
			else {
				acm = 5;
			}
			
			
		}while(contador <= 456);
		
		leia.close();
	}

}
