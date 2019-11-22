package unidade2;

import javax.swing.JOptionPane;

public class revendaVeiculos2 {

	public static void main(String[] args) {

		var modelo = JOptionPane.showInputDialog("Qual é o nome do filme?");
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do veículo."));
		
		double entrada = valor / 2;
		double parcelas = entrada / 12;
		
		JOptionPane.showMessageDialog(null, "O valor da entrada do "+modelo+" é R$ "+entrada+" reais. \n\nO valor de cada uma das 12 parcelas é R$ "+parcelas+" reais.\n\n");
		
	}

}
