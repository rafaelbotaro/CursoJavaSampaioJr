package unidade4.For;

import javax.swing.JOptionPane;

public class forNumerosImpares2 {

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		
		for (int i = a; i < b; i++)
		{
			if (i % 2 != 0)
				JOptionPane.showMessageDialog(null, "O n�mero "+i+" � �mpar.");
		}

	}

}