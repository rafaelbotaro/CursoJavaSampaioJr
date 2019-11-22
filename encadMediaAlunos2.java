package unidade3.IfElseIf;

import javax.swing.JOptionPane;

public class encadMediaAlunos2 {

	public static void main(String[] args) {

		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1a. nota: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2a. nota: "));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 3a. nota: "));
		double n4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 4a. nota: "));
		
		double med = (n1 + n2 + n3 + n4) / 4;
				
		if (med >= 7)
			JOptionPane.showMessageDialog(null, "MÉDIA "+med+"\n\nALUNO APROVADO\n\n");
		else
		{
			if (med >= 5)
				JOptionPane.showMessageDialog(null, "MÉDIA "+med+"\n\nALUNO EM RECUPERAÇÃO\n\n");
			else
				JOptionPane.showMessageDialog(null, "MÉDIA "+med+"\n\nALUNO REPROVADO\n\n");
		}
			
	}

}