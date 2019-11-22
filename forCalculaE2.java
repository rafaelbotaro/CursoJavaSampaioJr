package unidade4.For;

import javax.swing.JOptionPane;

public class forCalculaE2 {

	public static void main(String[] args) {
		 
		int i;
		double x, e = 0;

		x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de X: "));
		
		for (i = 1; i <= 50; i++)
			e = e + Math.pow(x, i) / i;
		JOptionPane.showMessageDialog(null, "O valor de E elevado a "+x+" é: "+e);
	}

}