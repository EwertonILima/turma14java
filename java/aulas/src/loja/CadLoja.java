package loja;

import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String codigosProdutos[] = new String[10];
		String	nomesProdutos[] = {"XAMPU","CONDICIONADOR","TINTA PARA CABELO","GEL","CERA","LAQUE DE FIXAÇÂO","KIT PARA CRESCIMENTO DE CABELO","KIT ESCOVAS DE CABELO","KIT HIDRATAÇÂO","KIT BANHO DE VERNIZ"}; 
		double precosProdutos[] = {65,65,50,20,30,80,120,35,80,40};
		int estoqueProdutos[] = new int[10];
		char opcaoMenuInicial = ' ', opcaoContinuacao = ' ';
		String  escolhaCodigo;
		double carroValores[] = new double[10];
		int carroQuantidade[] = new int[10];
		double valorTotalCarro = 0;
	
		
		//PREENCHE O ESTOQUE E O CODIGO DO PRODUTO
		for (int i = 0; i < 10; i++) {
			estoqueProdutos[i]=10;
			codigosProdutos[i]=(i<9)?"CLE-00"+(i+1):"CLE-0"+(i+1);
		}
		
		do {
			
			//BANNER EMPRESA
			BannerEmpresa();
			
			//MENU INICIAL
			MenuInicial();
			opcaoMenuInicial = leia.next().charAt(0);
			
			//SELEÇÂO PARA O MENU
			if(opcaoMenuInicial  == '1') {
				
				do{
					entradaClientes();
					
					System.out.println("CODIGO\t\tR$(UN)\t\tESTOQUE\t\tPRODUTO");
				
					inseriLinha(80, '▬');
					
					for (int i = 0; i < 10; i++) {
						System.out.printf("%s\t\t%.2f\t\t%d\t\t%s\n",codigosProdutos[i],precosProdutos[i],estoqueProdutos[i],nomesProdutos[i]);
					}
					do {
						System.out.println();
						System.out.print("Informe o codigo do produto desejado: ");
						escolhaCodigo = leia.next().toUpperCase();
					
						for(int i = 0; i < nomesProdutos.length; i++) {
							
							if(codigosProdutos[i].equals(escolhaCodigo)) {
								carroValores[i] += precosProdutos[i];
								valorTotalCarro  += carroValores[i];
								estoqueProdutos[i]--;
								carroQuantidade[i]++;
								inseriLinha(80, '▬');
								System.out.println("\t\t\tItens do seu Carrinho:");
								inseriLinha(80, '▬');
								System.out.println("CODIGO\t\tR$(UN)\t\tQUANTIDADE\tPRODUTO");
								
								inseriLinha(80, '▬');
								
								for (i = 0; i < 10; i++) {
									if(carroQuantidade[i] > 0) {
									System.out.printf("%s\t\t%.2f\t\t   %d\t\t %s\n",codigosProdutos[i],carroValores[i],carroQuantidade[i],nomesProdutos[i]);
									}
									
								}
								inseriLinha(80, '▬');
								System.out.println("\t\t\t\t\t\t\t\tVALOR TOTAL");
								inseriLinha(80, '▬');
								System.out.printf("\t\t\t\t\t\t\t\t %.2f\n",valorTotalCarro);
							}
						
							
						}
						do {
							System.out.println();
							System.out.println("Deseja continuar comprando? [S/N] ");
							opcaoContinuacao = leia.next().toUpperCase().charAt(0);
							
							while(opcaoContinuacao != 'S' && opcaoContinuacao != 'N') {
								System.out.println();
								inseriLinha(80,'▼');
								System.out.println("Atenção a Opção escolhida é invalida. Tente novamente!!!");
								inseriLinha(80,'▼');
								System.out.println();
								break;
							}
							
						}while(opcaoContinuacao != 'S' && opcaoContinuacao != 'N');
						
						
					}while(opcaoContinuacao != 'N');
					
					//ZERAR O CARRINHO DE COMPRA
					for (int i = 0; i < 10; i++) {
						carroQuantidade[i] = 0;
						carroValores[i] = 0;
						valorTotalCarro = 0;
					}
					
					do {System.out.println();
						System.out.println("Deseja continuar como outro Cliente? [S/N]");
						opcaoContinuacao = leia.next().toUpperCase().charAt(0);
							
							while(opcaoContinuacao != 'S' && opcaoContinuacao != 'N') {
								System.out.println();
								inseriLinha(80,'▼');
								System.out.println("Atenção a Opção escolhida é invalida. Tente novamente!!!");
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
								System.out.println("Atenção a Opção escolhida é invalida. Tente novamente!!!");
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
				System.out.println("Gratidão por escolher CABELEIRERA LEILA, volte sempre!!!");
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
	
	//FUNCAO PARA O ENTRADA DE CLIENTES
	public static void entradaClientes() {
		
		Scanner leia = new Scanner(System.in);
		
		String nomeCliente;
		char generoCliente;
		
		System.out.println();
		System.out.print("Por favor informe seu nome: ");
		nomeCliente = leia.nextLine();
		System.out.print("Você se define como [M]-masculino, [F]-feminino ou [O] - outro : ");
		generoCliente = leia.next().toUpperCase().charAt(0);
		System.out.printf("Seja bem-vind%c, %s %n",verificaGenero(generoCliente), nomeCliente);
		System.out.println();
		inseriLinha(80,'▬');
	}
	

}
