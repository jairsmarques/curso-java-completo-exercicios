/*
 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
 * devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
 * da pessoa mais velha.
 * 
 */

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoa você vai digitar? ");
		int n = sc.nextInt();
		int vect[] = new int[n];
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		int maiorIdade = idade[0];
		int posicaoMaior = 0;
		for (int i = 0; i < vect.length; i++) {
			if(idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				posicaoMaior = i;
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s%n", nome[posicaoMaior]);

		sc.close();

	}

}
