package unidade2;

import javax.swing.JOptionPane;

public class taxaGarcom2 {

	public static void main(String[] args) {

		final double taxaGarcom = 0.1;
		double valorJantar, valorJantarTotal, valorGarcom;
		
		valorJantar = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do jantar: R$ "));
		
		valorGarcom = taxaGarcom * valorJantar;
		valorJantarTotal = valorJantar + (taxaGarcom * valorJantar);
		
		JOptionPane.showMessageDialog(null, "O valor da taxa do garçom é R$ "+valorGarcom+" reais."
				+ "\nO valor total da sua conta é R$ "+valorJantarTotal+" reais.");

	}

}