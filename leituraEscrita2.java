package unidade2;

import javax.swing.JOptionPane;

public class leituraEscrita2 {

	public static void main(String[] args) {

		var nome = JOptionPane.showInputDialog("Digite seu nome: ");
		JOptionPane.showInternalMessageDialog(null, "Ol�, tudo bem com voc� "+nome+"?");

	}

}
