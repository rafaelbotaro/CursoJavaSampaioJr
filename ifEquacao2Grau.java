package unidade3.If;

import java.util.Scanner;

public class ifEquacao2Grau {

	public static void main(String[] args) {

		int a, b, c;
		double delta, x1, x2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		a = leia.nextInt();
		
		System.out.print("Digite o valor de B: ");
		b = leia.nextInt();
		
		System.out.print("Digite o valor de C: ");
		c = leia.nextInt();
		
		delta = b * b - 4 * a * c;	
		
		if (delta >= 0)
		{
			x1 = -b - (Math.sqrt(delta)) / 2 * a;
			x2 = -b + (Math.sqrt(delta)) / 2 * a;
			System.out.printf("\nO valor de x1 é: "+x1);
			System.out.printf("\nO valor de x2 é: "+x2);	
		}
		
		leia.close();

	}

}
