package Lista4;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero");
		String num = scan.next();

		int numCop = Integer.parseInt(num);
		char[] numChar = new char[num.length()];
		int[] nums = new int[num.length()];
		int soma = 0;

		for (int i = 0; i < num.length(); i++) {
			numChar[i] = num.charAt(i);
			nums[i] = Character.getNumericValue(numChar[i]);
			soma += Math.pow(nums[i], nums.length);;
		}

		if (soma == numCop)
			System.out.println("É um número de Armstrong");
		else
			System.out.println("Não é um número de Armstrong");

	}
}