programa
{
	
	funcao inicio(){
		inteiro codigoFuncionario
		inteiro numeroHoras 
		real excessoSalario=0

		const real LIMITEHORAS = 50.0
		const real VALORHORA = 10.0
		const real VALOREXCEDENTE = 20.0
		
		escreva("Insira o codigo do funcionario: ")
		leia(codigoFuncionario)
		se(codigoFuncionario < 0) {
			escreva("\nCodigo invalido, insira o codigo correto")
		}
		senao {
			escreva("Insira a quantidade de horas trabalhadas: ")
			leia(numeroHoras)
			se(numeroHoras < 0) {
				escreva("\nQuantidade de horas invalida, insira o valor correto")
			}
			senao se (numeroHoras > LIMITEHORAS) {
				limpa()
				excessoSalario = (numeroHoras - LIMITEHORAS) * VALOREXCEDENTE
				escreva("\nCodigo: " + codigoFuncionario)
				escreva("\nHoras trabalhadas: " + numeroHoras + " horas, Salario Total: R$ " + ((LIMITEHORAS * VALORHORA) + excessoSalario) + " reais, Salario excedente: R$ " + excessoSalario + " reais.")
			}
			senao {
				limpa()
				escreva("\nCodigo: " + codigoFuncionario)
				escreva("\nHoras trabalhadas: " + numeroHoras + " horas, Salario Total: R$ " + (numeroHoras * VALORHORA) + " reais, Salario excedente: R$ " + excessoSalario + " reais.")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 482; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */