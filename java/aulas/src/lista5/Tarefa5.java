package lista5;

import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		double numero[] = new double[5];
		int numeroCodigo;

				do{
					
					for(int i = 0 ; i < 5; i++){
						System.out.println();
						System.out.print("Insira o " + (i + 1) + "º numero: ");
						numero[i] = leia.nextDouble();
					}
					System.out.println();
					System.out.println();
					System.out.println("Digite uma das opçoes:");
					System.out.println();
					System.out.println("0 - Finaliza o programa");
					System.out.println();
					System.out.println("1 - Mostra o vetor na ordem direta");
					System.out.println();
					System.out.println("2 - Mostra o vetor na ordem inversa");
					System.out.println();
					numeroCodigo = leia.nextInt();
					System.out.println();
					if(numeroCodigo == 0){
						System.out.println("Programa Finalizado");
					}
					else if(numeroCodigo == 1){
						for(int i = 0 ; i < 5; i++){	
							System.out.print(" [" +  numero[i] + "] ");
						}	
					}
					else if(numeroCodigo == 2){
						for(int i = 4 ; i >= 0; i--){	
							System.out.print(" [" +  numero[i] + "] ");
						}
					}
					else{
						System.out.println("Código inválido");
					}
					System.out.println();
				
				}while(numeroCodigo != 0);
				
		leia.close();

	}

}
