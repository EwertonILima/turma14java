programa
{
	
	funcao inicio(){
		inteiro idadeNadador
		
		escreva("Insira a idade do nadador: ")
		leia(idadeNadador)

		se(idadeNadador >= 18) {
			escreva("\nCategoria Adulto")
		}
		senao se(idadeNadador >= 14 e idadeNadador <= 17) {
			escreva("\nCategoria Juvenil B")
		}
		senao se(idadeNadador >= 12 e idadeNadador <= 13) {
			escreva("\nCategoria Juvenil A")
		}
		senao se(idadeNadador >= 8 e idadeNadador <= 11) {
			escreva("\nCategoria Infantil B")
		}
		senao se(idadeNadador >= 5 e idadeNadador <= 7) {
			escreva("\nCategoria Infantil B")
		}
		senao {
			escreva("\nSem Categoria")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 210; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */