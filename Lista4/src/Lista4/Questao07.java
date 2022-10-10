package Lista4;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String entrada = scan.next();
		
		String saida = "";
		
		for(int i=entrada.length() - 1; i>=0; i--) {
			saida += entrada.charAt(i);
		}
		System.out.println(saida);
	}

}
