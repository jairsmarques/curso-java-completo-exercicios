/*
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
 * tela todos os números pares, e também a quantidade de números pares.
 * 
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int N = sc.nextInt();

		int[] vect = new int[N];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("NÚMEROS PARES: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] + " ");
			}
		}
		
		System.out.println();

		int cont = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				cont++;
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + cont);

		sc.close();

	}

}
