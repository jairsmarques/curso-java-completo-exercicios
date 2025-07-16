/*
 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
 * aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
 * digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 * 
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter um vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		int cont = 0;
		int soma = 0;
		double media = 0.0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				soma += vect[i];
				cont++;
				media = soma / cont;
			} else {
				media = 0.0;
			}
		}

		if (media == 0.0) {
			System.out.println("NENHUM NÚMERO PAR");
		} else {
			System.out.printf("MÉDIA DOS PARES: %.1f%n", media);
		}

		sc.close();

	}

}
