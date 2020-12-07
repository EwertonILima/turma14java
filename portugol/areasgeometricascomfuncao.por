programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio(){
		 
		real alturaRetangulo, baseRetangulo, areaRetangulo, areaCirculo, alturaTriangulo, baseTriangulo, valorRaio
		inteiro tipo 

		escreva("1 - Circulo")
		escreva("\n2 - Triângulo")
		escreva("\n3 - Retângulo")
		escreva("\nEscolha uma das opções acima: ")
		leia(tipo)
		
		escolha (tipo) {
				
			caso 1:
				escreva("\nInsira o raio do Circulo: ")
				leia(valorRaio)
				se(valorRaio <= 0){
					escreva("Insira um número maior que 0")
				}
				senao{
					areaCirculo = Mat.PI*(valorRaio*valorRaio)
					escreva("Área do circulo: ",areaCirculo)
				}
			pare
				
			caso 2:
				escreva("\nInsira o a altura do triângulo: ")
				leia(alturaTriangulo)

				escreva("Insira a base do triângulo: ")
				leia(baseTriangulo)

				triangulo(alturaTriangulo, baseTriangulo)
				
			pare

			caso 3:
				escreva("\nInsira o a altura do retângulo: ")
				leia(alturaRetangulo)

				escreva("Insira a base do retângulo: ")
				leia(baseRetangulo)
				
				se(baseRetangulo <= 0 ou alturaRetangulo <= 0){
					escreva("Insira um número maior que 0")
				}
				senao{
					areaRetangulo = baseRetangulo * alturaRetangulo
					escreva("Área do retângulo: ",areaRetangulo)
				}
			pare
		}
	}

		funcao triangulo(real baseTriangulo, real alturaTriangulo) {
			real areaTriangulo
			
			se(baseTriangulo <= 0 ou alturaTriangulo <= 0){
				escreva("Insira um número maior que 0")
			}
			senao{
				areaTriangulo = ((baseTriangulo * alturaTriangulo) / 2)
				escreva("Área do triângulo: ",areaTriangulo)
			}
	}
}


	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 946; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */