package unidade4.While;

import java.util.Scanner;

public class whileContasCasa {

	public static void main(String[] args) {

		int cont = 0;
		String infoContas;
		double valor = 0, valorTotal = 0;
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		System.out.print(">>>  CONTAS A PAGAR  <<<\n\nPara encerrar: '0' e 'Enter' -> 2 vezes.\n\n");
		
		System.out.print("\nQual conta será paga: ");
		infoContas = leia.next();
		System.out.print("Valor da conta de "+infoContas+": ");
		valor = leia.nextDouble();
		
		while (valor > 0)
		{
			cont++;
			valorTotal += valor;
			
			System.out.print("\nQual conta será paga: ");
			infoContas = leia.next();
			System.out.print("Valor da conta de "+infoContas+": ");
			valor = leia.nextDouble();
		}
		
		if (cont == 1)
			System.out.print("\nVocê cadastrou "+cont+" conta no valor total de R$ "+valorTotal+" reais.");
		else
			System.out.print("\nVocê cadastrou "+cont+" contas no valor total de R$ "+valorTotal+" reais.");
	}

}