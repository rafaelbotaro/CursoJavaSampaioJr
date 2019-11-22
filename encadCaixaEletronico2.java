package unidade3.IfElseIf;

import javax.swing.JOptionPane;

public class encadCaixaEletronico2 {

	public static void main(String[] args) {

		int saque = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja sacar:"));
		
		if (saque % 10 == 0)
		{
			int notas100 = (int) Math.floor(saque / 100);
			int resto = saque % 100;
			int notas50 = (int) Math.floor(resto / 50);
			resto = saque % 50;
			int notas10 = (int) Math.floor(resto / 10);
			
			if (notas100 > 0)
				JOptionPane.showMessageDialog(null, "Notas de 100 = "+ notas100);
			if (notas50 > 0)
				JOptionPane.showMessageDialog(null, "Notas de 50 = "+notas50);
			if (notas10 > 0)
				JOptionPane.showMessageDialog(null, "Notas de 10 = "+notas10);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "O valor solicitado não está disponível.");
			encadCaixaEletronico2.main(null);
		}
	}
}
