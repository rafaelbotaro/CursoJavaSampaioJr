package unidade4.For;

import java.util.Scanner;

public class forMostraTabuada {

	public static void main(String[] args) {

		int i, numero, total = 1;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o n�mero para calcular tabuada: ");
		numero = leia.nextInt();
		System.out.println();
		
		for (i = 0; i <= 10; i++)
		{
			total = numero * i;
			System.out.println("N�mero: "+numero+" x "+i+" = "+total);
		}
		
		leia.close();
		
	}

}
