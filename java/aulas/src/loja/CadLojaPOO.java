package loja;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CadLojaPOO {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		List<Cliente> listaClientes = new ArrayList<>();
		
		
		List<Produto> listaProdutos = new ArrayList<>();
		Produto a = new Produto("CLE-001","XAMPU", 65, 10);
		Produto b = new Produto("CLE-002","CONDICIONADOR", 65, 10);
		Produto c = new Produto("CLE-003","TINTA PARA CABELO", 50, 10);
		Produto d = new Produto("CLE-004","GEL", 20, 10);
		Produto e = new Produto("CLE-005","CERA", 30, 10);
		Produto f = new Produto("CLE-006","LAQUE DE FIXAÇÂO", 80, 10);
		Produto g = new Produto("CLE-007","KIT PARA CRESCIMENTO DE CABELO", 120, 10);
		Produto h = new Produto("CLE-008","KIT ESCOVAS DE CABELO", 35, 10);
		Produto i = new Produto("CLE-009","KIT HIDRATAÇÂO", 80, 10);
		Produto j = new Produto("CLE-010","KIT BANHO DE VERNIZ", 40, 10);
		
		
		listaProdutos.add(a);
		listaProdutos.add(b);
		listaProdutos.add(c);
		listaProdutos.add(d);
		listaProdutos.add(e);
		listaProdutos.add(f);
		listaProdutos.add(g);
		listaProdutos.add(h);
		listaProdutos.add(i);
		listaProdutos.add(j);

		String nome, cpf, nomeProduto, escolhaCodigo;
		int anoNascimento, qtdEstoque, escolhaQuantidade = 0, notaFiscal = 0;
		double valorProduto, valorTotalCarro = 0, valorImposto = 0;
		char genero, opcaoMenuInicial = ' ', opcaoMenuCompra = ' ', opcaoMenuEstoque = ' ', opcaoMenuProduto = ' ', opcaoContinuacao = ' ', opcaoPagamento = ' ' ;

		do {
			
			//BANNER EMPRESA
			BannerEmpresa();
			
			//MENU INICIAL
			MenuInicial();
			opcaoMenuInicial = leia.next().charAt(0);
			
			//SELEÇÂO PARA O MENU INICIAL
			if(opcaoMenuInicial  == '1') {
				
				do{
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("[1] - NOVO CADASTRO");
					System.out.println("[2] - CLIENTE CADASTRADO");
					System.out.println("[3] - LISTA DE CLIENTES");
					System.out.println("[4] - SAIR");
					System.out.println();
					System.out.print("DIGITE A OPÇÂO: ");
					opcaoMenuCompra = leia.next().charAt(0);
					
					
					//SELEÇÂO PARA O MENU SECUNDARIO
					if(opcaoMenuCompra  == '1') {
					
					
						do{
							
							System.out.println();
							System.out.print("Por favor informe seu nome: ");
							leia.nextLine();
							nome = leia.nextLine();
							System.out.print("Você se define como [M]-masculino, [F]-feminino ou [O]-outro: ");
							genero = leia.next().toUpperCase().charAt(0);
							do {
								System.out.print("Informe o ano do seu nascimento: ");
								anoNascimento = leia.nextInt();
								while(anoNascimento < 1900) {
									System.out.println();
									inseriLinha(80, '▼');
									System.out.println("Atenção, ano de nascimento invalida. Tente novamente!!!");
									inseriLinha(80, '▼');
									System.out.println();
									break;
								}
							
							}while(anoNascimento < 1900);
							
							do {
								System.out.print("Informe seu CPF: ");
								cpf = leia.next();
								while(cpf.equals("0") || cpf.equals("000.000.000-00") || cpf.equals("0000000000")) {
									System.out.println();
									inseriLinha(80, '▼');
									System.out.println("Atenção, numero de CPF invalido. Tente novamente!!!");
									inseriLinha(80, '▼');
									System.out.println();
									break;
								}
							}while(cpf.equals("0") || cpf.equals("000.000.000-00") || cpf.equals("0000000000"));
							
							Cliente clientes = new Cliente(nome, genero,anoNascimento,cpf);
							
							listaClientes.add(clientes);
							
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.println();
							System.out.printf("Seja bem-vind%c, %s, Idade: %d, CPF:%s %n",clientes.verificaGenero(genero), clientes.getNome(), clientes.voltaIdade(anoNascimento), clientes.getCpf());
							
				
							System.out.println();
							inseriLinha(80,'▬');
							
							System.out.println("CODIGO\t\tR$(UN)\t\tESTOQUE\t\tPRODUTO");
						
							inseriLinha(80, '▬');
							
							
							do {
								for (Produto prod: listaProdutos) {
									System.out.printf("%s\t\t%.2f\t\t%d\t\t%s\n",prod.getCodigo(),prod.getPrecoUnitario(),prod.getQtdeProdutoEstoque(),prod.getProduto());
								}
								System.out.println();
								System.out.print("Informe o codigo do produto desejado: ");
								escolhaCodigo = leia.next().toUpperCase();
							
								for(Produto prod: listaProdutos) {
									
									if(prod.getCodigo().equals(escolhaCodigo)) {
										
										do{
											System.out.println();
											System.out.print("Informe a quantidade do produto: ");
											escolhaQuantidade = leia.nextInt();
											
											while(escolhaQuantidade > prod.getQtdeProdutoEstoque() || escolhaQuantidade <=0){
												System.out.println();
												System.out.println("A quantidade informada está incorretra ou excede o valor em estoque");
												break;
											}
											
										}while(escolhaQuantidade > prod.getQtdeProdutoEstoque() || escolhaQuantidade <=0);
										

										prod.venda(escolhaQuantidade);
								
										inseriLinha(80, '▬');
										System.out.println("\t\t\tItens do seu Carrinho:");
										inseriLinha(80, '▬');
										System.out.println("CODIGO\t\tR$(UN)\t\tQUANTIDADE\tPRODUTO");
										
										inseriLinha(80, '▬');
										
										for (Produto venda: listaProdutos) {
											if(venda.getCodigo().equals(escolhaCodigo)) {
												System.out.printf("%s\t\t%.2f\t\t   %d\t\t %s\n",venda.getCodigo(), venda.getPrecoUnitario() * escolhaQuantidade, escolhaQuantidade,venda.getProduto());
											}
											
										}
										
										valorTotalCarro = prod.valorTotalCarro(escolhaQuantidade);
										prod.limpaCarrinho();
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
							
							
							System.out.println();
							System.out.println("[1] - PAGAMENTO A VISTA - COM DESCONTO DE 10%");
							System.out.println("[2] - DEBITO - SEM DESCONTO");
							System.out.println("[3] - CREDITO - COM 5% DE JUROS");
							System.out.println("[4] - CREDITO EM ATÉ 3 VEZES - COM JUROS DE 10%");
							opcaoPagamento = leia.next().charAt(0);
							notaFiscal++;
							valorImposto = valorTotalCarro * 0.09;
				
					 		if(opcaoPagamento == '1'){
					 			System.out.println();
					 			valorTotalCarro -= valorTotalCarro * 0.10;
					 			System.out.println("NF-e");
					 			System.out.println("0000" + notaFiscal);
					 	 		System.out.printf("Sr(a). solicitou pagamento a vista, o Total a pagar é: R$ %.2f reais %n", valorTotalCarro);
					 	 		System.out.println("Dados Adicionais: ");
					 	 		System.out.print("Total aproximado de tributos: R$ " + valorImposto + "(9%).");;
					 	 		
					 		}
					 		else if(opcaoPagamento == '2'){
					 			System.out.println();
					 			System.out.println("NF-e");
					 			System.out.println("0000" + notaFiscal);
					 	 		System.out.printf("Sr(a). solicitou pagamento debito, o Total a pagar é: R$ %.2f reais %n", valorTotalCarro);
					 	 		System.out.println("Dados Adicionais: ");
					 	 		System.out.print("Total aproximado de tributos: R$ " + valorImposto + "(9%).");
					 		}
					 		else if(opcaoPagamento == '3'){
					 			System.out.println("NF-e");
					 			System.out.println("0000" + notaFiscal);
					 			valorTotalCarro += valorTotalCarro * 0.05;
					 	 		System.out.printf("Sr(a). solicitou cartão de crédito, o Total a pagar é: R$ %.2f reais %n", valorTotalCarro);
					 	 		System.out.println("Dados Adicionais: ");
					 	 		System.out.print("Total aproximado de tributos: R$ " + valorImposto + "(9%).");
					 		}
					 		else if(opcaoPagamento == '4'){
					 			System.out.println();
					 			System.out.println("NF-e");
					 			System.out.println("0000" + notaFiscal);
					 			System.out.print("Sr(a). solicitou pagar em três vezes com juros, o Total a pagar é: ");
					 			valorTotalCarro += valorTotalCarro * 0.10;
					 	 		for(int x = 0; x < 3; x++){
					 	 			double valorParcela[] = new double[3];
					 	 			valorParcela[x] = valorTotalCarro / 3;
					 	 			System.out.println();
					 	 			System.out.printf((x+1) + "º parcela R$ %.2f reais", valorParcela[x]);
				 	 			}
					 	 		System.out.println();
					 	 		System.out.println("Dados Adicionais: ");
					 	 		System.out.print("Total aproximado de tributos: R$ " + valorImposto + "(9%).");
					 		}
		
							do {
								System.out.println();
								System.out.println();
								System.out.println();
								System.out.println();
								System.out.println();
								System.out.println();
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
					
					else if (opcaoMenuCompra == '2') {
						
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
					else if (opcaoMenuCompra == '3') {
						System.out.println();
						System.out.println();
						inseriLinha(80, '▬');
						System.out.println("\t\t\tLista de Clientes:");
						inseriLinha(80, '▬');
						for(Cliente x : listaClientes) {
							System.out.println(x);
						}
						
					}
					else if (opcaoMenuCompra == '4') {
						break;
					}
					
					while(opcaoMenuCompra  != '1' && opcaoMenuCompra  != '2' && opcaoMenuCompra  != '3' && opcaoMenuCompra != '4') {
						System.out.println();
						inseriLinha(80,'▼');
						System.out.println("Atenção a Opção escolhida é invalida. Tente novamente!!!");
						inseriLinha(80,'▼');
						System.out.println();
						break;
					}
				
				}while(opcaoMenuCompra  != '1' && opcaoMenuCompra  != '2' && opcaoMenuCompra  != '3' && opcaoMenuCompra != '4');
			
			
			}
			
			
			
			//OPÇÂO 2 MENU INICIAL
			else if (opcaoMenuInicial  == '2') {
				
				
				do{
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("[1] - NOVO ITEM");
					System.out.println("[2] - REMOVER ITEM");
					System.out.println("[3] - ATUALIZAR ITEM");
					System.out.println("[4] - LISTAR ITENS");
					System.out.println("[5] - SAIR");
					System.out.println();
					System.out.print("DIGITE A OPÇÂO: ");
					opcaoMenuEstoque = leia.next().charAt(0);;
					
					if(opcaoMenuEstoque == '1') {
						
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.print("Insira o nome do produto: ");
						leia.nextLine();
						nomeProduto = leia.nextLine();
						System.out.print("Insira o valor do produto: ");
						valorProduto = leia.nextDouble();
						System.out.print("Insira a quantidade do produto: ");
						qtdEstoque = leia.nextInt();
						
						
						listaProdutos.add(new Produto((listaProdutos.size() >= 100)? "CLE-"+ (listaProdutos.size() + 1) : (listaProdutos.size() < 10)? "CLE-00"+ (listaProdutos.size() + 1): "CLE-0"+ (listaProdutos.size() + 1) , nomeProduto, valorProduto, qtdEstoque));
						
					}
					else if(opcaoMenuEstoque == '2') {
						System.out.print("Insira o codigo do item que deseja remover: ");
						escolhaCodigo = leia.next().toUpperCase();
						for(Produto prod: listaProdutos) {
							
						     if(prod.getCodigo().equals(escolhaCodigo)){
						            

						            // Remove.
						            listaProdutos.remove(prod);

						            // Sai do loop.
						            break;
						     }
						    
						}
					}
					else if(opcaoMenuEstoque == '3') {
						System.out.println("Insira o codigo do item que deseja atualizar: ");
						escolhaCodigo = leia.next().toUpperCase();
						
						for(Produto prod: listaProdutos) {
							
						     if(prod.getCodigo().equals(escolhaCodigo)){
						            
						    	
						    	 
						    	 do{
										System.out.println();
										System.out.println();
										System.out.println();
										System.out.println("[1] - NOME PRODUTO");
										System.out.println("[2] - VALOR PRODUTO");
										System.out.println("[3] - QUANTIDADE PRODUTO");
										System.out.println("[4] - SAIR");
										System.out.println();
										System.out.print("DIGITE A OPÇÂO: ");
										opcaoMenuProduto = leia.next().charAt(0);;
										
										if(opcaoMenuProduto == '1') {
											
											System.out.println();
											System.out.println();
											System.out.println();
											System.out.print("Insira o nome do produto: ");
											leia.nextLine();
											nomeProduto = leia.nextLine();
											
											prod.setProduto(nomeProduto);
											
										}
										else if(opcaoMenuProduto == '2') {
											System.out.println();
											System.out.println();
											System.out.println();
											System.out.print("Insira o valor do produto: ");
											valorProduto = leia.nextDouble();
											
											prod.setPrecoUnitario(valorProduto);
											 
										
										}
										else if(opcaoMenuProduto == '3') {
											System.out.print("Insira a quantidade do produto: ");
											qtdEstoque = leia.nextInt();
											
											prod.adicionaEstoque(qtdEstoque);
										}
						
										else if(opcaoMenuProduto == '4') {
											break;
										}
										
										
									}while(opcaoMenuProduto == '4');
						    	 
						     }
						    
						}
						
					}
					else if(opcaoMenuEstoque == '4') {
						System.out.println();
						inseriLinha(80,'▬');
						
						System.out.println("CODIGO\t\tR$(UN)\t\tESTOQUE\t\tPRODUTO");
					
						inseriLinha(80, '▬');
						
						
						
						for (Produto prod: listaProdutos) {
							
							System.out.printf("%s\t\t%.2f\t\t%d\t\t%s\n",prod.getCodigo(),prod.getPrecoUnitario(),prod.getQtdeProdutoEstoque(),prod.getProduto());
						}
					}
					else if(opcaoMenuEstoque == '5') {
						break;
					}
					
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
			
			//OPÇÂO 3 MENU INICIAL
			else if (opcaoMenuInicial  == '3') {
				System.out.println();
				inseriLinha(80, '♥');
				System.out.println("Gratidão por escolher CABELEIRERA LEILA, volte sempre!!!");
				inseriLinha(80, '♥');
				System.out.println();
			}
			
				
			while(opcaoMenuInicial  != '1' && opcaoMenuInicial != '2' && opcaoMenuInicial  != '3') {
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

	
	//FUNÇÂO PARA O BANNER
	public static void BannerEmpresa() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
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
