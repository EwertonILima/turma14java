programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio(){
		real salarioPopulacao
		real maiorSalario = 0.0, salarioSoma = 0.0
		real numeroFilhos
		inteiro filhoSoma = 0, ateLimite = 0

		const real LIMITESALARIO = 100.0, HABITANTES = 20

		para (inteiro i = 0; i < HABITANTES; i++) {
			escreva("Informe o salario: ")
			leia(salarioPopulacao)
			salarioSoma = salarioSoma + salarioPopulacao
			escreva("Informe a quantidade de filhos: ")
			leia(numeroFilhos)
			filhoSoma = filhoSoma + numeroFilhos

			se(salarioPopulacao > maiorSalario) {
				maiorSalario = salarioPopulacao
			}
			se(salarioPopulacao <= LIMITESALARIO) {
				ateLimite = ateLimite++
			}
			limpa()
		}
		escreva("A média do salário da população é R$ " + (Mat.arredondar((salarioSoma / HABITANTES),2)) + " reais por habitantes")
		pula()
		escreva("A média do número de filhos é " + (Mat.arredondar((filhoSoma / HABITANTES),2)) + " filhos por habitantes")
		pula()
		escreva("O maior salário da população é R$ " + (Mat.arredondar((maiorSalario),2)) + " reais.")
		pula()
		escreva("O percentual de pessoas com salário até R$ 100.00 é " + percentualSalario(ateLimite, HABITANTES) + "% dos habitantes.")
		
	}

	funcao pula(){
		escreva("\n")	
	}

	funcao real percentualSalario(inteiro ateLimite, real HABITANTES) {
		real percentagem
		percentagem = ((ateLimite * 100) / HABITANTES)
		retorne percentagem
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1193; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */