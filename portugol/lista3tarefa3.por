programa
{
	
	funcao inicio(){
		inteiro contador = 1
		inteiro somaContador = 0
		inteiro totalNumeros = 0
		real mediaNumeros = 0.0

		enquanto (contador > 0) {
			escreva("Insira um numero:")
			leia(contador)
			somaContador = somaContador + contador
			totalNumeros = totalNumeros++
			mediaNumeros = somaContador / totalNumeros
		}
		escreva("A soma dos numeros é " + somaContador + ",a média " + mediaNumeros + ", e o total de valores: " + totalNumeros)
	}
			
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 287; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */