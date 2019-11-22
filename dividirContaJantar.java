package unidade2;

import java.util.Locale;
import java.util.Scanner;

public class dividirContaJantar {
	
	public static void main(String[] args) {
		
		double conta, cadaCliente;
		int clientes;
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Valor total da conta: R$ ");
		conta = leia.nextDouble();
		
		System.out.print("Número de clientes que vão dividir: ");
		clientes = leia.nextInt();
		System.out.println();
		
		cadaCliente = conta / clientes;
		
		System.out.printf("O valor que cada cliente irá pagar é: R$ %.2f reais", cadaCliente);
		leia.close();
		
	}

}
