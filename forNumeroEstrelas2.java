package unidade4.For;

import javax.swing.JOptionPane;

public class forNumeroEstrelas2 {

	public static void main(String[] args) {

		String estrela = "*";

		int numeroLinhas = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de linhas: "));
			
		for (int i = 1; i < numeroLinhas; i++)
		{
			JOptionPane.showInputDialog(estrela = estrela + "*");
		}
		
	}
	
}