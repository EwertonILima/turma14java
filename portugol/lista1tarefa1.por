programa 
{
	
	funcao inicio(){
		inteiro idadeAnos, idadeMeses, idadeDias

		escreva("Insira uma idade expressa em anos: ")
		leia(idadeAnos)
		escreva("\n")
		escreva("Insira uma idade expressa em meses: ")
		leia(idadeMeses)
		escreva("\n")
		escreva("Insira uma idade expressa em dias: ")
		leia(idadeDias)
		escreva("\n")

		escreva("Total em dias é: " + ( (idadeAnos*365) + (idadeMeses*30) + idadeDias ) + " dia(s).")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 356; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */