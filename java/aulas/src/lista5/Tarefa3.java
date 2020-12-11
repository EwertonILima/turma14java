package lista5;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, numero0a25 = 0, numero26a50 = 0, numero51a75 = 0, numero76a100 = 0;
		char novoNumero;
				
				do{	
					System.out.print("Insira um numero: ");
					numero = leia.nextInt();
					
				
					if(numero > 0 && numero <= 25){
						numero0a25++;
					}
					else if(numero <= 50){
						numero26a50++;
					}
					else if(numero <= 75){
						numero51a75++;
					}
					else if(numero <= 100){
						numero76a100++;
					}
					else{
						System.out.println("O numero inserido é negativo");
					}
					
					System.out.println();
				 	 
				 	System.out.println("Deseja inserir um novo numero? [S/N]");
				 	System.out.println();
				 	novoNumero = leia.next().toUpperCase().charAt(0);
				}while(novoNumero == 'S');
				
				if(novoNumero == 'N'){
					System.out.println();
					System.out.println("Quantidade de numeros de [0-25]: " + numero0a25);
					System.out.println();
					System.out.println("Quantidade de numeros de [26-50]: " + numero26a50);
					System.out.println();
					System.out.println("Quantidade de numeros de [51-75]: " + numero51a75);
					System.out.println();
					System.out.println("Quantidade de numeros de [76-100]: " + numero76a100);
					System.out.println();
					System.out.println("Encerrando....");
				}
				else{
					System.out.println("Opção Invalida");
				}
				
			
		leia.close();

	}

}
