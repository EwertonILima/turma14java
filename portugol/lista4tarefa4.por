programa
{
	inclua biblioteca Util
	
	funcao inicio(){
		inteiro matriz3x3[3][3], somaTotal = 0, somaDiagonal = 0

		escreva("Matriz3X3:")
		pulaLinha()
		para(inteiro l = 0; l <=2; l++){
			para(inteiro c = 0; c <= 2; c++){
				escreva("[",matriz3x3[l][c] = Util.sorteia(1,9),"]"," ")
				somaTotal += matriz3x3[l][c]
				se (l == c) {
				somaDiagonal += matriz3x3[l][c]
				}
			}
		pulaLinha()
		}
		pulaLinha()
		escreva("A soma dos valores é: " + somaTotal)
		pulaLinha()
		escreva("A soma da diagonal principal é: " + somaDiagonal)
	
	}
	
	funcao pulaLinha(){
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 301; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */