programa
{
	
	funcao inicio(){
		real numero[5]
		inteiro numeroCodigo

		faca{
			limpa()
			para(inteiro i = 0 ; i < 5; i++){	
				escreva("Insira o " + (i + 1) + "º numero: ")
				leia(numero[i])
			}
			pulaLinha()
			pulaLinha()
			escreva("Digite uma das opçoes:")
			pulaLinha()
			escreva("0 - Finaliza o programa")
			pulaLinha()
			escreva("1 - Mostra o vetor na ordem direta")
			pulaLinha()
			escreva("2 - Mostra o vetor na ordem inversa")
			pulaLinha()
			leia(numeroCodigo)
			
		
			se(numeroCodigo == 0){
				escreva("Programa Finalizado")
			}
			senao se(numeroCodigo == 1){
				para(inteiro i = 0 ; i < 5; i++){	
					escreva(numero[i] + ", ")
				}	
			}
		
			senao se(numeroCodigo == 2){
				para(inteiro i = 4 ; i >= 0; i--){	
					escreva(numero[i] + ", ")
				}
			}
			
			senao{
				escreva("Código inválido")
			}
			
		
		}enquanto(numeroCodigo <> 0)
		
		
	
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
 * @POSICAO-CURSOR = 838; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */