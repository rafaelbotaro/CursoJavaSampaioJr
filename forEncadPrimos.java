package unidade4.For;

import java.util.Scanner;

public class forEncadPrimos {

	public static void main(String[] args) {

		int i, numero, numeroDivisores = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um n�mero para saber se � Primo: ");
		numero = leia.nextInt();
		
		for (i = 1; i <= numero; i++)
		{
			if (numero % i == 0)
				numeroDivisores++;
		}
		
		if (numeroDivisores == 2)
			System.out.println("\nO n�mero "+numero+" � Primo.\n\nFim da execu��o.");
		else
			System.out.println("\nO n�mero "+numero+" n�o � Primo.\n\nFim da execu��o.");		
		leia.close();
	}

}