package lista2;
import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double pesoTomate, excessoTomate = 0, multaTomate = 0;
	
		final double LIMITEPESO = 50.0, VALOREXCEDENTE = 4.0;
	
		System.out.print("Insira a quantidade de tomate em quilos: ");
		pesoTomate = leia.nextDouble();
		System.out.println();
		
		if(pesoTomate <= 0) {
			System.out.println("Insira um peso válido");
		}
		else {
			if(pesoTomate > LIMITEPESO) {
				excessoTomate = pesoTomate - LIMITEPESO;
				multaTomate = excessoTomate * VALOREXCEDENTE;
			}
			System.out.printf("João Papo-de-Pescador, o senhor tem  %.2f quilos de tomate, o excedente é  %.2f quilos, e o valor da multa é de R$  %.2f  reais", pesoTomate, excessoTomate, multaTomate);
		}
		
		leia.close();
	}

}
