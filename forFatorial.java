package unidade4.For;

import java.util.Scanner;

public class forFatorial {

	public static void main(String[] args) {
		
		long fatorial = 1;
		int i, num, num2;
		
		Scanner leia = new Scanner (System.in);

		System.out.print("Digite um número para calcular seu fatorial: ");
		num = leia.nextInt();
		num2 = num;
		
		for (i = 0; i <= num*2; i++)
		{
			fatorial = fatorial * num;
			num--;			
		}
		System.out.println("\nO fatorial de "+num2+" é "+fatorial);
		leia.close();
	}

}
