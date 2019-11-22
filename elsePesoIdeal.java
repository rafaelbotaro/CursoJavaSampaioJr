package unidade3.Else;

import java.util.Locale;
import java.util.Scanner;

public class elsePesoIdeal {

	public static void main(String[] args) {

		double altura, pesoIdealHomem, pesoIdealMulher;
		String sexo;
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a sua altura: ");
		altura = leia.nextDouble();
		
		System.out.print("Digite H para homem ou M para mulher: ");
		sexo = leia.next();
		
		if (sexo.equalsIgnoreCase("H"))
		{
			pesoIdealHomem = (72.7 * altura) - 58;
			System.out.printf("\nSeu peso ideal é %.2f quilos.",pesoIdealHomem);
		}
		else
		{
			pesoIdealMulher = (62.1 * altura) - 44.7;
			System.out.printf("\nSeu peso ideal é %.2f quilos.",pesoIdealMulher);
		}
		
		leia.close();
		
	}

}
