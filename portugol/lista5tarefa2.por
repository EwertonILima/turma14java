programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio(){
		real pesoQuilos, alturaMetros, imc
		caracter novoCalculo = ' '
	
		faca{
			limpa()	
			escreva("========================================================================")
			pulaLinha()
			escreva("\t\t\tCalculadora de IMC Generation")
			pulaLinha()
			escreva("========================================================================")
			pulaLinha()
			escreva("IMC = Índice de Massa Corporal")
			pulaLinha()
			pulaLinha()
			escreva("Informe seu peso em quilos[Kg]: ")
			leia(pesoQuilos)
			pulaLinha()
			escreva("Informe sua altura em metros[m]: ")
			leia(alturaMetros)
		
	
			imc = (pesoQuilos / (Mat.potencia(alturaMetros,2)))
			pulaLinha()
			escreva("Seu IMC é " + Mat.arredondar(imc,2) + " e de acordo com a tabela você está [")
			se(imc < 18.5){
				escreva("ABAIXO DO PESO]")
			}
			senao se(imc >= 18.5 e imc < 25){
				escreva("PESO NORMAL]")
			}
			senao se(imc >=25 e imc <= 30){
				escreva("ACIMA DO PESO]")
			}
			senao{
				escreva("OBESO]")
			}
			pulaLinha()
		 	pulaLinha()
		 	escreva("Deseja calcular novamente? [S/N]")
		 	pulaLinha()
		 	leia(novoCalculo)
		}enquanto(novoCalculo == 'S' ou novoCalculo == 's')
		
		se(novoCalculo == 'N' ou novoCalculo == 'n'){
			pulaLinha()
			escreva("Encerrando....")
		}
		senao{
			escreva("Opção Invalida")
		}

		
	}// FIm da Função Inicial


	funcao pulaLinha(){//Funcao para pular Linha
		escreva("\n")

	}





	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 627; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */