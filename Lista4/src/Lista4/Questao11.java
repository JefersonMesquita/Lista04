package Lista4;

import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a matrícula");
		String matricula = scan.next();
		char[] matriculaChar = new char[matricula.length()];

		for (int i = 0; i < matricula.length(); i++) {
			matriculaChar[i] = matricula.charAt(i);
		}

		for (int j = 0; j < 6; j++) {
			System.out.print("[" + matriculaChar[j] + "] ");
			j++;
			System.out.print("[" + matriculaChar[j] + "] ");
			System.out.println();
		}

		System.out.println();
		
		for (int j = 0; j < 6; j++) {
			System.out.print("[" + matriculaChar[j] + "] ");
			j++;
			System.out.print("[" + matriculaChar[j] + "] ");
			j++;
			System.out.print("[" + matriculaChar[j] + "] ");
			System.out.println();
		}
	}
}
