programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio(){
		real n1,n2,n3,n4
		
		const real NUMEROLIMITE = 1000
		
		escreva("Insira o primeiro numero: ")
		leia(n1)
		escreva("\nInsira o segundo numero: ")
		leia(n2)
		escreva("\nInsira o terceiro numero: ")
		leia(n3)
		escreva("\nInsira o quarto numero: ")
		leia(n4)

		se (Mat.potencia(n3, 2) >= NUMEROLIMITE){
			escreva("\nO terceiro numero ao quadrado é: " + (Mat.arredondar(((Mat.potencia(n3, 2))),2)))		
		}
		senao {
			escreva("\nO primeiro  numero é " + n1 + " e o seu quadrado " + (Mat.arredondar(((Mat.potencia(n1, 2))),2)))
			escreva("\nO segundo numero é " + n2 + " e o seu quadrado " + (Mat.arredondar(((Mat.potencia(n2, 2))),2)))
			escreva("\nO terceiro numero é " + n3 + " e o seu quadrado " + (Mat.arredondar(((Mat.potencia(n3, 2))),2)))
			escreva("\nO quarto numero é " + n4 + " e o seu quadrado " + (Mat.arredondar(((Mat.potencia(n4, 2))),2)))
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 846; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */