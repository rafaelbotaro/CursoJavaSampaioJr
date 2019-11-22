package unidade3.Case;

import java.util.Locale;
import java.util.Scanner;

public class caseCambioMoedas {

	public static void main(String[] args) {

		double valor, conversao;
		int moeda;

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor que deseja fazer a conversão: R$ ");
		valor = leia.nextDouble();
		System.out.println();
		
		System.out.print("Digite: [1 Libra] - [2 Dólar] - [3 Euro] - [4 Peso]: ");
		moeda = leia.nextInt();
		System.out.println();
		
		switch (moeda) 
		{
			case 1:
			{
				conversao = valor / 5;
				System.out.printf("\nO valor convertido é %.2f Libras.",conversao);
				break;
			}
			case 2:
			{
				conversao = valor / 4;
				System.out.printf("\nO Valor convertido é %.2f Dólares.",conversao);
				break;
			}
			case 3:
			{
				conversao = valor / 4.4;
				System.out.printf("\nO valor convertido é %.2f Euros.",conversao);
				break;
			}
			case 4:
			{
				conversao = valor * 8.8;
				System.out.printf("\nO valor convertido é %.2f Pesos.",conversao);
				break;
			}
			default:
				System.out.println("Opção digitada incorreta.");
		}
		
		leia.close();

	}

}