package unidade3.Case;

import javax.swing.JOptionPane;

public class caseCambioMoedas2 {

	public static void main(String[] args) {

		double valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja fazer a conversão: R$ "));
		int moeda = Integer.parseInt(JOptionPane.showInputDialog("Digite: [1 Libra] - [2 Dólar] - [3 Euro] - [4 Peso]: "));
		
		switch (moeda) 
		{
			case 1:
			{
				double conversao = valor / 5;
				JOptionPane.showMessageDialog(null, "\nO valor convertido é: "+conversao+" Libras.");
				break;
			}
			case 2:
			{
				double conversao = valor / 4;
				JOptionPane.showMessageDialog(null, "\nO Valor convertido é: "+conversao+" Dólares.");
				break;
			}
			case 3:
			{
				double conversao = valor / 4.4;
				JOptionPane.showMessageDialog(null, "\nO valor convertido é: "+conversao+" Euros.");
				break;
			}
			case 4:
			{
				double conversao = valor * 8.8;
				JOptionPane.showMessageDialog(null, "\nO valor convertido é: "+conversao+" Pesos.");
				break;
			}
			default:
				JOptionPane.showMessageDialog(null, "Opção digitada incorreta.");
		}

	}

}