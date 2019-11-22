package unidade4.While;

import java.util.Scanner;

public class whileImpostoDeRenda {

	public static void main(String[] args) {
		
		double irpf, rendaMensal, salarioLiquido, salarioFinal, inss = 0.11, descInss;
		int numeroDependentes, numeroContribuintes = 1, num;
		String nome, cpf;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("C�LCULO DE IMPOSTO DE RENDA\n\n");
		
		System.out.print("Por favor, digite o n�mero de contribuintes: ");
		num = leia.nextInt();
		System.out.println("\n");
		
		while (numeroContribuintes <= num)
		{
			System.out.println(numeroContribuintes+ "� CONTRIBUINTE\n");
			System.out.print("Digite seu nome: ");
			nome = leia.nextLine();
			System.out.print("Digite seu CPF: ");
			cpf = leia.nextLine();
			System.out.print("N�mero de dependentes: ");
			numeroDependentes = leia.nextInt();
			System.out.print("Renda mensal: R$ ");
			rendaMensal = leia.nextDouble();
			System.out.println();
			numeroContribuintes++;
			
			salarioLiquido = rendaMensal - (numeroDependentes * 189.50) - inss * rendaMensal;
			descInss = inss * rendaMensal;
			
			if (salarioLiquido < 1903.98)
			{
				irpf = 0;
				System.out.println("A taxa do IRPF � de 0%");
			}
			else if ((salarioLiquido >= 1903.99) && (salarioLiquido <= 2826.65))
			{
				irpf = 0.075 * salarioLiquido - 142.80;
				System.out.println("A taxa do IRPF � de 7,5%");
			}
			else if ((salarioLiquido >= 2826.66) && (salarioLiquido <= 3751.05))
			{
				irpf = 0.15 * salarioLiquido - 354.80;
				System.out.println("A taxa do IRPF � 15%");
			}
			else if ((salarioLiquido >= 3751.06) && (salarioLiquido <= 4664.68))
			{
				irpf = 0.225 * salarioLiquido - 636.13;
				System.out.println("A taxa do IRPF � 22,5%");
			}
			else
			{
				irpf = 0.275 * salarioLiquido - 869.36;
				System.out.println("A taxa do IRPF � 27,5%");
			}
			
			salarioFinal = salarioLiquido - irpf;
			
			System.out.println("O contribuinte "+nome+", portador do CPF n� "+cpf+", possui "+numeroDependentes+" dependentes.");
			System.out.println("Sua renda mensal � R$ "+rendaMensal+" reais e seu sal�rio l�quido � R$ "+salarioLiquido+" reais.");
			System.out.println("Ele pagar� R$ "+irpf+" reais de IRPF e R$ "+descInss+" reais de INSS.\n");
			System.out.println(nome+" receber� R$ "+salarioFinal+" reais ap�s todos os descontos.");
			System.out.println("\n");
			
		}
		System.out.println("Fim da execuss�o do programa!");
		leia.close();
	}

}