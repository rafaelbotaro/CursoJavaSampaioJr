package unidade2;

import java.util.Scanner;

public class leituraEscrita {

	public static void main(String[] args) {

		String nome;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o seu primeiro nome: ");
		nome = leia.next();
		
		System.out.println("\nOlá, tudo bem com você "+nome+"?");
		leia.close();

	}

}
