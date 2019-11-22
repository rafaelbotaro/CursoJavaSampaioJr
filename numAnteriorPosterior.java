package unidade2;

import java.util.Scanner;

public class numAnteriorPosterior {

	public static void main(String[] args) {

		int num, anum, pnum;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um número qualquer: ");
		num = leia.nextInt();
		System.out.println();
		
		anum = num - 1;
		pnum = num + 1;
		
		System.out.println("Número digitado: "+num);
		System.out.println("Número anterior: "+anum);
		System.out.println("Número posterior: "+pnum);
		leia.close();
	}

}
