package lista5;

import java.util.Scanner;

public class Tarefa6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int tresElementos[] = new int[3], matriz3x3[][] = new int[3][3];

				for(int i = 0 ; i < 3; i++){	
					System.out.print("Insira o " + (i + 1) + "º numero: ");
					tresElementos[i] = leia.nextInt();
				}
				System.out.println();
				System.out.println();
				
				for(int l = 0 ; l < 3; l++){
					for(int c = 0 ; c < 3; c++){
						System.out.print("Insira os valores da matriz " + "[" +(l)+"," + (c) + "]" + ": ");	
						matriz3x3[l][c] = leia.nextInt();
					}
					System.out.println();
				}

				System.out.print("Numeros do vetor:");
				System.out.println();
				for(int i = 0 ; i < 3; i++){	
					System.out.print(tresElementos[i]);
				}

				
				System.out.println();
				System.out.println();
				System.out.println("Numeros da Matriz:");
				System.out.println();
				for(int l = 0 ; l < 3; l++){
					for(int c = 0 ; c < 3; c++){
						System.out.print(matriz3x3[l][c]+ " ")	;
					}
					System.out.println();
				}
				
				System.out.println();
				System.out.println();
				System.out.println("Numeros da Matriz Multiplicados:");
				System.out.println();
				for(int l = 0 ; l < 3; l++){
					for(int c = 0 ; c < 3; c++){
						matriz3x3[l][c] = matriz3x3[l][c] * tresElementos[c];
						System.out.print(matriz3x3[l][c]+ " ");
					}
					System.out.println();
				}
		
		leia.close();

	}

}
