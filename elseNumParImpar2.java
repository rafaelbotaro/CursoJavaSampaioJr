package unidade3.Else;

import javax.swing.JOptionPane;

public class elseNumParImpar2 {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

		if (numero % 2 == 0)
			JOptionPane.showMessageDialog(null, "O número "+numero+" é par.");
		else
			JOptionPane.showMessageDialog(null, "O número "+numero+" é ímpar.");
	}

}