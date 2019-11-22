package unidade2;

import javax.swing.JOptionPane;

public class leituraEscrita2 {

	public static void main(String[] args) {

		var nome = JOptionPane.showInputDialog("Digite seu nome: ");
		JOptionPane.showInternalMessageDialog(null, "Olá, tudo bem com você "+nome+"?");

	}

}
