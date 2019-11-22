package unidade4.For;

import javax.swing.JOptionPane;

public class forFatorial2 {

	public static void main(String[] args) {

		long fatorial = 1;

		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular seu fatorial: "));
		int num2 = num;
		
		for (int i = 0; i <= num*2; i++)
		{
			fatorial = fatorial * num;
			num--;			
		}
		JOptionPane.showMessageDialog(null, "\nO fatorial de "+num2+" é "+fatorial);
	}

}