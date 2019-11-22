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

		System.out.print("INSTRU��O:\n\n1.o pa�s: o menos populoso com maior taxa de crescimento."
				+ "\n2.o pa�s: o mais populoso com menor taxa de crescimento.\n\n\n");
		System.out.print("INSIRA OS DADOS\n\n");

		System.out.print("Nome do 1.o pa�s: ");
		paisA = leia.next();
		System.out.print("Popula��o da(o) " + paisA + ": ");
		populacaoA = leia.nextDouble();
		System.out.print("Taxa de crescimento da(o) " + paisA + ": ");
		taxaA = leia.nextDouble();
		System.out.println();

		System.out.print("Nome do 2.o pa�s: ");
		paisB = leia.next();
		System.out.print("Popula��o da(o) " + paisB + ": ");
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
			System.out.print("\nSer�o necess�rios " + tempo + " anos para a popula��o\nda(o) " + paisA
					+ " ultrapassar a da(o) " + paisB + ".");
		else
			System.out.print("\nSer�o necess�rios " + tempo + " anos para a popula��o\nda(o) " + paisB
					+ " ultrapassar a da(o) " + paisA + ".");
		leia.close();
	}

}