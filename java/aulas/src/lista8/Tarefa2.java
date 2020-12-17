package lista8;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Tarefa2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Animal zoologico = new Animal();
		
		
		int qtd;
		char opcao;
		String nome;
		int idade;
		String detalhe = "";
		
		System.out.print("Quantos animais vai invocar ?");
		qtd = leia.nextInt();
		for (int i=1; i<= qtd; i++) {
			System.out.printf("Animal %d - digite as informações:%n",i);
			System.out.println("Animal sobe em arvore[S/N]: ");
			opcao = leia.next().toUpperCase().charAt(0);
			if(opcao == 'N') {
				System.out.println("Esse animal corre como?");
				leia.nextLine();
				detalhe = leia.nextLine().toUpperCase();
			}
			
			System.out.print("Digite o nome: ");
			nome = leia.next();
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			
			if (opcao =='S') {
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				zoologico = new Preguica(nome, idade);
				System.out.println("Nome: " + zoologico.getNome() + " Idade: " + zoologico.emitirSom());
			}
			else if(detalhe.equals("IGUAL CACHORRO")){
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				zoologico = new Cachorro(nome,idade);
				System.out.println("Nome: " + zoologico.getNome() + " Idade: " + zoologico.emitirSom());
			}
			else if(detalhe.equals("IGUAL CAVALO")){
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				zoologico = new Cavalo(nome,idade);
				System.out.println("Nome: " + zoologico.getNome() + " Idade: " + zoologico.emitirSom());
			}
					
		}
		
		leia.close();
	}
		
}


