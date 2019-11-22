package unidade3.If;

import java.util.Scanner;

public class ifNumParImpar {

	public static void main(String[] args) {

		int numero;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0)
			System.out.println("O número "+numero+" é par.");
		leia.close();

	}

}
