programa
{
	
	funcao inicio() {
		
		escreva("A soma de todos os números ímpares que são  múltiplos de três e que se encontram no conjunto dos números de 1 até 500 é ")
		somaNumero()
	}

	funcao somaNumero(){
	inteiro somaNumero = 0
	
		para(inteiro i = 1; i <= 500; i++) {
			se( i % 2 != 0 e i % 3 == 0) {
				somaNumero = somaNumero + i
			}
		}
		escreva (somaNumero)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 183; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */