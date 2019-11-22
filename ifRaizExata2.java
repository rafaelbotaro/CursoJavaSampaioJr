package unidade3.If;

import javax.swing.JOptionPane;

public class ifRaizExata2 {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		double raizExata = Math.sqrt(numero);
		double maiorValor = Math.ceil(raizExata);
		
		if (raizExata == maiorValor)
			JOptionPane.showMessageDialog(null, "Existe raiz exata de "+numero+".");
		
	}

}
