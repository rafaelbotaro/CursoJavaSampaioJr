package unidade4.For;

import java.util.Scanner;

public class forContasCasa {
	
	public static void main(String[] args) {

		double valor = 0, valorTotal = 0;
		int i, j, cont = 0, numeroContas = 0;
		String infoContas;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print(">>>  CONTAS A PAGAR  <<<\n\n");
		
		System.out.print("Número de contas que pretende pagar: ");
		numeroContas = leia.nextInt(); 
		
		j = numeroContas;
		
		for ( i = 0; i < j; i++)
		{
			System.out.print("\nQual conta será paga: ");
			infoContas = leia.next();
			System.out.print("Valor da conta de "+infoContas+": ");
			valor = leia.nextDouble();
				
			cont++;
			valorTotal += valor;
		}
		
		if (cont == 1)
			System.out.print("\nVocê cadastrou "+cont+" conta no valor total de R$ "+valorTotal+" reais.");
		else
			System.out.print("\nVocê cadastrou "+cont+" contas no valor total de R$ "+valorTotal+" reais.");
		leia.close();
	}

}