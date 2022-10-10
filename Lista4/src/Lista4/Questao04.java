package Lista4;

import java.util.Scanner;

public class Questao04 {

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite um nome: ");
	String nome = scan.next();
	char[] nomeChar = nome.toCharArray();
	
	for(int i=0; i<nome.length(); i++) {
		if(nomeChar[i] == 'a' || nomeChar[i] == 'e' || nomeChar[i] == 'i' || nomeChar[i] == 'o' || nomeChar[i] == 'u')
			System.out.println(nomeChar[i] + ": Vogal");
		else
			System.out.println(nomeChar[i] + ": Consoante");
		}
	}
}