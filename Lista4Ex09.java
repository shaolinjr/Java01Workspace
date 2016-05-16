package ltp1;

import java.util.*;
public class Lista4Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double salarioInicial, salarioFinal, bonificacao, auxilioEscola;

		System.out.print("Digite seu salário atual: ");
		salarioInicial = leia.nextDouble();

		if (salarioInicial <= 500) {
			auxilioEscola = 150;
			bonificacao 	= salarioInicial * 0.05;
			salarioFinal 	= auxilioEscola + bonificacao + salarioInicial;
			System.out.print("Seu novo salário é de: R$ " + salarioFinal);
		}
		else if (salarioInicial >= 500 && salarioInicial <= 1200) {
			if (salarioInicial > 600) {
				auxilioEscola = 100;
			}
			else {
				auxilioEscola = 150;
			}
			bonificacao 	= salarioInicial * 0.12;
			salarioFinal 	= auxilioEscola + bonificacao + salarioInicial;
			System.out.print("Seu novo salário é de: R$ " + salarioFinal);
		}
		else {
			auxilioEscola 	= 100;
			salarioFinal 	= auxilioEscola + salarioInicial;

			System.out.print("Seu novo salário é de: R$ " + salarioFinal);
		}
	}

}
