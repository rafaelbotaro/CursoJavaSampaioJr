package unidade3.IfElseIf;

import java.util.Scanner;

public class encadMediaAlunos {

	public static void main(String[] args) {
		
		float n1, n2, n3, n4, med;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite a 1a. nota: ");
		n1 = leia.nextFloat();
		
		System.out.print("Digite a 2a. nota: ");
		n2 = leia.nextFloat();
		
		System.out.print("Digite a 3a. nota: ");
		n3 = leia.nextFloat();
		
		System.out.print("Digite a 4a. nota: ");
		n4 = leia.nextFloat();
		
		med = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println("\n\nMÉDIA: "+med);
		
		if (med >= 7)
			System.out.println("ALUNO APROVADO");
		else
		{
			if (med >= 5)
				System.out.println("ALUNO EM RECUPERAÇÃO");
			else
				System.out.println("ALUNO REPROVADO");
		}
			
		leia.close();

	}

}
