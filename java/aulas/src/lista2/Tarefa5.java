package lista2;
import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {
		
		Scanner leia  = new Scanner(System.in);
		
		double indicePoluicao;
		final double INDICEINICIAL  = 0.3, INDICEINTERMEDIARIO = 0.4, INDICEFINAL  = 0.5;
 		
		System.out.print("Insira o ind�ce de polui��o medido: ");
		indicePoluicao = leia.nextDouble();
		System.out.println();
		
		if(indicePoluicao >= INDICEFINAL) {
			System.out.println("Todos os grupos, suspendam suas atividades");
		}
		else if(indicePoluicao >= INDICEINTERMEDIARIO){
			System.out.println("Industrias do 1� e 2� Grupo, suspendam suas atividades");
		}
		else if (indicePoluicao >= INDICEINICIAL){
			System.out.println("Industrias do 1� Grupo, suspendam suas atividades");
		}
		else {
			System.out.println("Os indices de polui��o est�o em n�veis aceitaveis, nenhuma paralisa��o necessita ser feita.");
		}
		
		
		leia.close();

	}

}
