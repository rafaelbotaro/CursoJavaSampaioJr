package unidade3.If;

import javax.swing.JOptionPane;

public class ifMediaAlunos2 {
	
	public static void main(String[] args) {

		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1a. nota: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2a. nota: "));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 3a. nota: "));
		double n4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 4a. nota: "));
		
		double med = (n1 + n2 + n3 + n4) / 4;
				
		JOptionPane.showMessageDialog(null, "A média obtida pelo aluno foi "+med);
		
		if (med < 5)
			JOptionPane.showMessageDialog(null, "O aluno foi reprovado.");
	}

}
