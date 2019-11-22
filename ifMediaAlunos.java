package unidade3.If;

import java.util.Scanner;

public class ifMediaAlunos {
	
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
		System.out.println();
		
		med = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println("Média do aluno: "+med);
		
		if (med < 5)
			System.out.print("O aluno foi reprovado.");
			leia.close();

	}

}
