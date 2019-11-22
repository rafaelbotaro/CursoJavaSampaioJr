package unidade4.While;

import javax.swing.JOptionPane;

public class whileMediaNum2 {

	public static void main(String[] args) {

		double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
		
		double somaNum = 0;
		int cont = 0;
		
		while (num != -1)
		{
			somaNum = somaNum + num;
			cont++;
			
			num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número ou -1 para sair: "));
		}
		
		JOptionPane.showMessageDialog(null, "\nA média dos números digitados é: "+ somaNum / cont);
	}

}