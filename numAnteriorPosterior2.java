package unidade2;

import javax.swing.JOptionPane;

public class numAnteriorPosterior2 {

	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero qualquer: "));
		
		int anterior = num - 1;
		int posterior = num + 1;
		
		JOptionPane.showMessageDialog(null, "N�mero digitado: "+num+"\nN�mero anterior: "+anterior+"\nN�mero posterior: "+posterior);
		
	}

}
