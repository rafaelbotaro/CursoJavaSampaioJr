package unidade2;

import javax.swing.JOptionPane;

public class valorLanHouse2 {

	public static void main(String[] args) {

		double horas = Double.parseDouble(JOptionPane.showInputDialog("Quantas horas voc� usou o computador?"));
		double minutos = Double.parseDouble(JOptionPane.showInputDialog("Quantos minutos voc� usou o computador?"));
		
		double tempoUso = horas * 60 + minutos;
		double totalPagar = Math.ceil(tempoUso / 15) * 2;
		
		JOptionPane.showMessageDialog(null, "\nVoc� usou o computador por "+tempoUso+" minutos e o total a pagar � R$ "+totalPagar+" reais.\n\n");
		
	}

}
