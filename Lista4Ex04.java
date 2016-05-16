package ltp1;

import java.util.*;
public class Lista4Ex04 {

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
		
		if ((numeroUm + numeroDois) >= numeroTres || (numeroTres + numeroDois) >= numeroUm || (numeroTres + numeroUm) >= numeroDois) {
			
		}
		else {
			System.out.println("Erro, a soma de dois lados de um triângulo tem que ser maior que seu terceiro lado");
		}
		
		/* if (numeroUm != numeroDois && numeroUm != numeroTres && numeroDois != numeroTres){
	    	System.out.println("Este é um triangulo escaleno");
	    	}
	    	else if (numeroUm != numeroDois){
	    	
	    	}
	    	
	    
	    */ 
			
		
	}

}
