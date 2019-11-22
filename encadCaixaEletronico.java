package unidade3.IfElseIf;

import java.util.Scanner;

public class encadCaixaEletronico {

	public static void main(String[] args) {

		int saque;
		int resto;
		int notas100, notas50, notas10;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor que deseja sacar: ");
		saque = leia.nextInt();
		
		if (saque % 10 == 0)
		{
			notas100 = (int) Math.floor(saque / 100);
			resto = saque % 100;
			notas50 = (int) Math.floor(resto / 50);
			resto = saque % 50;
			notas10 = (int) Math.floor(resto / 10);
			
			if (notas100 > 0)
				System.out.println("Notas de 100 = "+ notas100);
			if (notas50 > 0)
				System.out.println("Notas de 50 = "+notas50);
			if (notas10 > 0)
				System.out.println("Notas de 10 = "+notas10);
		}
		else
		{
			System.out.println("O valor solicitado não está disponível.");
			encadCaixaEletronico2.main(null);
		}
		leia.close();
	}
}