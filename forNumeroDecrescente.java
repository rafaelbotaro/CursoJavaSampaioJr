package unidade4.For;

import java.util.Scanner;

public class forNumeroDecrescente {

	public static void main(String[] args) {

		int i, numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		numero = leia.nextInt();
		System.out.println();
		
		for (i = numero; i >= 1; i--)
			System.out.println("N�mero: "+i);
		
		leia.close();
		
	}

}