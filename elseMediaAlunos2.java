package unidade3.Else;

import javax.swing.JOptionPane;

public class elseMediaAlunos2 {

	public static void main(String[] args) {
		
		final int aulas = 100;

		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1a. nota: "));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2a. nota: "));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 3a. nota: "));
		double n4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 4a. nota: "));
		int faltas = Integer.parseInt(JOptionPane.showInputDialog("Informe as faltas: "));
		
		double med = (n1 + n2 + n3 + n4) / 4;
				
		JOptionPane.showMessageDialog(null, "A média obtida pelo aluno foi "+med);
		JOptionPane.showMessageDialog(null, "O aluno teve "+faltas+" faltas de 25 permitidas.");
		
		if ((med < 5) || (faltas > aulas * 0.25))
			JOptionPane.showMessageDialog(null, "O aluno foi REPROVADO.");
		else
			JOptionPane.showMessageDialog(null, "O aluno foi APROVADO.");
	}

}
