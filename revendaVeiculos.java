package unidade2;

import java.util.Scanner;

public class revendaVeiculos {

	@SuppressWarnings({ "unused" })
	public static void main(String[] args) {

		double valor, entrada, parcelas;
		String modelo;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o modelo do ve�culo: ");
		modelo = leia.next();
		
		System.out.print("Digite o valor do ve�culo: ");
		valor = leia.nextDouble();
		System.out.println();
		
		entrada = valor / 2;
		parcelas = entrada / 12;
		
		System.out.printf("O valor da entrada do ve�culo �: R$ %.2f reais. \n",entrada);
		System.out.printf("O valor de cada uma das 12 parcelas �: R$ %.2f reais.",parcelas);
		leia.close();
		
	}

}
