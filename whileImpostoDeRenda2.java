package unidade4.While;

import javax.swing.JOptionPane;

public class whileImpostoDeRenda2 {

	public static void main(String[] args) {
		
		double irpf, rendaMensal, salarioLiquido, salarioFinal, inss = 0.11, descInss;
		int numeroDependentes, numeroContribuintes = 1, num;
		String nome, cpf;

		JOptionPane.showMessageDialog(null, "C�LCULO DE IMPOSTO DE RENDA");
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Por favor, digite o n�mero de contribuintes: "));
			
		while (numeroContribuintes <= num)
		{
			JOptionPane.showMessageDialog(null, numeroContribuintes+ "� CONTRIBUINTE");
			nome = JOptionPane.showInputDialog("Digite seu nome: ");
			cpf = JOptionPane.showInputDialog("Digite seu CPF: ");
			numeroDependentes = Integer.parseInt(JOptionPane.showInputDialog("N�mero de dependentes: "));
			rendaMensal = Double.parseDouble(JOptionPane.showInputDialog("Renda mensal: R$ "));
			numeroContribuintes++;
			
			salarioLiquido = rendaMensal - (numeroDependentes * 189.50) - inss * rendaMensal;
			descInss = inss * rendaMensal;
			
			if (salarioLiquido < 1903.98)
			{
				irpf = 0;
				JOptionPane.showMessageDialog(null,"A taxa do IRPF � de 0%");
			}
			else if ((salarioLiquido >= 1903.99) && (salarioLiquido <= 2826.65))
			{
				irpf = 0.075 * salarioLiquido - 142.80;
				JOptionPane.showMessageDialog(null,"A taxa do IRPF � de 7,5%");
			}
			else if ((salarioLiquido >= 2826.66) && (salarioLiquido <= 3751.05))
			{
				irpf = 0.15 * salarioLiquido - 354.80;
				JOptionPane.showMessageDialog(null,"A taxa do IRPF � de 15%");
			}
			else if ((salarioLiquido >= 3751.06) && (salarioLiquido <= 4664.68))
			{
				irpf = 0.225 * salarioLiquido - 636.13;
				JOptionPane.showMessageDialog(null,"A taxa do IRPF � de 22,5%");
			}
			else
			{
				irpf = 0.275 * salarioLiquido - 869.36;
				JOptionPane.showMessageDialog(null,"A taxa do IRPF � de 27,5%");
			}
			
			salarioFinal = salarioLiquido - irpf;
			
			JOptionPane.showMessageDialog(null,"O Contribuinte "+nome+", portador do CPF n� "+cpf+", possui "+numeroDependentes+" dependentes.");
			JOptionPane.showMessageDialog(null,"Sua renda mensal � R$ "+rendaMensal+" reais e seu sal�rio l�quido � R$ "+salarioLiquido+" reais.");
			JOptionPane.showMessageDialog(null,"Ele pagar� R$ "+irpf+" reais de IRPF e R$ "+descInss+" reais de INSS.\n");
			JOptionPane.showMessageDialog(null, nome+" receber� R$ "+salarioFinal+" reais ap�s todos os descontos.");
			
		}
		JOptionPane.showMessageDialog(null,"Fim da execuss�o do programa!");
	}

}