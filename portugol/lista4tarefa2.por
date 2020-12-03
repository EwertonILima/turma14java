programa
{
	inclua biblioteca Util
	
	funcao inicio(){

		const inteiro LANCAMENTOS = 10
		 
		inteiro valores[LANCAMENTOS]
		inteiro somaValor = 0, maiorValor = 0, contaMaior = 0

		
		
		escreva("Jogue o dado [1-6]")
		para(inteiro lancamentos = 1; lancamentos <= LANCAMENTOS; lancamentos++){

			escreva("\n" + lancamentos + "º lançamento: ")
			valores[lancamentos - 1] = Util.sorteia(1, 6)//Valores dos dados introduzidos aleatoriamente
			somaValor = somaValor + valores[lancamentos - 1]//Soma dos valores
			
			se(valores[lancamentos -1] >= maiorValor) {
				maiorValor = valores[lancamentos -1]
			}	
	
		}
		
		limpa()
		escreva("\nValores Lançados")
		para(inteiro lancamentos = 1; lancamentos <= LANCAMENTOS; lancamentos++){

			se(valores[lancamentos -1] >= maiorValor) {
				contaMaior = contaMaior++
			}
			escreva("\nNo " + lancamentos + "º foi: " + valores[lancamentos - 1])
		}
		escreva("\n\nA média dos valores lançados foi " +  somaValor / LANCAMENTOS)
		escreva("\nA maior pontuação foi lançada: " + contaMaior + " vezes")
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 912; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */