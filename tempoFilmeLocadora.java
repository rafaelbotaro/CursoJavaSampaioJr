package unidade2;

import java.util.Scanner;

public class tempoFilmeLocadora {

	public static void main(String[] args) {
	
		int hora, min, total;
		String filme;
		
		Scanner leia = new Scanner (System.in);

		System.out.print("Digite o nome do filme: ");
		filme = leia.next();
		System.out.println();
		
		System.out.print("Digite quantas horas tem o filme: ");
		hora = leia.nextInt();
		
		System.out.print("Digite quantos minutos tem o filme: ");
		min = leia.nextInt();
		System.out.println();
		
		total = hora * 60 + min;
		
		System.out.print("O filme "+filme+" tem a duração de "+total+" minutos.");
		leia.close();		

	}

}
