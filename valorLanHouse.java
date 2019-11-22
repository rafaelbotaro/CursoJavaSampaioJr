package unidade2;

import java.util.Locale;
import java.util.Scanner;

public class valorLanHouse {

	public static void main(String[] args) {

		double horas, minutos, tempoUso, valor = 2, totalPagar;
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Por quantas horas utilizou o computador: ");
		horas = leia.nextDouble();
		
		System.out.print("Por quantos minutos utilizou o computador: ");
		minutos = leia.nextDouble();
		System.out.println();
		
		tempoUso = horas * 60 + minutos;
		totalPagar = Math.ceil(tempoUso / 15) * valor;
		
		System.out.printf("Você utilizou o computador por %.1f minutos.",tempoUso);
		System.out.printf("\nO valor total a pagar é: R$ %.2f reais.", totalPagar);
		leia.close();

	}

}
