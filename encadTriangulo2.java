package unidade3.IfElseIf;

import javax.swing.JOptionPane;

public class encadTriangulo2 {

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de A:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de B:"));
		int c = Integer.parseInt(JOptionPane.showInputDialog(null,  "Valor de C"));
		
		if ((a < b + c) && (b < a + c) && (c < a + b))
		{
			if ((a == b) && (b == c))
				JOptionPane.showMessageDialog(null, "Tri�ngulo Equil�tero");
			else
			{
				if ((a == b) || (a == c))
					JOptionPane.showMessageDialog(null, "Tri�ngulo Is�celes");
				else
					JOptionPane.showMessageDialog(null, "Tri�ngulo Escaleno");
			}
			
		}
		else
			JOptionPane.showMessageDialog(null, "Os valores n�o formam um tri�ngulo.");

	}

}