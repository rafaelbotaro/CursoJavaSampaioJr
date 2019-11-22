package unidade3.IfElseIf;

import javax.swing.JOptionPane;

public class encadCategoriaNadador2 {

	public static void main(String[] args) {

		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do nadador: "));

		if (idade > 18)
			JOptionPane.showMessageDialog(null, "\nADULTO");
		else if (idade >= 14)
			JOptionPane.showMessageDialog(null, "\nJUVENIL B");
		else if (idade >= 12)
			JOptionPane.showMessageDialog(null, "\nJUVENIL A");
		else if (idade >= 9)
			JOptionPane.showMessageDialog(null, "\nINFANTIL C");
		else if (idade >= 6)
			JOptionPane.showMessageDialog(null, "\nINFANTIL B");
		else
			JOptionPane.showMessageDialog(null, "\nINFANTIL C");

	}

}