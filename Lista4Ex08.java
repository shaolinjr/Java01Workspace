package ltp1;

import java.util.*;
public class Lista4Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double saldoMedio, credito;
		
		System.out.print("Digite seu saldo medio: ");
		saldoMedio = leia.nextDouble();

		if (saldoMedio > 400 ){
		 credito = saldoMedio *0.3;
		 System.out.println("Seu valor de credito é de: " + credito);
		}
		else if (saldoMedio <= 400 && saldoMedio > 300){
			credito = saldoMedio * 0.25;
			System.out.println("Seu valor de credito é de: " + credito);
		}
		else if (saldoMedio <=300 && saldoMedio > 200){
			credito = saldoMedio * 0.20;
			System.out.println("Seu valor de credito é de: " + credito);
		}
		else if (saldoMedio <= 200) {
		 credito = saldoMedio *0.1;
		 System.out.println("Seu valor de credito é de: " + credito);
		}
	}

}
