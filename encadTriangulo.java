package unidade3.IfElseIf;

import java.util.Scanner;

public class encadTriangulo {

	public static void main(String[] args) {

		int a, b, c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o lado A: ");
		a = leia.nextInt();
		
		System.out.print("Digite o lado B: ");
		b = leia.nextInt();
		
		System.out.print("Digite o lado C: ");
		c = leia.nextInt();
		
		if ((a < b + c) && (b < a + c) && (c < a + b))
		{
			if ((a == b) && (b == c)) 
				System.out.println("Tri�ngulo Equil�tero");
			else 
			{
				if ((a == b) || (b == c)|| (c == a))
					System.out.println("Tri�ngulo Is�celes");
				else
					System.out.println("Tri�ngulo Escaleno");
			}
				
		}
		else
			System.out.println("Os valores n�o formam um Tri�ngulo.");
		
		leia.close();

	}

}