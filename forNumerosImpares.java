package unidade4.For;

import java.util.Scanner;

public class forNumerosImpares {

	public static void main(String[] args) {

		int a, b, i;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		a = leia.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		b = leia.nextInt();
		System.out.println();
		
		for (i = a; i < b; i++)
		{
			if (i % 2 != 0)
				System.out.println("O n�mero "+i+" � �mpar.");
		}
		
		leia.close();
		
	}

}