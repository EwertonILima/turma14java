programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio(){
		real pesoTomate
		real excessoTomate=0
		real multaTomate=0

		const real LIMITEPESO = 50.0
		const real VALOREXCEDENTE = 4.0
		
		escreva("Insira a quantidade de tomate em quilos: ")
		leia(pesoTomate)
		
		se(pesoTomate <= 0) {
			escreva("\nInsira um peso válido")
		}
		senao {
			se(pesoTomate > LIMITEPESO) {
			excessoTomate = pesoTomate - LIMITEPESO
			multaTomate = excessoTomate * VALOREXCEDENTE
			}
			escreva("\nJoão Papo-de-Pescador, o senhor tem " + pesoTomate + " quilos de tomate, o excedente é " + excessoTomate + " quilos, e o valor da multa é de R$ " + Mat.arredondar(multaTomate, 2) + " reais")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 382; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */