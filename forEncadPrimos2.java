package unidade4.For;

import javax.swing.JOptionPane;

public class forEncadPrimos2 {
	
	public static void main(String[] args) {

		int i, numero, numeroDivisores = 0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero para saber se � Primo: "));
		
		for (i = 1; i <= numero; i++)
		{
			if (numero % i == 0)
				numeroDivisores++;
		}
		
		if (numeroDivisores == 2)
			JOptionPane.showMessageDialog(null, "\nO n�mero "+numero+" � Primo.\n\nFim da execu��o.");
		else
			JOptionPane.showMessageDialog(null, "\nO n�mero "+numero+" n�o � Primo.\n\nFim da execu��o.");		
	}

}