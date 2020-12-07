programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio(){
		real valorProduto, valorTotal, valorParcela[3]
		inteiro quantidadeProduto, opcaoPagamento
		caracter novoProduto = ' ' 

		faca{
			limpa()	
			valorTotal = menuInicial()// Funcao para menu inicial
	
			opcaoPagamento = menuPagamento() // Funcao para menu pagamento
	
	 		se(opcaoPagamento == 1){
	 			dinheiroOuCheque(valorTotal)//Funcao para pagamento em Dinheiro ou Cheque
	 		}
	 		
	 		
	 		senao se(opcaoPagamento == 2){
	 			cartaoCredito(valorTotal)//Funcao para pagamento em Cartão de Credito
	 		}
	
	
	 		senao se(opcaoPagamento == 3){
	 			duasParcelas(valorTotal)//Funcao para pagamento em 2x sem juros	
	 		}
	
	
	 		senao se(opcaoPagamento == 4){//Funcao para pagamento em 3x com Juros
	 			tresParcelas(valorTotal)
	 		}
	 		pulaLinha()
	 		pulaLinha()
	 		escreva("Deseja pagar um novo produto? [S/N]")
	 		pulaLinha()
	 		leia(novoProduto)
		}enquanto(novoProduto == 'S' ou novoProduto == 's')
	
		se(novoProduto == 'N' ou novoProduto == 'n'){
			pulaLinha()
			escreva("Encerrando....")
		}
		senao{
			escreva("Opção Invalida")
		}
	
	}// FIm da Função Inicial


	funcao pulaLinha(){//Funcao para pular Linha
		escreva("\n")

	}


	funcao real menuInicial(){// Funcao para menu inicial
		real valorProduto, valorTotal
		inteiro quantidadeProduto
		
		escreva("===============================================================")
		pulaLinha()
		escreva("\t\t\tMercado Generation")
		pulaLinha()
		escreva("===============================================================")
		pulaLinha()
		escreva("Insira o valor da etiqueta do produto: R$ ")
		leia(valorProduto)
		pulaLinha()
		escreva("Insira a quantidade de produtos: ")
		leia(quantidadeProduto)
		valorTotal = valorProduto * quantidadeProduto
		pulaLinha()
		escreva("Total a pagar: " + (Mat.arredondar(valorTotal, 2)) + " reais")
		retorne valorTotal
	}


	funcao inteiro menuPagamento(){// Funcao para menu pagamento
		inteiro opcaoPagamento
		
		pulaLinha()
		pulaLinha()
		escreva("===============================================================")
		pulaLinha()
		escreva("Qual a forma de pagamento?: [1 - 2 - 3 - 4]")
		pulaLinha()
		escreva("===============================================================")
		pulaLinha()
		escreva("[1] - À vista em dinheiro ou cheque, recebe 20% de desconto")
		pulaLinha()
		escreva("[2] - À vista no cartão de crédito, recebe 15% de desconto")
		pulaLinha()
		escreva("[3] - Em duas vezes, preço normal de etiqueta sem juros")
		pulaLinha()
		escreva("[4] - Em três vezes, preço normal de etiqueta mais juros de 10%")
		pulaLinha()
		leia(opcaoPagamento)
		retorne opcaoPagamento
	}


	funcao real dinheiroOuCheque(real valorTotal){//Funcao para pagamento em Dinheiro ou Cheque
		pulaLinha()
 		valorTotal -= valorTotal * 0.20
 		escreva("Sr(a). solicitou dinheiro ou cheque, o Total a pagar é: R$ " + (Mat.arredondar(valorTotal, 2)) + " reais")
 		retorne valorTotal
	}


	funcao real cartaoCredito(real valorTotal){//Funcao para pagamento em Cartão de Credito
		pulaLinha()
 		valorTotal -= valorTotal * 0.15
 		escreva("Sr(a). solicitou cartão de crédito, o Total a pagar é: R$ " + (Mat.arredondar(valorTotal, 2)) + " reais")
 		retorne valorTotal
	}


	funcao duasParcelas(real valorTotal){//Funcao para pagamento em 2x sem juros
		real valorParcela[2]
		
		pulaLinha()
 		escreva("Sr(a). solicitou pagar em duas vezes sem juros, o Total a pagar é: ")
 		para(inteiro i =0; i < 2; i++){
 			valorParcela[i] = (Mat.arredondar((valorTotal / 2), 2))
 			pulaLinha()
 			escreva((i+1) + "º parcela R$ " + valorParcela[i] + " reais")	
 		}
 		
	}

	
	funcao tresParcelas(real valorTotal){//Funcao para pagamento em 3x com juros
		real valorParcela[3]
		
		pulaLinha()
		escreva("Sr(a). solicitou pagar em três vezes com juros, o Total a pagar é: ")
 		valorTotal += valorTotal * 0.10
 		para(inteiro i =0; i < 3; i++){
 			valorParcela[i] = (Mat.arredondar((valorTotal / 3), 2))
 			pulaLinha()
 			escreva((i+1) + "º parcela R$ " + valorParcela[i] + " reais")
 		}		
 	}

 			
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2542; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */