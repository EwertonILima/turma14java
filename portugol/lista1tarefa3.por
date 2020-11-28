programa
{
	
	funcao inicio(){
		inteiro tempoSegundos

		escreva("Insira o tempo em segundos: ")
		leia(tempoSegundos)
		escreva("\n")

		escreva("O tempo do evento é: " + (tempoSegundos / 3600) + " hora(s), " + (tempoSegundos / 60 % 60) + " minuto(s), " + (tempoSegundos % 60)  + " segundo(s)")
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