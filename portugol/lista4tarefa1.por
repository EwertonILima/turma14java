programa
{
	
	funcao inicio(){
		real pontos[5]
		inteiro maiorPonto = 0

		escreva("Insira os pontos da atividade")
		para (inteiro i = 0; i <5; i++){
			escreva("\n" + (i +1) + "º Pontuação:")
			leia(pontos[i])
			se(pontos[i] > maiorPonto){
			maiorPonto = pontos[i]
			}
		}
		para (inteiro i = 0; i <5; i++){
			escreva("\nPontuação " + (i + 1) + ": " + pontos[i])
		}
		escreva("\n\nA maior pontuação é " + maiorPonto  +" pontos")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 114; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */