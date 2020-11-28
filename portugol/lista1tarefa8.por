programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio(){
		real custoFabrica
		
		escreva("Insira o custo de fabrica: ")
		leia(custoFabrica)

		escreva("\nO custo do consumidor é: " + (Mat.arredondar((custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45)), 2)))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 281; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */