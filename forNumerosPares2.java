package unidade4.For;

import javax.swing.JOptionPane;

public class forNumerosPares2 {

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		for (int i = a; i < b; i++)
		{
			if (i % 2 == 0)
				JOptionPane.showMessageDialog(null, "O número "+i+" é par.");
		}
		
	}
	
}