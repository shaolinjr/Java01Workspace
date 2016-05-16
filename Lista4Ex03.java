package ltp1;

import java.util.*;
public class Lista4Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double numeroUm, numeroDois, numeroTres;
		
		System.out.println("Você vai digitar três número distintos");
		System.out.print("Digite o primeiro: ");
		numeroUm 	= leia.nextDouble();
		System.out.print("Digite o segundo: ");
		numeroDois 	= leia.nextDouble();
		System.out.print("Digite o terceiro: ");
		numeroTres 	= leia.nextDouble();
		
		if (numeroUm > numeroDois && numeroUm > numeroTres) {
			System.out.println("O número "+ numeroUm + " é o maior." );
		}
		else if (numeroDois > numeroTres) {
			System.out.println("O número "+ numeroDois + " é o maior." );
	
		}
		else {
			System.out.println("O número "+ numeroTres + " é o maior." );
		}
		
	}

}
