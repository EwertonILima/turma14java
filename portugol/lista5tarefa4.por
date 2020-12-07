programa
{
	
	funcao inicio(){
		real i = 1, j = 2, l = 1
		real resultado, somaTotal = 0.0
			
		escreva("soma= ") 
		para( i = 1; i <= 50; i++){

			escreva((l) + "/" + i + " = ")
			l += j
			
			resultado = l/i
			somaTotal = somaTotal + l/i
			escreva(resultado)
			pulaLinha()
		}

		escreva("A soma total é " + somaTotal)
	}


	funcao pulaLinha(){//Funcao para pular Linha
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */