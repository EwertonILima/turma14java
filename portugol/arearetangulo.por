programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio() { 
		real base, altura
		
		escreva("Insira a base do retângulo em centímetros : ")
		leia(base)
		escreva("\nInsira a altura do retângulo em centímetros : ")
		leia(altura)

		se(base > 0 e altura > 0){
			escreva("\nA área do retângulo é " + (Mat.arredondar((base * altura),2)) + " cm²")
		}
		senao{
			escreva("Valores incorretos")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 413; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */