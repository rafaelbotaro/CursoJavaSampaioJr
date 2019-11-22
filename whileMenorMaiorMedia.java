package unidade4.While;

import java.util.Scanner;

public class whileMenorMaiorMedia {

	public static void main(String[] args) {

		double valor, menor, maior, media = 0;
		int cont = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		valor = leia.nextDouble();
		
		menor = valor;
		maior = valor;
		
		while (valor != 0)
		{
			cont++;
			if (valor < menor)
				menor = valor;
			else if (valor > maior)
				maior = valor;
			
			media = media + valor;
			
			System.out.print("Informe um valor ou digite 0 para sair: ");
			valor = leia.nextDouble();
		}
		
		media = media / cont;
		
		System.out.print("\nO menor valor é: "+menor);
		System.out.print("\nO maior valor é: "+maior);
		System.out.print("\nA média dos valores é: "+media);
		leia.close();

	}

}