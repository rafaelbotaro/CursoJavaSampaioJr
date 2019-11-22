package unidade4.While;

import javax.swing.JOptionPane;

public class whileFatorial2 {

	public static void main(String[] args) {
		
		long fatorial = 1;

		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular seu fatorial: "));
		int num2 = num;
		
		while (num >= 1)
		{
			fatorial = fatorial * num;
			num--;			
		}
		JOptionPane.showMessageDialog(null, "\nO fatorial de "+num2+" é "+fatorial);
	}

}