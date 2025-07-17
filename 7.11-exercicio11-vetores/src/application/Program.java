/*
 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
 * que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
 * de homens.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoa serão digitadas?");
		int n = sc.nextInt();
		int[] vect = new int[n];
		double[] altura = new double[n];
		char[] genero = new char[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
		}
		
		double menorAltura = altura[0];
		System.out.print("Menor altura: ");
		for (int i = 0; i < vect.length; i++) {
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		System.out.printf("%.2f%n", menorAltura);
		
		double maiorAltura = altura[0];
		System.out.print("Maior altura: ");
		for (int i = 0; i < vect.length; i++) {
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
		}
		System.out.printf("%.2f%n", maiorAltura);
		
		double somaAlturaMulheres = 0.0;
		int cont = 0;
		for (int i = 0; i < vect.length; i++) {
			if (genero[i] == 'F') {
				cont++;
				somaAlturaMulheres += altura[i];
			}
		}
		double mediaMulheres = somaAlturaMulheres / cont;
		System.out.printf("Média das alturas das mulheres = %.2f%n", mediaMulheres);
		
		int homem = 0;
		for (int i = 0; i < vect.length; i++) {
			if (genero[i] == 'M') {
				homem++;
			}
		}
		System.out.println("Número de homens = "+ homem);

		sc.close();

	}

}
