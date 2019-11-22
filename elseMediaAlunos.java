package unidade3.Else;

import java.util.Scanner;

public class elseMediaAlunos {

	public static void main(String[] args) {

		final int aulas = 100;
		
		float n1, n2, n3, n4, med;
		int faltas;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite a 1a. nota: ");
		n1 = leia.nextFloat();
		
		System.out.print("Digite a 2a. nota: ");
		n2 = leia.nextFloat();
		
		System.out.print("Digite a 3a. nota: ");
		n3 = leia.nextFloat();
		
		System.out.print("Digite a 4a. nota: ");
		n4 = leia.nextFloat();
		
		System.out.print("Digite as faltas: ");
		faltas = leia.nextInt();
		System.out.println();
		
		med = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println("A média do aluno foi: "+med);
		System.out.println("Ele teve "+faltas+" faltas de 25 permitidas.\n");
		
		if ((med < 5) || (faltas > aulas * 0.25))
			System.out.print("O aluno foi reprovado.");
		else
			System.out.println("O aluno foi aprovado.");
		
		leia.close();

	}

}
