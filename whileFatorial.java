package unidade4.While;

import java.util.Scanner;

public class whileFatorial {

	public static void main(String[] args) {

		long fatorial = 1;
		int num, num2;
		
		Scanner leia = new Scanner (System.in);

		System.out.print("Digite um número para calcular seu fatorial: ");
		num = leia.nextInt();
		num2 = num;
		
		while (num >= 1)
		{
			fatorial = fatorial * num;
			num--;			
		}
		System.out.println("\nO fatorial de "+num2+" é "+fatorial);
		leia.close();
	}

}