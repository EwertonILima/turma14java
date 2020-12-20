programa
{
	
	funcao inicio(){
		inteiro numero, numero0a25 = 0, numero26a50 = 0, numero51a75 = 0, numero76a100 = 0, contador = 0
		caracter novoNumero
		
		faca{	
			escreva("Insira um numero: ")
			leia(numero)
			
		
			se(numero > 0 e numero <= 25){
				numero0a25 += 1
			}
			senao se(numero <= 50){
				numero26a50 += 1
			}
			senao se(numero <= 75){
				numero51a75 += 1
			}
			senao se(numero <= 100){
				numero76a100 += 1
			}
			senao{
				escreva("O numero inserido é negativo")
			}
			
			pulaLinha()
		 	pulaLinha()
		 	escreva("Deseja inserir um novo numero? [S/N]")
		 	pulaLinha()
		 	leia(novoNumero)
		}enquanto(novoNumero == 'S' ou novoNumero == 's')
		
		se(novoNumero == 'N' ou novoNumero == 'n'){
			pulaLinha()
			escreva("Quantidade de numeros de [0-25]: " + numero0a25)
			pulaLinha()
			escreva("Quantidade de numeros de [26-50]: " + numero26a50)
			pulaLinha()
			escreva("Quantidade de numeros de [51-75]: " + numero51a75)
			pulaLinha()
			escreva("Quantidade de numeros de [76-100]: " + numero76a100)
			pulaLinha()
			escreva("Encerrando....")
		}
		senao{
			escreva("Opção Invalida")
		}
	
	}// Fim da função inicial
	


	funcao pulaLinha(){//Funcao para pular Linha
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 305; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */