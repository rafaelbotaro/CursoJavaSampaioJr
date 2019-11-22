package unidade2;

import javax.swing.JOptionPane;

public class calculaDobro2 {

	public static void main(String[] args) {

		var numero = JOptionPane.showInputDialog("Digite um número	: ");
		var dobro = Double.parseDouble(numero) * 2;
		JOptionPane.showInternalMessageDialog(null, "O Dobro de "+numero+" é "+dobro);
		
	}

}
