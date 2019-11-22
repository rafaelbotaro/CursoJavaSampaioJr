package unidade3.Case;

import javax.swing.JOptionPane;

public class caseFormaPagamento2 {

	public static void main(String[] args) {

		double valorProduto = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do produto: R$ "));
		int codigoProduto = Integer.parseInt(JOptionPane.showInputDialog("Favor informar o tipo de pagamento: "
				+ "[1 - 10% de desconto] - [2 - 5% de desconto] - "
				+ "[3 - 2x sem juros] - [4 - 3x com juros de 5%]:"));
		
		switch (codigoProduto) 
		{
			case 1:
			{
				double valorFinal = valorProduto * 0.9;
				JOptionPane.showMessageDialog(null, "\nValor final do produto com 10% de desconto: R$ "+valorFinal+" reais.");
				break;
			}
			case 2:
			{
				double valorFinal = valorProduto * 0.95;
				JOptionPane.showMessageDialog(null, "\nValor final do produto com 5% de desconto: R$ "+valorFinal+" reais.");
				break;
			}
			case 3:
			{
				double valorFinal = valorProduto / 2;
				JOptionPane.showMessageDialog(null, "\nTotal: 2 parcelas sem juros de: R$ "+valorFinal+" reais.");
				break;
			}
			case 4:
			{
				double valorFinal = (valorProduto * 1.1) / 3;
				JOptionPane.showMessageDialog(null, "\nTotal: 3 parcelas com 5% de juros de: R$ "+valorFinal+" reais.");
				break;
			}
			default:
			{
				JOptionPane.showMessageDialog(null, "Opção digitada incorreta.");
				caseFormaPagamento2.main(null);
			}
				
		}

	}

}
