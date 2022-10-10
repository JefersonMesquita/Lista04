package Lista4;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String semana[] = {"segunda", "terça", "quinta"};
		float valor = 50;
		
		System.out.println("ferramenta = R$ " + valor);
		
		System.out.println("Digite o dia da semana que vai alugar");
		String dia = scan.next();
		System.out.println("Deseja alugar uma ferramenta nova ou usada?");
		String ferramenta = scan.next();
		
		if(dia.equalsIgnoreCase(semana[0]) || dia.equalsIgnoreCase(semana[1]) || dia.equalsIgnoreCase(semana[2]))
			valor += valor *= 0.4;
		
		if(ferramenta.equals("nova")) 
			valor += valor *= 0.15;
	
		System.out.println("Valor do aluguel: " + valor);
	}

}
