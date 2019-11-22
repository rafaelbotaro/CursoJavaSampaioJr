package unidade4.While;

import javax.swing.*;

public class whileMenorMaiorValor2 {

	public static void main(String[] args) {

		int valor = 0;
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
 
		int menor = valor;
		int maior = valor;
		
		while (valor != 0)
		{
			if (valor < menor)
				menor = valor;
			else if (valor > maior)
				maior = valor;
			
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor ou digite 0 para sair: "));
		}
		JOptionPane.showMessageDialog(null, "\nO menor valor digitado é: "+menor);
		JOptionPane.showMessageDialog(null, "\nO maior valor digitado é: "+maior);
	}

}
