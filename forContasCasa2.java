package unidade4.For;

import javax.swing.JOptionPane;

public class forContasCasa2 {
	
	public static void main(String[] args) {

		double valor = 0, valorTotal = 0;
		int i, j, cont = 0, numeroContas = 0;
		String infoContas;
		
		numeroContas = Integer.parseInt(JOptionPane.showInputDialog(null, ">>>  CONTAS A PAGAR  <<<\n\n"
				+ "Número de contas que pretende pagar: "));
		
		j = numeroContas;
		
		for ( i = 0; i < j; i++)
		{
			infoContas = JOptionPane.showInputDialog(null, "Qual conta será paga: ");
			valor = Double.parseDouble(JOptionPane.showInputDialog("Valor da conta de "+infoContas+": "));
				
			cont++;
			valorTotal += valor;
		}
		
		if (cont == 1)
			JOptionPane.showMessageDialog(null, "Você cadastrou "+cont+" conta no valor total de R$ "+valorTotal+" reais.\n\n");
		else
			JOptionPane.showMessageDialog(null, "Você cadastrou "+cont+" contas no valor total de R$ "+valorTotal+" reais.\n\n");
		
	}

}