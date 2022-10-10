package Lista4;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int segundos = 0, minutos = 0, horas = 0, resto = 0;

		System.out.println("qual a massa inicial do material?");
		float massa = scan.nextInt();
		float massaInicial = massa;

		while (massa > 0.5) {
			massa /= 2;
			segundos += 50;
		}
		
		int sla = segundos;
		
		horas = segundos / 3600;
		resto = segundos % 3600;
		minutos = resto / 60;
		segundos = resto % 60;

		System.out.println("Massa inicial: " + massaInicial + "g Massa final: " + massa + "g Tempo decorrido: " + horas +":"+ minutos +":"+ segundos+ " segundos: " + sla);
	}
}
