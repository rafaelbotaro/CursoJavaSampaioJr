package unidade4.While;

import javax.swing.JOptionPane;

public class whileCadastroAluno2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		String nome = null, endereco = null, telefone = null;
		@SuppressWarnings("unused")
		int matricula, cont = 0;
		
		matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da matrícula: "));
		
		while (matricula != 0);
		{
			nome = JOptionPane.showInputDialog("Digite seu nome: ");
			telefone = JOptionPane.showInputDialog("Digite o seu telefone: ");
			endereco = JOptionPane.showInputDialog("Digite o seu endereço: ");
			cont++;
			matricula = Integer.parseInt(JOptionPane.showInputDialog("\nDigite a próxima matrícula: "));
		}

	}
	
}