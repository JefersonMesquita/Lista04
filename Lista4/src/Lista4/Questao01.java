package Lista4;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float valorSalario = 0, restituicao = 0;

		System.out.println("Quantos salarios minimos você recebe?");
		int quantSalario = scan.nextInt();

		System.out.println("Quantos dependentes?");
		int quantDependentes = scan.nextInt();

		valorSalario = quantSalario * 1212;

		if (quantSalario <= 5)
			valorSalario = 0;
		else if (quantSalario > 12)
			valorSalario *= 0.20;
		else
			valorSalario *= 0.08;
		
		for(int i = 0 ; i < quantDependentes ; i++)
			restituicao += valorSalario * 0.02;
		
		System.out.println("O valor total a ser pago: R$ " + ((valorSalario-restituicao)*0.04));
	}
}