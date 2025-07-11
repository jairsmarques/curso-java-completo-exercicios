/*
 * Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual 
 * dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente
 * se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de 
 * intervalo”.
 * 
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valor = sc.nextDouble();

		if (valor >= 0 && valor <= 25.0) {
			System.out.println("Intervalo (0,25)");
		} else if (valor > 25 && valor <= 50.0) {
			System.out.println("Intervalo (25,50)");
		} else if (valor > 50 && valor <= 75.0) {
			System.out.println("Intervalo (50,75)");
		} else if (valor > 75 && valor <= 100.0) {
			System.out.println("Intervalo (75,100)");
		} else {
			System.out.println("Fora de intervalo");
		}

		sc.close();

	}

}
