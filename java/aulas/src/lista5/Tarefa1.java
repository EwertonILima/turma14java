package lista5;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valorTotal;
		char novoProduto = ' ', opcaoPagamento = ' ';

		do{
			
			valorTotal = menuInicial();// Funcao para menu inicial

				opcaoPagamento = menuPagamento(); // Funcao para menu pagamento
		
		 		if(opcaoPagamento == '1'){
		 			dinheiroOuCheque(valorTotal);//Funcao para pagamento em Dinheiro ou Cheque
		 		}
		 		else if(opcaoPagamento == '2'){
		 			cartaoCredito(valorTotal);//Funcao para pagamento em Cartão de Credito
		 		}
		 		else if(opcaoPagamento == '3'){
		 			duasParcelas(valorTotal);//Funcao para pagamento em 2x sem juros	
		 		}
		 		else if(opcaoPagamento == '4'){//Funcao para pagamento em 3x com Juros
		 			tresParcelas(valorTotal);
		 		}
		 		do {
			 		System.out.println();
			 		System.out.println();
			 		System.out.println("Deseja pagar um novo produto? [S/N]");
			 		System.out.println();
			 		novoProduto = leia.next().toUpperCase().charAt(0);
			 		
			 		while(novoProduto != 'S' && novoProduto != 'N') {
						System.out.println();
						inseriLinha(80,'▼');
						System.out.println("Atenção a Opção  escolhida é invalida. Tente novamente!!!");
						inseriLinha(80,'▼');
						System.out.println();
						break;
					}
			 		
			 		if(novoProduto == 'N'){
						System.out.println();
						System.out.println("Gratidão por comprar conosco, volte sempre!!!");
						System.out.print("Encerrando....");
						break;
					}
			 		
			 		
		 		}while(novoProduto != 'S');
		 		
				
		}while(novoProduto != 'N');

		
		leia.close();
			
	}// FIm da Função Inicial
			
	
	//FUNÇÂO PARA GERAR LINHA
	public static void inseriLinha(int tamanho, char simbolo) {

		for (int i = 0; i < tamanho; i++) {
			System.out.print(simbolo);
		}
		System.out.println();
	}

	public static double menuInicial(){// Funcao para menu inicial
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		double valorProduto, valorTotal;
		int quantidadeProduto;
		
		System.out.print("===============================================================");
		System.out.println();
		System.out.print("\t\t\tMercado Generation");
		System.out.println();
		System.out.print("===============================================================");
		System.out.println();
		System.out.print("Insira o valor da etiqueta do produto: R$ ");
		valorProduto = leia.nextDouble();
		System.out.println();
		System.out.print("Insira a quantidade de produtos: ");
		quantidadeProduto = leia.nextInt();
		valorTotal = valorProduto * quantidadeProduto;
		System.out.println();
		System.out.printf("Total a pagar: %.2f reais", valorTotal);
		return valorTotal;
		
	
	}


	public static char menuPagamento(){// Funcao para menu pagamento
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		char opcaoPagamento = ' ';
		
		do {
			System.out.println();
			System.out.println();
			System.out.println("===============================================================");
			System.out.println();
			System.out.println("Qual a forma de pagamento?: [1 - 2 - 3 - 4]");
			System.out.println();
			System.out.println("===============================================================");
			System.out.println();
			System.out.println("[1] - À vista em dinheiro ou cheque, recebe 20% de desconto");
			System.out.println();
			System.out.println("[2] - À vista no cartão de crédito, recebe 15% de desconto");
			System.out.println();
			System.out.println("[3] - Em duas vezes, preço normal de etiqueta sem juros");
			System.out.println();
			System.out.println("[4] - Em três vezes, preço normal de etiqueta mais juros de 10%");
			System.out.println();
			System.out.print("Digite a opção desejada: ");
			opcaoPagamento = leia.next().toUpperCase().charAt(0);
			
			while(opcaoPagamento  != '1' && opcaoPagamento  != '2' && opcaoPagamento  != '3' && opcaoPagamento  != '4') {
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				inseriLinha(80,'▼');
				System.out.println("Atenção a Opção escolhida é invalida. Tente novamente!!!");
				inseriLinha(80,'▼');
				System.out.println();
				break;
			}
		
		}while(opcaoPagamento  != '1' && opcaoPagamento  != '2' && opcaoPagamento  != '3' && opcaoPagamento  != '4');
			
			return opcaoPagamento;
	
	}


	public static double dinheiroOuCheque(double valorTotal){//Funcao para pagamento em Dinheiro ou Cheque
		System.out.println();
 		valorTotal -= valorTotal * 0.20;
 		System.out.printf("Sr(a). solicitou dinheiro ou cheque, o Total a pagar é: R$ %.2f reais", valorTotal);
 		return valorTotal;
	}


	public static double cartaoCredito(double valorTotal){//Funcao para pagamento em Cartão de Credito
		System.out.println();
 		valorTotal -= valorTotal * 0.15;
 		System.out.printf("Sr(a). solicitou cartão de crédito, o Total a pagar é: R$ %.2f reais", valorTotal);
 		return valorTotal;
	}


	public static void duasParcelas(double valorTotal){//Funcao para pagamento em 2x sem juros
		
		double[] valorParcela = new double[2];
		
		System.out.println();
		System.out.println("Sr(a). solicitou pagar em duas vezes sem juros, o Total a pagar é: ");
 		for(int i =0; i < 2; i++){
 			valorParcela[i] = valorTotal / 2;
 			System.out.println();
 			System.out.printf((i+1) + "º parcela R$ %.2f reais", valorParcela[i])	;
 		}
 		
	}

	
	public static void tresParcelas(double valorTotal){//Funcao para pagamento em 3x com juros
		double[] valorParcela = new double[3];
		
		System.out.println();
		System.out.print("Sr(a). solicitou pagar em três vezes com juros, o Total a pagar é: ");
 		valorTotal += valorTotal * 0.10;
 		for(int i =0; i < 3; i++){
 			valorParcela[i] = valorTotal / 3;
 			System.out.println();
 			System.out.printf((i+1) + "º parcela R$ %.2f reais", valorParcela[i]);
 		}		
 	}

		
}


