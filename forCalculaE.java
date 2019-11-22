package unidade4.For;

import java.util.Scanner;

public class forCalculaE {

	public static void main(String[] args) {
		
		int i;
		double x, e = 0;
				
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor de X: ");
		x = leia.nextDouble();
		System.out.println();
		
		for (i = 1; i <= 50; i++)
			e = e + Math.pow(x, i) / i;
		System.out.println("O valor de E elevado a "+x+" é: "+e);
		
		leia.close();

	}

}