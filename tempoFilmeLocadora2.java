package unidade2;

import javax.swing.JOptionPane;

public class tempoFilmeLocadora2 {

	public static void main(String[] args) {

		var filme = JOptionPane.showInputDialog("Qual � o nome do filme?");
		
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Quantas horas t�m o filme?"));
		int minutos = Integer.parseInt(JOptionPane.showInputDialog("Quantos minutos t�m o filme?"));
		
		int total = horas * 60 + minutos;
		
		JOptionPane.showMessageDialog(null, "O filme "+filme+" tem a dura��o de "+total+" minutos.");		

	}

}
