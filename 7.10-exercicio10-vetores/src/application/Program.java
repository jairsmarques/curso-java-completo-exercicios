/*
 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
 * no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
 * os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
 * igual a 6.0 (seis).
 * 
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serão digitados: ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "a aluno:");
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}

		double media = 0.0;
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < vect.length; i++) {
			media = (nota1[i] + nota2[i]) / 2.0;
			if (media >= 6.0) {
				System.out.println(nome[i]);
			}
		}

		sc.close();
	}

}
