package lista5;

import java.util.Locale;
import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		double pesoQuilos, alturaMetros, imc;
		char novoCalculo = ' ';
	
		do{
		
			inseriLinha(80, '▬');
			System.out.print("\t\t\tCalculadora de IMC Generation");
			System.out.println();
			inseriLinha(80, '▬');
			System.out.println();
			System.out.print("IMC = Índice de Massa Corporal");
			System.out.println();
			System.out.println();
			System.out.print("Informe seu peso em quilos[Kg]: ");
			pesoQuilos = leia.nextDouble();
			System.out.println();
			System.out.print("Informe sua altura em metros[m]: ");
			alturaMetros = leia.nextDouble();
		
	
			imc = (pesoQuilos / (Math.pow(alturaMetros,2)));
			System.out.println();
			System.out.printf("Seu IMC é %.2f e de acordo com a tabela você está [", imc);
			if(imc < 18.5){
				System.out.print("ABAIXO DO PESO]");
			}
			else if(imc >= 18.5 && imc < 25){
				System.out.print("PESO NORMAL]");
			}
			else if (imc >=25 && imc <= 30){
				System.out.print("ACIMA DO PESO]");
			}
			else{
				System.out.print("OBESO]");
			}
			
			do {
				System.out.println();
				System.out.println();
				System.out.print("Deseja calcular novamente? [S/N]");
			 	System.out.println();
			 	novoCalculo = leia.next().toUpperCase().charAt(0);
			 	
			 	while(novoCalculo != 'S' && novoCalculo != 'N'){
			 		System.out.println();
			 		System.out.println();
			 		System.out.println();
			 		System.out.println();
			 		System.out.println();
			 		inseriLinha(80, '▼');
			 		System.out.println("Atenção a Opção escolhida é invalida. Tente novamente!!!");
			 		inseriLinha(80, '▼');
			 		System.out.println();
			 		break;
			 	}
			 	
			 	
			
			}while(novoCalculo != 'S' && novoCalculo != 'N');
		
		
		}while(novoCalculo == 'S');
		
		if(novoCalculo == 'N'){
			System.out.println();
			System.out.println("Encerrando....");
		}
		
		
		leia.close();
	}
	
	
	
	public static void inseriLinha(int tamanho, char simbolo) {

		for (int i = 0; i < tamanho; i++) {
			System.out.print(simbolo);
		}
		System.out.println();
	}

}
