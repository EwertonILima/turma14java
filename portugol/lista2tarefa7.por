programa
{
	
	funcao inicio(){
		real baseTriangulo, alturaTriangulo
		
		escreva("Insira o valor para ser base do Triangulo em centimetros: ")
		leia(baseTriangulo)
		escreva("\nInsira o valor para ser altura do Triangulo em centimetros:")
		leia(alturaTriangulo)

		se(baseTriangulo > 0 e alturaTriangulo > 0) {
			escreva("\nOs valores são válidos")
			escreva("\nA aréa do triangulo é: " + (baseTriangulo * alturaTriangulo) /2 + " cm")
		}
		senao {
			escreva("\nInsira valores positivos maiores que zero")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 520; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */