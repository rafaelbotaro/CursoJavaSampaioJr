package unidade4.While;

import javax.swing.JOptionPane;

public class whileContasCasa2 {

	public static void main(String[] args) {

		int cont = 0;
		String infoContas;
		double valor = 0, valorTotal = 0;
		
		JOptionPane.showMessageDialog(null, ">>>  CONTAS A PAGAR  <<<\n\nPara encerrar: '0' e 'Enter' -> 2 vezes.\n\n");
		
		infoContas = JOptionPane.showInputDialog(null, "Qual conta será paga: ");
		valor = Double.parseDouble(JOptionPane.showInputDialog("Valor da conta de "+infoContas+": "));
		
		while (valor > 0)
		{
			cont++;
			valorTotal += valor;
			infoContas = JOptionPane.showInputDialog(null, "Qual conta será paga: ");
			valor = Double.parseDouble(JOptionPane.showInputDialog("Valor da conta de "+infoContas+": "));
		}
		
		if (cont == 1)
			JOptionPane.showMessageDialog(null, "Você cadastrou "+cont+" conta no valor total de R$ "+valorTotal+" reais.\n\n");
		else
			JOptionPane.showMessageDialog(null, "Você cadastrou "+cont+" contas no valor total de R$ "+valorTotal+" reais.\n\n");

	}

}