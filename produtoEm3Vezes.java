package unidade2;

import java.util.Locale;
import java.util.Scanner;

public class produtoEm3Vezes {

	public static void main(String[] args) {

		double preco, avista, parcela;
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o valor do produto: R$ ");
		preco = leia.nextDouble();
		System.out.println();
		
		avista = preco * 0.9;
		parcela = preco / 3;
		
		System.out.printf("O valor do produto a vista é: R$ %.2f reais.\n", avista);
		System.out.printf("O valor do produto em 3X iguais é: R$ %.2f reais.", parcela);
		leia.close();		
		
	}

}
