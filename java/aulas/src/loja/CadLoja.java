package loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		char opcaoMenuInicial = ' ', generoCliente;
		String nomeCliente;
		
		while(opcaoMenuInicial  != '1' && opcaoMenuInicial  != '2' && opcaoMenuInicial  != '3') {
		
			inseriLinha(80);
			System.out.println("CABELEIRERA LEILA");
			System.out.println("BELEZA É O NOSSO NEGOCIO!");
			inseriLinha(80);
			System.out.println();
			
			// MENU INICIAL
			System.out.println("[1] - COMPRAR PRODUTOS");
			System.out.println("[2] - GERENCIAR ESTOQUE");
			System.out.println("[3] - SAIR");
			System.out.println();
			System.out.print("DIGITE A OPÇÂO: ");
			opcaoMenuInicial = leia.next().charAt(0);
			
			//SELEÇÂO PARA O MENU
			if(opcaoMenuInicial  == '1') {
				System.out.print("Por favor informe seu nome: ");
				leia.nextLine();
				nomeCliente = leia.nextLine();
				System.out.print("Você se define como [M]-masculino, [F]-feminino ou [O] - outro : ");
				generoCliente = leia.next().toUpperCase().charAt(0);
				System.out.printf("Seja bem-vind%c, %s",verificaGenero(generoCliente), nomeCliente);
			}
			else if (opcaoMenuInicial  == '2') {
				System.out.println("WIP");
			}
			else if (opcaoMenuInicial  == '3') {
				System.out.println("Gratidão por escolher CABELEIRERA LEILA,  volte sempre!!!");
			}
			else {
					System.out.println("Opção invalida");
			}
		
		
		}
		
		leia.close();
		
	
	}
	
	//FUNÇÂO PARA GERAR LINHA
	public static void inseriLinha(int tamanho) {

		for (int i = 0; i < tamanho; i++) {
			System.out.print("░");
		}
		System.out.println();
	}
	
	//FUNÇÂO PARA VERIFICAR O GÊNERO
	public static char verificaGenero(char generoCliente) {
		
		if (generoCliente == 'M') {
			return 'o';
		}
		else if (generoCliente == 'F') {
			return 'a';
		}
		else {
			return 'x';
		}
		
	}

}
