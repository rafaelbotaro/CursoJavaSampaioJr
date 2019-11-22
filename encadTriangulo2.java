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
				JOptionPane.showMessageDialog(null, "Triângulo Equilátero");
			else
			{
				if ((a == b) || (a == c))
					JOptionPane.showMessageDialog(null, "Triângulo Isóceles");
				else
					JOptionPane.showMessageDialog(null, "Triângulo Escaleno");
			}
			
		}
		else
			JOptionPane.showMessageDialog(null, "Os valores não formam um triângulo.");

	}

}