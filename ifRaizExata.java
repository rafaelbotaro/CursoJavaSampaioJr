package unidade3.If;

import java.util.Scanner;

public class ifRaizExata {

	public static void main(String[] args) {

		int numero;
		double raizExata, maiorValor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		raizExata = Math.sqrt(numero);
		maiorValor = Math.ceil(raizExata);
		
		if (raizExata == maiorValor)
			System.out.println("Existe raiz exata de "+numero);
		leia.close();

	}

}
