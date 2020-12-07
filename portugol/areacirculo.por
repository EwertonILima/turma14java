programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio() { 
		real raio
		
		escreva("Digite o raio do circulo em centímetros : ")
		leia(raio)
		escreva("\nA área do circulo é " + (Mat.arredondar((Mat.potencia(raio,2) * Mat.PI),2)) + " cm²")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 243; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */