package unidade4.While;

import java.util.Locale;
import java.util.Scanner;

public class ifWhilePopulacao {

	public static void main(String[] args) {

		double populacaoA, populacaoB, taxaA, taxaB;
		int tempo = 0;
		String paisA, paisB;

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		System.out.print("INSTRUÇÃO:\n\n1.o país: o menos populoso com maior taxa de crescimento."
				+ "\n2.o país: o mais populoso com menor taxa de crescimento.\n\n\n");
		System.out.print("INSIRA OS DADOS\n\n");

		System.out.print("Nome do 1.o país: ");
		paisA = leia.next();
		System.out.print("População da(o) " + paisA + ": ");
		populacaoA = leia.nextDouble();
		System.out.print("Taxa de crescimento da(o) " + paisA + ": ");
		taxaA = leia.nextDouble();
		System.out.println();

		System.out.print("Nome do 2.o país: ");
		paisB = leia.next();
		System.out.print("População da(o) " + paisB + ": ");
		populacaoB = leia.nextDouble();
		System.out.print("Taxa de crescimento da(o) " + paisB + ": ");
		taxaB = leia.nextDouble();
		System.out.println();
		
		if (populacaoB > populacaoA) 
		{
			while (populacaoB >= populacaoA) {
				populacaoA += taxaA * populacaoA;
				populacaoB += taxaB * populacaoB;
				tempo++;
			}
		} else 
		{
			while (populacaoA >= populacaoB) {
				populacaoA += taxaA * populacaoA;
				populacaoB += taxaB * populacaoB;
				tempo++;
			}
		}

		double populacaoFinalA = populacaoA;
		double populacaoFinalB = populacaoB;

		if (populacaoFinalA > populacaoFinalB)
			System.out.print("\nSerão necessários " + tempo + " anos para a população\nda(o) " + paisA
					+ " ultrapassar a da(o) " + paisB + ".");
		else
			System.out.print("\nSerão necessários " + tempo + " anos para a população\nda(o) " + paisB
					+ " ultrapassar a da(o) " + paisA + ".");
		leia.close();
	}

}