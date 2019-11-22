package unidade4.For;

import java.util.Scanner;

public class forEncadPrimos {

	public static void main(String[] args) {

		int i, numero, numeroDivisores = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número para saber se é Primo: ");
		numero = leia.nextInt();
		
		for (i = 1; i <= numero; i++)
		{
			if (numero % i == 0)
				numeroDivisores++;
		}
		
		if (numeroDivisores == 2)
			System.out.println("\nO número "+numero+" é Primo.\n\nFim da execução.");
		else
			System.out.println("\nO número "+numero+" não é Primo.\n\nFim da execução.");		
		leia.close();
	}

}