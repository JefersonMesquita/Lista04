package Lista4;

import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho das bandeiras (recomendo um tamanho impar maior que 9)");
		int num = scan.nextInt();

		System.out.println("A:");

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j - i == num / 2 || i - j == num / 2 || j + i == num / 2 || j + i == num / 2 * 3)
					System.out.print(" % ");
				else if (i > num * 1 / 3 && j > num * 1 / 3 && i < num * 2 / 3 && j < num * 2 / 3)
					System.out.print(" 0 ");
				else
					System.out.print(" - ");
			}
			System.out.println();
		}

		System.out.println("B:");

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i < num * 1 / 3)
					System.out.print(" * ");
				else if (i > num * 1 / 3 && i < num * 2 / 3)
					System.out.print(" % ");
				else
					System.out.print(" & ");
			}
			System.out.println();
		}

		System.out.println("C:");

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i > num * 1 / 3 && j > num * 1 / 3 && i < num * 2 / 3 && j < num * 2 / 3)
					System.out.print(" & ");
				else if (i > num * 1 / 3 && i < num * 2 / 3)
					System.out.print(" % ");
				else
					System.out.print(" * ");
			}
			System.out.println();
		}

		System.out.println("D:");

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j < num * 1 / 3)
					System.out.print(" * ");
				else if (j >= num * 1 / 3 && j <= num * 2 / 3)
					System.out.print(" % ");
				else
					System.out.print(" & ");
			}
			System.out.println();
		}

		System.out.println("E:");

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i > num * 1 / 3 && i < num * 2 / 3 || j > num * 1 / 3 && j < num * 2 / 3)
					System.out.print(" & ");
				else
					System.out.print(" * ");
			}
			System.out.println();
		}

		System.out.println("F:");

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i < num * 1 / 3 - 1 && j >= 1 && j < num * 1 / 3
						|| i < num * 1 / 3 - 1 && j >= num * 2 / 3 + 1 && j < num - 1
						|| i > num * 2 / 3 + 1 && j >= 1 && j < num * 1 / 3
						|| i > num * 2 / 3 + 1 && j >= num * 2 / 3 + 1 && j < num - 1)
					System.out.print(" % ");
				else if (i > num * 1 / 3 && j > num * 1 / 3 && i < num * 2 / 3 && j < num * 2 / 3)
					System.out.print(" & ");
				else
					System.out.print(" * ");
			}
			System.out.println();
		}

		System.out.println("G:");

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i < num * 1 / 3 + 1 && j < num * 1 / 3)
					System.out.print(" * ");
				else if (i % 2 == 1)
					System.out.print(" $ ");
				else
					System.out.print(" & ");
			}
			System.out.println();
		}

		System.out.println("H:");

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (j < num * 1 / 3 + 1 && i % 2 == 1 || j < num * 1 / 3)
					System.out.print(" * ");
				else if (j < num * 1 / 3 + 2 && (i % 2 == 0 && j % 2 == 1 || i % 2 == 1 && j % 2 == 0))
					System.out.print(" & ");
				else
					System.out.print(" % ");
			}
			System.out.println();
		}

		System.out.println("I:");

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i >= num * 1 / 3 && j >= num * 1 / 3 && i <= num * 2 / 3 && j <= num * 2 / 3)
					System.out.print(" 0 ");
				else
					System.out.print(" - ");
			}
			System.out.println();
		}

	}

}
