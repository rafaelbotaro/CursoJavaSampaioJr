package unidade2;

import java.util.Scanner;

public class calculaDobro {

	public static void main(String[] args) {
		
		int numero, dobro;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um n�mero: ");
		numero = leia.nextInt();
		
		dobro = numero * 2;
		
		System.out.println("\nO dobro de "+numero+" � "+dobro+".");		
		leia.close();

	}

}
