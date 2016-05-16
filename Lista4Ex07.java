package ltp1;

import java.util.*;
public class Lista4Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double salarioAtual,salarioFinal;
		int codigo;
		
		System.out.print("Digite seu salário atual: ");
		salarioAtual = leia.nextDouble();
		System.out.println("Existem os seguintes cargos:");
		System.out.println("\t1) Escriturário\n \t2)Secretário\n \t3)Caixa\n \t4)Gerente\n \t5)Diretor");
		System.out.print("Escolha seu cargo:");
		codigo = leia.nextInt();
		
		switch(codigo) {
			case 1: 
				salarioFinal = salarioAtual * 1.5;
				System.out.println("Descrição do cargo: Escrituário");
				System.out.println("Percentual de aumento: 50%");
				System.out.println("Valor do salário: R$ " +  salarioFinal);
				break;
				
			case 2:
				salarioFinal = salarioAtual * 1.35;
				System.out.println("Descrição do cargo: Secretário");
				System.out.println("Percentual de aumento: 35%");
				System.out.println("Valor do salário: R$ " +  salarioFinal);
				break;
				
			case 3:
				salarioFinal = salarioAtual * 1.2;
				System.out.println("Descrição do cargo: Caixa");
				System.out.println("Percentual de aumento: 20%");
				System.out.println("Valor do salário: R$ " +  salarioFinal);
				break;
				
			case 4:
				salarioFinal = salarioAtual * 1.1;
				System.out.println("Descrição do cargo: Gerente");
				System.out.println("Percentual de aumento: 10%");
				System.out.println("Valor do salário: R$ " +  salarioFinal);
			case 5:
				salarioFinal = salarioAtual ;
				System.out.println("Descrição do cargo: Diretor");
				System.out.println("Você já ganha bem o suficiente, nada de aumento para você");
				System.out.println("Valor do salário: R$ " +  salarioFinal);
			default:
				System.out.println("Qualquer problema aconteceu");
		}
		
	}	

}
