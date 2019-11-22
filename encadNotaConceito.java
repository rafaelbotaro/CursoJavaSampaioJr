package unidade3.IfElseIf;

import java.util.Scanner;

public class encadNotaConceito {

	public static void main(String[] args) {

		int nota;

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite uma nota de 0 a 100: ");
		nota = leia.nextInt();

		if ((nota >= 0) && (nota <= 100)) 
		{
			if (nota >= 90)
				System.out.println("\nNOTA EXCELENTE");
			else if (nota >= 70)
				System.out.println("\nNOTA BOM");
			else if (nota >= 50)
				System.out.println("\nNOTA REGULAR");
			else
				System.out.println("\nNOTA INSUFICIENTE");
		} 
		else
		{
			System.out.println("Nota Inválida. Tente Novamente!\n\n");
			encadNotaConceito.main(null);
		}

		leia.close();

	}

}
