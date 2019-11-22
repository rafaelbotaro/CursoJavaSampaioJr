package unidade2;

import java.util.Locale;
import java.util.Scanner;

public class taxaGarcom {

	public static void main(String[] args) {

		double vjantar, taxa, vtotal;
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o valor do jantar: R$ ");
		vjantar = leia.nextDouble();
		
		taxa = vjantar * 0.1;
		vtotal = vjantar + taxa;
		
		System.out.printf("\nA taxa de serviço do garçon é R$ %.2f reais.\n", taxa);
		System.out.printf("O valor total da sua conta é R$ %.2f reais.", vtotal);
		leia.close();
		
	}

}