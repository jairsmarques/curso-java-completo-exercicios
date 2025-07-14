/*
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres 
 * do ano(primeiro trimestre vale 30 e segundo e terceiro valem 35 cada). Ao final, mostrar qual a
 * nota final do aluno no ano. Dizer também se o aluno está aprovado(PASS) ou não(FAILED) e , em caso
 * negativo, quantos pontos faltam para o aluno obter o mínimo para ser aprovado(que é 60% da nota).
 * 
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();

		System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
		if (student.finalGrade() < 60.0) {
			System.out.println("Failed");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}

		sc.close();

	}

}
