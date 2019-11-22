package unidade2;

import javax.swing.JOptionPane;

public class tempoFilmeLocadora2 {

	public static void main(String[] args) {

		var filme = JOptionPane.showInputDialog("Qual é o nome do filme?");
		
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas têm o filme?"));
		int minutos = Integer.parseInt(JOptionPane.showInputDialog("Quantos minutos têm o filme?"));
		
		int total = horas * 60 + minutos;
		
		JOptionPane.showMessageDialog(null, "O filme "+filme+" tem a duração de "+total+" minutos.");		

	}

}
