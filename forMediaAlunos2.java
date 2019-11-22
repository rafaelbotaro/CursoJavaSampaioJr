package unidade4.For;

import javax.swing.JOptionPane;

public class forMediaAlunos2 {

	public static void main(String[] args) {
		
		int i;
		double medAlunos = 0;
		
		for (i = 1; i <= 5; i++)
		{
			double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1a. nota: "));
			double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2a. nota: "));
			double n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 3a. nota: "));
			double n4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 4a. nota: "));
			
			double med = (n1 + n2 + n3 + n4) / 4;
			medAlunos = medAlunos + med;
			
			JOptionPane.showMessageDialog(null, "A média obtida pelo aluno foi "+med);
		}
		
		medAlunos = medAlunos / i;
		JOptionPane.showMessageDialog(null, "A média geral dos 5 alunos foi "+medAlunos);
		
	}
	
}