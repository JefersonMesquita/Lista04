package Lista4;

import java.util.Random;
import java.util.Scanner;

public class Questao05 {

	public static int[] gerarVetor(int tam) {
		Random rand = new Random();
		int vet[] = new int[tam];
		
		for (int i = 0; i < tam; i++) 
		vet[i] = rand.nextInt(100) - 50;
		return vet;
	}
	
	public static int somaVetor(int vet[]) {
		int soma = 0;
		for(int i=0; i<vet.length; i++)
			soma+=vet[i];
		return soma;
	}
	
	public static int prodVetor(int vet[]) {
		int prod = 0;
		for(int i=0; i<vet.length; i++)
			prod *= vet[i];		
		return prod;
	}
	
	public static int mediaVetor(int soma) {
		int media = soma/3;
		return media;
	}
	
	public static int[] composicaoVetor(int a, int b, int c) {
		int vet[] = new int[3];
		vet[0] = a;
		vet[1] = b;
		vet[2] = c;
		return vet;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual o tamanho dos vetores?");
		int tam = scan.nextInt();
		int vet1[] = gerarVetor(tam);
		int vet2[] = gerarVetor(tam);
		int vet3[] = gerarVetor(tam);
		
		int soma1 = somaVetor(vet1);
		int soma2 = somaVetor(vet2);
		int soma3 = somaVetor(vet3);
		
		int prod1 = prodVetor(vet1);
		int prod2 = prodVetor(vet2);
		int prod3 = prodVetor(vet3);
		
		int media1 = mediaVetor(soma1);
		int media2 = mediaVetor(soma2);
		int media3 = mediaVetor(soma3);
		
		int vetSoma[] = composicaoVetor(soma1, soma2, soma3);
		int vetProd[] = composicaoVetor(prod1, prod2, prod3);
		int vetMedia[] = composicaoVetor(media1, media2, media3);
		
		int somaGeral = somaVetor(vetSoma);
		int prodGeral = prodVetor(vetProd);
		float mediaGeral = (media1 + media2 + media3)/3;
		
		System.out.print("Vetor 1: ");
		for(int a: vet1)
			System.out.print(a + " , ");
		System.out.print("\nVetor 2: ");
		for(int b: vet2)
			System.out.print(b + " , ");
		System.out.print("\nVetor 3:");
		for(int c: vet3)
			System.out.print(c + " , ");
		
		System.out.println("\nSoma vetor 1: " + soma1 + "| Soma vetor 2:" + soma2 + "| Soma vetor 3:" + soma3);
		System.out.println("Produto vetor 1:" + prod1 + "| Produto vetor 2:" + prod2 + "| Produto vetor 3:" + prod3);
		System.out.println("Media vetor 1" + media1 + "| Media vetor 2" + media2 + "| Media vetor 3" + media3);
		
		System.out.print("Vetor de somas:");
		for(int x: vetSoma)
			System.out.print(x + " , ");
		System.out.print("\nVetor de produtos:");
		for(int y: vetProd)
			System.out.print(y + " , ");
		System.out.print("\nVetor de Médias:");
		for(int z: vetMedia)
			System.out.print(z + " , ");
		
		System.out.println("\nSoma geral: " + somaGeral + "| Produto Geral: " + prodGeral + "| Média Geral: " + mediaGeral);
	}
}