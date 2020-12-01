programa
{
	
	funcao inicio(){
		real indicePoluicao

		const real INDICEINICIAL = 0.3
		const real INDICEINTERMEDIARIO = 0.4
		const real INDICEFINAL = 0.5
		
		escreva("Insira o índice de poluição medido: ")
		leia(indicePoluicao)

		se(indicePoluicao >= INDICEFINAL) {
			escreva("\nTodos os grupos, suspendam suas atividades")
		}
		senao se(indicePoluicao >= INDICEINTERMEDIARIO){
			escreva("\nIndustrias do 1º e 2º Grupo, suspendam suas atividades")
		}
		senao se(indicePoluicao >= INDICEINICIAL){
			escreva("\nIndustrias do 1º Grupo, suspendam suas atividades")
		}
		senao {
			escreva("\nOs indices de poluição estão em níveis aceitaveis, nenhuma paralisação necessita ser feita.")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 677; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */