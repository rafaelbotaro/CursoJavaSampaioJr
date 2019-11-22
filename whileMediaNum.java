package unidade4.While;

import java.util.Scanner;

public class whileMediaNum {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double num = leia.nextInt();
		System.out.println();
		
		double somaNum = 0;
		int cont = 0;		
		
		while (num != -1)
		{
			somaNum = somaNum + num;
			cont++;
			
			System.out.print("Digite um número ou -1 para sair: ");
			num = leia.nextInt();
		}
		
		System.out.println("\nA média dos números digitados é: "+somaNum / cont);
		leia.close();
	}
	
}