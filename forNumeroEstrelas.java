package unidade4.For;

import java.util.Scanner;

public class forNumeroEstrelas {

	public static void main(String[] args) {

		int i, numeroLinhas;
		String estrela = "*";
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número de linhas: ");
		numeroLinhas = leia.nextInt();
		System.out.println("\n");
		
		for (i = 0; i < numeroLinhas; i++)
		{
			System.out.println(estrela);
			estrela = estrela + "*";
		}
		
		leia.close();
	} 

}