programa
{
	inclua biblioteca Matematica

	funcao inicio(){
		inteiro a, b, c, r, s
		
		escreva("Insira o primeiro numero: ")
		leia(a)
		escreva("\nInsira o segundo numero: ")
		leia(b)
		escreva("\nInsira o terceiro numero: ")
		leia(c)

		escreva("\nResultado da expressão é: "  + ((Matematica.potencia((a + b), 2) + (Matematica.potencia((b + c), 2))) / 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 280; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */