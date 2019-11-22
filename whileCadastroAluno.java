package unidade4.While;

import java.util.Scanner;

public class whileCadastroAluno {

	public static void main(String[] args) {

		String nome = null, endereco = null, telefone = null;
		@SuppressWarnings("unused")
		int matricula, cont = 0;

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o número da matrícula: ");
		matricula = leia.nextInt();
		
		cont = 0;

		while (matricula != 0) 
		{
			System.out.print("Digite seu nome: ");
			nome = leia.next();
			System.out.print("Digite seu endereço: ");
			endereco = leia.next();
			System.out.print("Digite seu telefone: ");
			telefone = leia.next();
			cont++;
			System.out.print("\nDigite a próxima matrícula: ");
			matricula = leia.nextInt();
		}
		System.out.print("\nNome: "+nome+".\nEndereço: "+endereco+".\nTelefone: "+telefone);
		leia.close();
	}

}