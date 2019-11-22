package unidade2;

import javax.swing.JOptionPane;

public class escreveVariavel2 {

	public static void main(String[] args) {

		double valor = 3.50;
		
		String fruta = JOptionPane.showInputDialog("Digite a fruta: ");
		JOptionPane.showMessageDialog(null, "O valor da "+fruta+" é R$ "+valor);

	}

}
