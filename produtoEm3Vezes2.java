package unidade2;

import javax.swing.JOptionPane;

public class produtoEm3Vezes2 {
	
	public static void main(String[] args) {
	
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto: R$ "));
		
		double avista = preco * 0.9;
		double parcela = preco / 3;
		
		JOptionPane.showMessageDialog(null, "O valor do produto é R$ "+avista+" reais a vista. Ou pode ser \ndividido em 3 parcelas de R$ "+parcela+ " reais, cada parcela.");

	}
}
