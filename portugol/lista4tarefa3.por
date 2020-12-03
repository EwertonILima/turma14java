programa
{
	inclua biblioteca Util
	
	funcao inicio(){
		inteiro matrizN1[4][6], matrizN2[4][6], matrizM1[4][6], matrizM2[4][6]

		escreva("MatrizN1:")
		pulaLinha()
		para(inteiro l = 0; l < 4; l++){
			para(inteiro c = 0; c < 6; c++){
				escreva("[",matrizN1[l][c] = Util.sorteia(1,5),"]"," ")
			}
		pulaLinha()
		}
		
		pulaLinha()
		escreva("MatrizN2:")
		pulaLinha()
		para(inteiro l = 0; l < 4; l++){
			para(inteiro c = 0; c < 6; c++){
				escreva("[",matrizN2[l][c] = Util.sorteia(1,5),"]"," ")
			}
		pulaLinha()
		}
		
		pulaLinha()
		escreva("MatrizM1:")
		pulaLinha()
		para(inteiro l = 0; l < 4; l++){
			para(inteiro c = 0; c < 6; c++){
				escreva("[",matrizN1[l][c] + matrizN2[l][c],"]"," ")
			}
		pulaLinha()
		}
		
		pulaLinha()
		escreva("MatrizM2:")
		pulaLinha()
		para(inteiro l = 0; l < 4; l++){
			para(inteiro c = 0; c < 6; c++){
				se(matrizN1[l][c] - matrizN2[l][c] < 0) {
				escreva("[0] ")
				}
				senao{
					escreva("[",matrizN1[l][c] - matrizN2[l][c],"]"," ")
				}
			}
			pulaLinha()
		}
		pulaLinha()
	}


	funcao pulaLinha(){
		escreva("\n")
	}

	
}





/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 918; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matrizN1, 6, 10, 8}-{matrizN2, 6, 26, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */