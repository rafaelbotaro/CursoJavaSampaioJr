package unidade3.Case;

import java.util.Locale;
import java.util.Scanner;

public class caseFormaPagamento {

	public static void main(String[] args) {

		double valorProduto, valorFinal;
		int codigoProduto;

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: R$ ");
		valorProduto = leia.nextDouble();
		System.out.println();
		
		System.out.print("Favor informar o tipo de pagamento: \n[1 - 10% de desconto] - [2 - 5% de desconto] - "
				+ "[3 - 2x sem juros] - [4 - 3x com juros de 5%]:");
		codigoProduto = leia.nextInt();
		System.out.println();
		
		switch (codigoProduto) 
		{
			case 1:
			{
				valorFinal = valorProduto * 0.9;
				System.out.printf("\nValor final do produto com 10% de desconto R$ %.2f reais.",valorFinal);
				break;
			}
			case 2:
			{
				valorFinal = valorProduto * 0.95;
				System.out.printf("\nValor final do produto com 5% de desconto R$ %.2f reais.",valorFinal);
				break;
			}
			case 3:
			{
				valorFinal = valorProduto / 2;
				System.out.printf("\nTotal: 2 parcelas sem juros de R$ %.2f reais.",valorFinal);
				break;
			}
			case 4:
			{
				valorFinal = (valorProduto * 1.1) / 3;
				System.out.printf("\nTotal: 3 parcelas com 5% de juros de R$ %.2f reais.",valorFinal);
				break;
			}
			default:
			{
				System.out.println("OPÇÃO INCORRETA, TENTE NOVAMENTE.\n\n");
				caseFormaPagamento.main(null);
			}
		}
		
		leia.close();
		
	}

}
