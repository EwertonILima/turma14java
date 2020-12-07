package lista1;
import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int tempoSegundos;

		System.out.print("Insira o tempo em segundos: ");
		tempoSegundos = leia.nextInt();
		System.out.println();
		
		System.out.println("O tempo do evento é: " + 
		(tempoSegundos / 3600) + " hora(s), " + 
		(tempoSegundos / 60 % 60) + " minuto(s), " + 
		(tempoSegundos % 60)  + " segundo(s)");
	
		
		leia.close();
	}

}
