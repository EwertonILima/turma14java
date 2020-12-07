programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio() { 
		real base, altura
		
		escreva("Insira a base do triângulo em centímetros : ")
		leia(base)
		escreva("\nInsira a altura do triângulo em centímetros : ")
		leia(altura)
		escreva("\nA área do circulo é " + (Mat.arredondar(((base * altura)/2),2)) + " cm²")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 47; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */