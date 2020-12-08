package lista2;
import java.util.Scanner;

public class Tarefa5 {

	public static void main(String[] args) {
		
		Scanner leia  = new Scanner(System.in);
		
		double indicePoluicao;
		final double INDICEINICIAL  = 0.3, INDICEINTERMEDIARIO = 0.4, INDICEFINAL  = 0.5;
 		
		System.out.print("Insira o indíce de poluição medido: ");
		indicePoluicao = leia.nextDouble();
		System.out.println();
		
		if(indicePoluicao >= INDICEFINAL) {
			System.out.println("Todos os grupos, suspendam suas atividades");
		}
		else if(indicePoluicao >= INDICEINTERMEDIARIO){
			System.out.println("Industrias do 1º e 2º Grupo, suspendam suas atividades");
		}
		else if (indicePoluicao >= INDICEINICIAL){
			System.out.println("Industrias do 1º Grupo, suspendam suas atividades");
		}
		else {
			System.out.println("Os indices de poluição estão em níveis aceitaveis, nenhuma paralisação necessita ser feita.");
		}
		
		
		leia.close();

	}

}
