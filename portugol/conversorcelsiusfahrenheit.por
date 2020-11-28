programa {

	inclua biblioteca Matematica
	
	funcao inicio() {
		real tempCelsius
		
		escreva("Insira a temperatura em Celsius: ")
		leia(tempCelsius)
		escreva("\n")
		escreva("A temperatura em Fahrenheit é " + Matematica.arredondar(((tempCelsius * 1.8) + 32), 2) + " ºF\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 81; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */