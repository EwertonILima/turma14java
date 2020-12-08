package lista2;

import java.util.Scanner;

public class Tarefa6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idadeNadador;
		
		System.out.print("Insira a idade do nadador: ");
		idadeNadador = leia.nextInt();

		if(idadeNadador >= 18) {
			System.out.println("Categoria Adulto");
		}
		else if(idadeNadador >= 14 && idadeNadador <= 17) {
			System.out.println("Categoria Juvenil B");
		}
		else if(idadeNadador >= 12 && idadeNadador <= 13) {
			System.out.println("Categoria Juvenil A");
		}
		else if(idadeNadador >= 8 && idadeNadador <= 11) {
			System.out.println("Categoria Infantil B");
		}
		else if(idadeNadador >= 5 && idadeNadador <= 7) {
			System.out.println("Categoria Infantil B");
		}
		else {
			System.out.println("Sem Categoria");
		}
		
		leia.close();
	}

}
