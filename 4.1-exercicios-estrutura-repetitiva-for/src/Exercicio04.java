/*
 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do 
 * primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 * 
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double divisao = 0.0;
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (b != 0) {
				divisao = (double) a / b;
				System.out.println(divisao);
			} else {
				System.out.println("Impossivel");
			}

		}

		sc.close();

	}

}
