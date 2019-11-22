package unidade4.While;

import javax.swing.JOptionPane;

public class whileMenorMaiorMedia2 {
	
	public static void main(String[] args) {

		int cont = 0;
		double valor = 0, media = 0;
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor: "));
 
		double menor = valor;
		double maior = valor;
		
		while (valor != 0)
		{
			cont++;
			if (valor < menor)
				menor = valor;
			else if (valor > maior)
				maior = valor;
			
			media = media + valor;
			
			valor = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor ou digite 0 para sair: "));
		}
		
		media = media / cont;
		
		JOptionPane.showMessageDialog(null, "\nO menor valor digitado é: "+menor);
		JOptionPane.showMessageDialog(null, "\nO maior valor digitado é: "+maior);
		JOptionPane.showMessageDialog(null, "\nA média dos valores é: "+media);
	}
	
}