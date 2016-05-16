package ltp1;

import java.util.*;
public class Lista4Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// FIXME Bug de verficacao de char
		
		Scanner leia = new Scanner(System.in);
		
		double salario, salarioFinal;
		char sexo;
		int ajudaCusto = 150;
		
		System.out.println("Você está no sistema da TESTANDO.COM");
		System.out.print("Digite seu salário(somente números): ");
		salario = leia.nextDouble();
		if (salario < 0){
			System.out.println("Valor deve ser positivo");
		}
		else {
			System.out.print("Digite seu sexo(M/F): ");
			sexo = leia.next().charAt(0);
			
			if (sexo == 'F' || sexo == 'M') {
				
				if (salario <= 1500){
					if(sexo == 'F'){
						salarioFinal = (salario * 1.10) + ajudaCusto;
						System.out.println("Seu novo salário é de: R$ "+salarioFinal);
					}
					else {
						salarioFinal = salario * 1.10;
						System.out.println("Seu novo salário é de: R$ "+salarioFinal);
					}	
				}
				
				else if (1500 < salario && salario <= 5000){
					if(sexo == 'F'){
						salarioFinal = (salario * 1.15) + ajudaCusto;
						System.out.println("Seu novo salário é de: R$ "+salarioFinal);
					}
					else {
						salarioFinal = salario * 1.10;
						System.out.println("Seu novo salário é de: R$ "+salarioFinal);
					}
				}
				else if (salario > 5000){
					if(sexo == 'F'){
						salarioFinal = salario + ajudaCusto;
						System.out.println("Seu novo salário é de: R$ "+salarioFinal);
					}
					else {
						salarioFinal = salario;
						System.out.println("Não receberá aumento, seu salário é: R$ " + salarioFinal);
					}
				}
			}
			else {
				System.out.println("Valor deve ser F para feminino ou M para masculino");
			}
		}
	}
	
}
