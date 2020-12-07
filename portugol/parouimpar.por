programa
{
	
	funcao inicio()
	{	inteiro = numero
	
		escreva("Insira um numero: ")
		leia(numero)

		se (numero <= 0) {
			escreva("\nNumero invalido ou igual a zero, por favor digite um numero inteiro positivo")
		}
		senao {
			se (numero % 2 == 0) {
				escreva("\nO número " + numero + " é PAR!")
			}
			senao {
				escreva("\nO número " + numero + " é IMPAR!")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */