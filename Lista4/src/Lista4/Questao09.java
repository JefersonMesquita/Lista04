package Lista4;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho do triangulo");

		int h = scan.nextInt();
		int cont = h;

		for (int i = 0; i < h; i++) {
			for (int j = h-i; j > 0; j--) 
				System.out.print(" ");
			for(int k = 0; k <= i; k++)
				System.out.print(" *");
			System.out.println();
		}
	}
}