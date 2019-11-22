package unidade4.While;

import java.util.Scanner;

public class whileMenorMaiorValor {

	public static void main(String[] args) {

		int valor, menor, maior;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		valor = leia.nextInt();
		
		menor = valor;
		maior = valor;
		
		while (valor != 0)
		{
			if (valor < menor)
				menor = valor;
			else if (valor > maior)
				maior = valor;
			
			System.out.print("Informe um valor ou digite 0 para sair: ");
			valor = leia.nextInt();
		}
		System.out.print("\nO menor valor é: "+menor);
		System.out.print("\nO maior valor é: "+maior);
		leia.close();
	}

}
