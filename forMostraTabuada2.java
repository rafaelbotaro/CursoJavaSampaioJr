package unidade4.For;

import javax.swing.JOptionPane;

public class forMostraTabuada2 {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero para calcular tabuada: "));
		
		for (int i = 0; i <= 10; i++)
		{
			int total = numero * i;
			JOptionPane.showInternalMessageDialog(null, "N�mero: "+numero+" x "+i+" = "+total);
		}

	}

}