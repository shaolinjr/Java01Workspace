package ltp1;

import java.util.*;
public class Lista4Ex02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double numeroUm, numeroDois,multiplicar,somar;
		char escolhaUser;
	
		
		System.out.print("Digite um número real: ");
		numeroUm = leia.nextDouble();
		
		System.out.print("Agora digite outro número real: ");
		numeroDois = leia.nextDouble();
		
		System.out.println("O que você deseja fazer com esses números ?:");
		System.out.println("\tA) Somar os dois números");
		System.out.println("\tB) Multiplicar os dois números");
		System.out.print("Resposta: ");
		
		escolhaUser = leia.next().charAt(0);
		
		multiplicar = numeroUm * numeroDois;
		somar		= numeroUm + numeroDois;
		
		switch(escolhaUser) {
		case 'A':
			System.out.println("O resultado foi: " + somar);
			break;
		case 'B':
			System.out.println("O resultado foi: " + multiplicar);
			break;
		default:
			System.out.println("Ocorreu algum erro");
			break;
		
		}

	}

}
