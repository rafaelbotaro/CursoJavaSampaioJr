package unidade2;

import javax.swing.JOptionPane;

public class viagemEmHoras2 {

	public static void main(String[] args) {

		int semanas = Integer.parseInt((JOptionPane.showInputDialog("Informe quantas semanas ficou viajando: ")));
		int dias = Integer.parseInt((JOptionPane.showInputDialog("Informe quantos dias ficou viajando: ")));
		int horas = Integer.parseInt((JOptionPane.showInputDialog("Informe quantas horas ficou viajando: ")));
		
		int thoras = (semanas * 7 * 24) + (dias * 24) + horas;
		
		JOptionPane.showMessageDialog(null, "O tempo total que você ficou viajando foi "+thoras+" horas.");

	}

}
