programa 
{
	
	funcao inicio(){
		inteiro idadeDias
		
		escreva("Insira uma idade expressa em dias: ")
		leia(idadeDias)
		escreva("\n")

		escreva("O seu tempo na terra é: " + (idadeDias / 365) + " ano(s), " + (idadeDias % 365 / 30) + " mes(es), " + (idadeDias % 365 % 30)  + " dia(s)")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 283; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */