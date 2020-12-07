programa
{
	
	funcao inicio(){
		inteiro tresElementos[3], matriz3x3[3][3]

		para(inteiro i = 0 ; i < 3; i++){	
			escreva("Insira o " + (i + 1) + "º numero: ")
			leia(tresElementos[i])
		}
		pulaLinha()
		pulaLinha()
		
		para(inteiro l = 0 ; l < 3; l++){
			para(inteiro c = 0 ; c < 3; c++){
			escreva("Insira os valores da matriz " + "[" +(l)+"," + (c) + "]" + ": ")	
			leia(matriz3x3[l][c])
			}
			pulaLinha()
		}

		escreva("Numeros do vetor:")
		pulaLinha()
		para(inteiro i = 0 ; i < 3; i++){	
			escreva(tresElementos[i])
		}

		
		pulaLinha()
		pulaLinha()
		escreva("Numeros da Matriz:")
		pulaLinha()
		para(inteiro l = 0 ; l < 3; l++){
			para(inteiro c = 0 ; c < 3; c++){
			escreva(matriz3x3[l][c]+ " ")	
			}
			pulaLinha()
		}
		
		pulaLinha()
		pulaLinha()
		escreva("Numeros da Matriz Multiplicados:")
		pulaLinha()
		para(inteiro l = 0 ; l < 3; l++){
			para(inteiro c = 0 ; c < 3; c++){
			matriz3x3[l][c] = matriz3x3[l][c] * tresElementos[c]
			escreva(matriz3x3[l][c]+ " ")	
			}
			pulaLinha()
		}

		
			
	
	}// Fim da função Inicial

	funcao pulaLinha(){//Funcao para pular Linha
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 821; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */