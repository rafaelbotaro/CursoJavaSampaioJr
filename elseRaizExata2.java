package unidade3.Else;

import javax.swing.JOptionPane;

public class elseRaizExata2 {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		
		double raizExata = Math.sqrt(numero);
		double maiorValor = Math.ceil(raizExata);
		
		if (raizExata == maiorValor)
			JOptionPane.showMessageDialog(null, "A raiz exata do n�mero "+numero+" � "+raizExata+".");
		else
			JOptionPane.showMessageDialog(null, "N�o existe raiz exata para o n�mero "+numero+".");
		
	}

}
