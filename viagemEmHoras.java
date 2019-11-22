package unidade2;

import java.util.Scanner;

public class viagemEmHoras {

	public static void main(String[] args) {

		int semanas, dias, horas, thoras;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o total de semanas viajando: ");
		semanas = leia.nextInt();
		
		System.out.print("Digite o total de dias viajando: ");
		dias = leia.nextInt();
		
		System.out.print("Digite o total de horas viajando: ");
		horas = leia.nextInt();
		System.out.println();
		
		thoras = (semanas * 7 * 24) + (dias * 24) + horas;
		
		System.out.println("O total de tempo viajando foi de "+thoras+ " horas.");
		leia.close();
		
	}

}