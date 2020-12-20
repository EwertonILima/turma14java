programa
{
	
	funcao inicio(){	
		inteiro numero
		cadeia status
	
		escreva("Insira um numero: ")
		leia(numero)

		se (numero > 0) {
			status = "POSITIVO!"
			se (numero % 2 == 0) {
				escreva("\nO número " + numero + " é PAR e é " + status)
			}
			senao {
				escreva("\nO número " + numero + " é IMPAR e é " + status)
			}
		}
		senao se (numero < 0) {
				status = "NEGATIVO!"
			se (numero % 2 == 0) {
				escreva("\nO número " + numero + " é PAR e é " + status)
			}
			senao {
				escreva("\nO número " + numero + " é IMPAR e é " + status)
			}
		}
		senao {
			escreva("\nNumero inválido ou igual a zero")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 492; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */