package unidade3.Else;

import java.util.Scanner;

public class elseRaizExata {

	public static void main(String[] args) {

		int numero;
		double raizExata, maiorValor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		numero = leia.nextInt();
		
		raizExata = Math.sqrt(numero);
		maiorValor = Math.ceil(raizExata);
		
		if (raizExata == maiorValor)
			System.out.println("\nA raiz exata de "+numero+" � "+raizExata+".");
		else
			System.out.println("\nN�o h� raiz exata para o n�mero "+numero+".");
		
		leia.close();

	}

}
