programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio(){
		real x1,y1,x2,y2

		escreva("Insira a coordenada x1: ")
		leia(x1)
		escreva("\nInsira a coordenada y1: ")
		leia(y1)
		escreva("\nInsira a coordenada x2: ")
		leia(x2)
		escreva("\nInsira a coordenada y2: ")
		leia(y2)
		
		escreva("\nA distancia entre ele é: " + (Mat.arredondar((Mat.raiz((Mat.potencia((x2-x1),2)) + (Mat.potencia((y2-y1),2)),2)), 2)))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 430; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */