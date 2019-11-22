package unidade3.Else;

import javax.swing.JOptionPane;

public class elsePesoIdeal2 {

	public static void main(String[] args) {

		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
		String sexo = JOptionPane.showInputDialog("Digite H para homem ou M para mulher: ");
		
		if (sexo.equalsIgnoreCase("H"))
		{
			double pesoIdealHomem = (72.7 * altura) - 58;
			JOptionPane.showMessageDialog(null, "\nSeu peso ideal é "+pesoIdealHomem+" quilos.");
		}
		else
		{
			double pesoIdealMulher = (62.1 * altura) - 44.7;
			JOptionPane.showMessageDialog(null, "\nSeu peso ideal é "+pesoIdealMulher+" quilos.");
		}

	}

}
