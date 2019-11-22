package unidade3.IfElseIf;

import javax.swing.JOptionPane;

public class encadNotaConceito2 {

	public static void main(String[] args) {

		int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite uma nota de 0 a 100: "));

		if ((nota >= 0) && (nota <= 100)) 
		{
			if (nota >= 90)
				JOptionPane.showMessageDialog(null, "NOTA EXCELENTE");
			else if (nota >= 70)
				JOptionPane.showMessageDialog(null, "NOTA BOM");
			else if (nota >= 50)
				JOptionPane.showMessageDialog(null, "NOTA REGULAR");
			else
				JOptionPane.showMessageDialog(null, "NOTA INSUFICIENTE");
		} 
		else 
		{
			JOptionPane.showMessageDialog(null, "Nota inválida. Tente novamente!");
			encadNotaConceito2.main(null);
		}
	}

}
