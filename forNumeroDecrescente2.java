package unidade4.For;

import javax.swing.JOptionPane;

public class forNumeroDecrescente2 {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		for (int i = numero; i >= 1; i--)
			JOptionPane.showMessageDialog(null, "Número: "+i);
		
	}
	
}