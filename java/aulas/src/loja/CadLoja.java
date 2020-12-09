package loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		char opcaoMenuInicial = ' ', generoCliente, opcaoContinuacao = ' ';
		String nomeCliente;
		
		do {
			
			//BANNER EMPRESA
			BannerEmpresa();
			
			//MENU INICIAL
			MenuInicial();
			opcaoMenuInicial = leia.next().charAt(0);
			
			//SELEÇÂO PARA O MENU
			if(opcaoMenuInicial  == '1') {
				
				do{
					System.out.print("Por favor informe seu nome: ");
					leia.nextLine();
					nomeCliente = leia.nextLine();
					System.out.print("Você se define como [M]-masculino, [F]-feminino ou [O] - outro : ");
					generoCliente = leia.next().toUpperCase().charAt(0);
					System.out.printf("Seja bem-vind%c, %s",verificaGenero(generoCliente), nomeCliente);
					
					do {System.out.println();
						System.out.println("Deseja continuar? [S/N]");
						opcaoContinuacao = leia.next().toUpperCase().charAt(0);
							
							while(opcaoContinuacao != 'S' && opcaoContinuacao != 'N') {
								System.out.println();
								inseriLinha(80,'▼');
								System.out.println("Atenção a Opção  escolhida é invalida. Tente novamente!!!");
								inseriLinha(80,'▼');
								System.out.println();
								break;
							}
					}while(opcaoContinuacao != 'S' && opcaoContinuacao != 'N');
						
						if(opcaoContinuacao == 'N') {
							break;
						}
					
				}while(opcaoContinuacao != 'N');
			
			}
			else if (opcaoMenuInicial  == '2') {
				
				
				do{
					System.out.println("WIP");
					
					do {System.out.println();
						System.out.println("Deseja continuar? [S/N]");
						opcaoContinuacao = leia.next().toUpperCase().charAt(0);
							
							while(opcaoContinuacao != 'S' && opcaoContinuacao != 'N') {
								System.out.println();
								inseriLinha(80,'▼');
								System.out.println("Atenção a Opção  escolhida é invalida. Tente novamente!!!");
								inseriLinha(80,'▼');
								System.out.println();
								break;
							}
					}while(opcaoContinuacao != 'S' && opcaoContinuacao != 'N');
						
						if(opcaoContinuacao == 'N') {
							break;
						}
					
				}while(opcaoContinuacao != 'N');
				
			}
			else if (opcaoMenuInicial  == '3') {
				System.out.println();
				inseriLinha(80, '♥');
				System.out.println("Gratidão por escolher CABELEIRERA LEILA,  volte sempre!!!");
				inseriLinha(80, '♥');
				System.out.println();
			}
			
				
			while(opcaoMenuInicial  != '1' && opcaoMenuInicial  != '2' && opcaoMenuInicial  != '3') {
				System.out.println();
				inseriLinha(80, '▼');
				System.out.println("Atenção, a Opção escolhida é invalida. Tente novamente!!!");
				inseriLinha(80, '▼');
				System.out.println();
				break;
			}
	
		}while(opcaoMenuInicial  != '3');
		
		leia.close();
	
	}
	
	//FUNÇÂO PARA GERAR LINHA
	public static void inseriLinha(int tamanho, char simbolo) {

		for (int i = 0; i < tamanho; i++) {
			System.out.print(simbolo);
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
	
	
	
	//FUNÇÂO PARA O BANNER
	public static void BannerEmpresa() {
		
		inseriLinha(80,'░');
		System.out.println("CABELEIRERA LEILA");
		System.out.println("BELEZA É O NOSSO NEGOCIO!");
		inseriLinha(80,'░');
		System.out.println();
	}
	
	
	//FUNCAO PARA O MENU
	public static void MenuInicial() {
				
		System.out.println("[1] - COMPRAR PRODUTOS");
		System.out.println("[2] - GERENCIAR ESTOQUE");
		System.out.println("[3] - SAIR");
		System.out.println();
		System.out.print("DIGITE A OPÇÂO: ");
		
	}
	

}
