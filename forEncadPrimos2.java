package unidade4.For;

import javax.swing.JOptionPane;

public class forEncadPrimos2 {
	
	public static void main(String[] args) {

		int i, numero, numeroDivisores = 0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para saber se é Primo: "));
		
		for (i = 1; i <= numero; i++)
		{
			if (numero % i == 0)
				numeroDivisores++;
		}
		
		if (numeroDivisores == 2)
			JOptionPane.showMessageDialog(null, "\nO número "+numero+" é Primo.\n\nFim da execução.");
		else
			JOptionPane.showMessageDialog(null, "\nO número "+numero+" não é Primo.\n\nFim da execução.");		
	}

}