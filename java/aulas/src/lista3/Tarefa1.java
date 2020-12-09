package lista3;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Random aleatorio = new Random();
		
		final int NUMEROHABITANTES = 20;
		double salarioHabitantes, somaSalarios = 0, maiorSalario = 0;
		int filhosHabitantes, somaFilhos = 0, ateCem = 0;
		
		System.out.println("==============================");
		System.out.println("Pesquisa Sal�rios e filhos");
		System.out.println("==============================");
		System.out.println();
		
		for(int i = 1; i <= NUMEROHABITANTES; i++) {
			System.out.printf("Insira o Salario do %d � habitante R$ ", i);
			//salarioHabitantes = leia.nextDouble();
			salarioHabitantes = Math.round(aleatorio.nextDouble() * 1000.5); //INSER��O DE SALARIO NO ALEATORIO PARA TESTAR
			System.out.println(salarioHabitantes);
			somaSalarios += salarioHabitantes;
			
			maiorSalario = (salarioHabitantes > maiorSalario) ? salarioHabitantes : maiorSalario; //Condi��o Ternaria para o maior Salario.
			ateCem += (salarioHabitantes <= 100) ? 1 : 0 ; //Condi��o Ternaria para  Salario at� R$ 100.
		
			
			System.out.printf("Insira a quantidade de filhos do %d � habitante: ", i);
			//filhosHabitantes= leia.nextInt();
			filhosHabitantes = aleatorio.nextInt(5); //INSER��O DE FILHOS NO ALEATORIO PARA TESTAR
			System.out.println(filhosHabitantes);
			somaFilhos += filhosHabitantes;
			System.out.println();
			
		}
		
		System.out.printf("A m�dia de salario da popula��o � %.2f reais por habitante%n", somaSalarios / NUMEROHABITANTES);
		System.out.printf("A m�dia de filhos da popula��o � %d filhos por habitante%n", somaFilhos / NUMEROHABITANTES);
		System.out.printf("O maior salario da popula��o � %.2f reais%n", maiorSalario);
		System.out.println("O percentual de pessoas com salario at� R$ 100.00 � " +  percentualSalario(ateCem, NUMEROHABITANTES) + "% da popula��o");
		
		
		leia.close();
	}
	
	public static double percentualSalario(int ateCem, int NUMEROHABITANTES) {
		
		return ((ateCem * 100) / NUMEROHABITANTES);
	}

}
