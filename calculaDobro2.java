package unidade2;

import javax.swing.JOptionPane;

public class calculaDobro2 {

	public static void main(String[] args) {

		var numero = JOptionPane.showInputDialog("Digite um n�mero	: ");
		var dobro = Double.parseDouble(numero) * 2;
		JOptionPane.showInternalMessageDialog(null, "O Dobro de "+numero+" � "+dobro);
		
	}

}
