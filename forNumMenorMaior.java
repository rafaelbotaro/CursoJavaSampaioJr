package unidade4.For;

import java.util.Scanner;

public class forNumMenorMaior {

	public static void main(String[] args) {
		
		int i, num, maior, menor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		num = leia.nextInt();
		
		maior = num;
		menor = num;
		
		for (i = 2; i <= 10; i++)
		{
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			
			if (num < menor)
				menor = num;
			else if (num > maior)
				maior = num;
		}
		
		System.out.println("\n\nMaior: "+maior+"\nMenor: "+menor);
		leia.close();
		
	}

}