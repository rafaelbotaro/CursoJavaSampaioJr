package unidade4.For;

import javax.swing.JOptionPane;

public class forNumMenorMaior2 {

	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

		int maior = num;
		int menor = num;

		for (int i = 2; i <= 10; i++) 
		{
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

			if (num < menor)
				menor = num;
			else if (num > maior)
				maior = num;
		}
		
		JOptionPane.showMessageDialog(null, "\nMaior: "+maior+"\nMenor: "+menor);
		
	}

}