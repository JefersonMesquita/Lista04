package Lista4;

import java.util.Random;

public class Questao03 {

	public static void main(String[] args) {
		Random rand = new Random();
		int vetor[] = new int[100];
		int vetPosiMult3[] = new int[50];
		int vetPosiNMult3[] = new int[50];
		int vetNegaMult3[] = new int[50];
		int vetNegaNMult3[] = new int[50];
		int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;

		System.out.print("O vetor:	");
		for (int i = 0; i < 100; i++) {
			vetor[i] = rand.nextInt(100) - 50;
			System.out.print(vetor[i] + " , ");

			if (vetor[i] % 3 == 0 && vetor[i] > 0) {
				vetPosiMult3[cont1] = vetor[i];
				cont1++;
			}
			if (vetor[i] % 3 != 0 && vetor[i] > 0) {
				vetPosiNMult3[cont2] = vetor[i];
				cont2++;
			}
			if (vetor[i] % 3 == 0 && vetor[i] < 0) {
				vetNegaMult3[cont3] = vetor[i];
				cont3++;
			}
			if (vetor[i] % 3 != 0 && vetor[i] < 0) {
				vetNegaNMult3[cont4] = vetor[i];
				cont4++;
			}
		}
		
		System.out.print("\n\nNúmeros positivos múltiplos de 3:	");
		for(int i: vetPosiMult3)
			System.out.print(i + " , ");
		System.out.print("\n\nNúmeros positivos não múltiplos de 3:	");
		for(int i: vetPosiNMult3)
			System.out.print(i + " , ");
		System.out.print("\n\nNúmeros negativos múltiplos de 3:	");
		for(int i: vetNegaMult3)
			System.out.print(i + " , ");
		System.out.print("\n\nNúmeros negativos não múltiplos de 3:	");
		for(int i: vetNegaNMult3)
			System.out.print(i + " , ");
	}

}
