package unidade2;

import javax.swing.JOptionPane;

public class dividirContaJantar2 {

	public static void main(String[] args) {

		double conta = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total da conta: R$ "));
		int clientes = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas v�o dividir a conta: "));
		
		double valorCliente = conta / clientes;
		
		JOptionPane.showMessageDialog(null, "O valor que cada cliente ir� pagar � R$ "+valorCliente+" reais.");
		
	}

}
