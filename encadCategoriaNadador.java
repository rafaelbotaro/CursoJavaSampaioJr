package unidade3.IfElseIf;

import java.util.Scanner;

public class encadCategoriaNadador {

	public static void main(String[] args) {

		int idade;

		Scanner leia = new Scanner(System.in);

		System.out.print("Idade do nadador: ");
		idade = leia.nextInt();

		if (idade > 18)
			System.out.println("\nADULTO");
		else if (idade >= 14)
			System.out.println("\nJUVENIL B");
		else if (idade >= 12)
			System.out.println("\nJUVENIL A");
		else if (idade >= 9)
			System.out.println("\nINFANTIL C");
		else if (idade >= 6)
			System.out.println("\nINFANTIL B");
		else
			System.out.println("\nINFANTIL C");
		leia.close();

	}

}
