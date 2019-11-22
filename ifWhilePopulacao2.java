package unidade4.While;

import java.util.Locale;

import javax.swing.JOptionPane;

public class ifWhilePopulacao2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		int tempo = 0;
		
		JOptionPane.showMessageDialog(null, "INSTRUÇÃO:\n\n1.o país: o menos populoso com maior taxa de crescimento."
				+ "\n2.o país: o mais populoso com menor taxa de crescimento.\n\n\n");
		
		String paisA = JOptionPane.showInputDialog("Nome do 1.o país");
		double populacaoA = Double.parseDouble(JOptionPane.showInputDialog("População da(o) "+paisA+": "));
		double taxaA = Double.parseDouble(JOptionPane.showInputDialog("Taxa de crescimento da(o) "+paisA+": "));
		
		String paisB = JOptionPane.showInputDialog("\nNome do 2.o país");
		double populacaoB = Double.parseDouble(JOptionPane.showInputDialog("População da(o) "+paisB+": "));
		double taxaB = Double.parseDouble(JOptionPane.showInputDialog("Taxa de crescimento da(o) "+paisB+": "));

		if (populacaoB > populacaoA)
		{
			while (populacaoB >= populacaoA) {
				populacaoA += taxaA * populacaoA;
				populacaoB += taxaB * populacaoB;
				tempo++;
			}
		} else
		{
			while (populacaoA >= populacaoB) {
				populacaoA += taxaA * populacaoA;
				populacaoB += taxaB * populacaoB;
				tempo++;
			}
		}
		
		double populacaoFinalA = populacaoA;
		double populacaoFinalB = populacaoB;
		
		if (populacaoFinalA > populacaoFinalB)
			JOptionPane.showMessageDialog(null, "\nSerão necessários "+tempo+" anos para a população\nda(o) "
					+paisA+" ultrapassar a da(o) "+paisB+".");
		else
			JOptionPane.showMessageDialog(null, "\nSerão necessários "+tempo+" anos para a população\nda(o) "
					+paisB+" ultrapassar a da(o) "+paisA+".");
	}

}