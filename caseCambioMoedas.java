package unidade3.Case;

import java.util.Locale;
import java.util.Scanner;

public class caseCambioMoedas {

	public static void main(String[] args) {

		double valor, conversao;
		int moeda;

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor que deseja fazer a convers�o: R$ ");
		valor = leia.nextDouble();
		System.out.println();
		
		System.out.print("Digite: [1 Libra] - [2 D�lar] - [3 Euro] - [4 Peso]: ");
		moeda = leia.nextInt();
		System.out.println();
		
		switch (moeda) 
		{
			case 1:
			{
				conversao = valor / 5;
				System.out.printf("\nO valor convertido � %.2f Libras.",conversao);
				break;
			}
			case 2:
			{
				conversao = valor / 4;
				System.out.printf("\nO Valor convertido � %.2f D�lares.",conversao);
				break;
			}
			case 3:
			{
				conversao = valor / 4.4;
				System.out.printf("\nO valor convertido � %.2f Euros.",conversao);
				break;
			}
			case 4:
			{
				conversao = valor * 8.8;
				System.out.printf("\nO valor convertido � %.2f Pesos.",conversao);
				break;
			}
			default:
				System.out.println("Op��o digitada incorreta.");
		}
		
		leia.close();

	}

}