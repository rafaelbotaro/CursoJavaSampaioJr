package unidade3.Else;

import javax.swing.JOptionPane;

public class elseEquacao2Grau2 {

	public static void main(String[] args) {

		int a = Integer.parseInt(JOptionPane.showInputDialog("Valor de A: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Valor de B: "));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Valor de C: "));
		
		double delta = b * b - 4 * a * c;
		
		if (delta >= 0)
		{
			double x1 = -b - (Math.sqrt(delta)) / 2 * a;
			double x2 = -b + (Math.sqrt(delta)) / 2 * a;
			JOptionPane.showMessageDialog(null, "Valor de x1: "+x1+"\nValor de x2: "+x2);
		}
		else
			JOptionPane.showMessageDialog(null, "Não existem raízes reais.");
	}

}
