package unidade3.Else;

import javax.swing.JOptionPane;

public class elseRaizExata2 {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		double raizExata = Math.sqrt(numero);
		double maiorValor = Math.ceil(raizExata);
		
		if (raizExata == maiorValor)
			JOptionPane.showMessageDialog(null, "A raiz exata do número "+numero+" é "+raizExata+".");
		else
			JOptionPane.showMessageDialog(null, "Não existe raiz exata para o número "+numero+".");
		
	}

}
