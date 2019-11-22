package unidade4.For;

import java.util.Scanner;

public class forMediaAlunos {

	public static void main(String[] args) {

		int i;
		float n1, n2, n3, n4, med, medAlunos = 0;
		
		Scanner leia = new Scanner (System.in);
		
		for (i = 1; i <= 5; i++)
		{		
			System.out.print("Digite a 1a. nota: ");
			n1 = leia.nextFloat();
			
			System.out.print("Digite a 2a. nota: ");
			n2 = leia.nextFloat();
			
			System.out.print("Digite a 3a. nota: ");
			n3 = leia.nextFloat();
			
			System.out.print("Digite a 4a. nota: ");
			n4 = leia.nextFloat();
			System.out.println();
			
			med = (n1 + n2 + n3 + n4) / 4;
			medAlunos = medAlunos + med;
	
			System.out.println("A média obtida pelo aluno foi "+med);
			System.out.println("\n");
		}
		
		medAlunos = medAlunos / i;
		System.out.println("A média geral dos 5 alunos foi: "+medAlunos);		
		
		leia.close();

	}

}