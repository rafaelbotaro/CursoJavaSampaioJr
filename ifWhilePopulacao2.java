package unidade4.While;

import java.util.Locale;

import javax.swing.JOptionPane;

public class ifWhilePopulacao2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		int tempo = 0;
		
		JOptionPane.showMessageDialog(null, "INSTRU��O:\n\n1.o pa�s: o menos populoso com maior taxa de crescimento."
				+ "\n2.o pa�s: o mais populoso com menor taxa de crescimento.\n\n\n");
		
		String paisA = JOptionPane.showInputDialog("Nome do 1.o pa�s");
		double populacaoA = Double.parseDouble(JOptionPane.showInputDialog("Popula��o da(o) "+paisA+": "));
		double taxaA = Double.parseDouble(JOptionPane.showInputDialog("Taxa de crescimento da(o) "+paisA+": "));
		
		String paisB = JOptionPane.showInputDialog("\nNome do 2.o pa�s");
		double populacaoB = Double.parseDouble(JOptionPane.showInputDialog("Popula��o da(o) "+paisB+": "));
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
			JOptionPane.showMessageDialog(null, "\nSer�o necess�rios "+tempo+" anos para a popula��o\nda(o) "
					+paisA+" ultrapassar a da(o) "+paisB+".");
		else
			JOptionPane.showMessageDialog(null, "\nSer�o necess�rios "+tempo+" anos para a popula��o\nda(o) "
					+paisB+" ultrapassar a da(o) "+paisA+".");
	}

}