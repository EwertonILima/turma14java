programa
{
	inclua biblioteca Matematica
	
	funcao inicio(){
		real tempFahrenheit
		
		escreva ("Insira a temperatura em Fahrenheit: ")
		leia(tempFahrenheit)
		escreva("A temperatura em Fahrenheit é " + Matematica.arredondar(((tempFahrenheit - 32) / 1.8), 2) + " ºC")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 134; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */