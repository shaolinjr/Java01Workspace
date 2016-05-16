package ltp1;
import java.util.*;

public class Lista05Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		char escolhaUser;
		
		double numeroUm, numeroDois,numero;
		
		int contador = 0;
		do {

		System.out.println("Você pode realizar as seguintes ações: ");
		System.out.println("\t	a) Multiplicar dois numeros" 
						+"\n\t	b) Dividir dois numeros"
						+"\n\t	c) Somar dois numeros "
						+"\n\t 	d) Raiz quadrada de um numero "
						+"\n\t	e) Sair");
		System.out.print("Digite sua escolha: ");
		escolhaUser = leia.next().charAt(0);
		
		switch(escolhaUser){
		
		case 'a':
			
				System.out.print("Digite o numero : ");
				numeroUm = leia.nextDouble();
				System.out.print("Digite o segundo numero: ");
				numeroDois = leia.nextDouble();
				System.out.println("O resultado é: " + numeroUm * numeroDois + "\n");
				break;
				
		case 'b':
			System.out.print("Digite o numero : ");
			numeroUm = leia.nextDouble();
			do {
				System.out.print("Digite o segundo numero : ");
				numeroDois = leia.nextDouble();
				
				if (numeroDois <= 0){
					System.out.println("Não é possível dividir por esse número");
				}
			}while(numeroDois <= 0);
			System.out.println("Resultado: "+ numeroUm / numeroDois + "\n");
			break;
				
		case 'c':
			System.out.print("Digite o primeiro numero: ");
			numeroUm = leia.nextDouble();
			System.out.print("Digite o segundo numero: ");
			numeroDois = leia.nextDouble();
			System.out.println("A soma dos numeros é: " + (numeroUm + numeroDois)+ "\n");
			break;
		
		case 'd':
			do {
			System.out.print("Digite o numero: ");
			numeroUm = leia.nextDouble();
			
			if (numeroUm < 0){
				System.out.println("Não é possível calcular raiz quadrada de número negativo");
			}
			
			}while(numeroUm < 0);
			System.out.println("A raiz do numero é: " + Math.sqrt(numeroUm)+ "\n");
			break;
			
		case 'e':
			System.out.println("Saindo do programa..");
			break;
			
		}
		}while(escolhaUser != 'e');
		
	
	}

}

/*
 * Menu de opções:
	a. Multiplicar dois números
	b. Dividir dois números (lembrando que não existe divisão por zero).
	c. Somar dois números
	d. Raiz quadrada de um número. (Lembre-se que não é possível calculara raiz quadrada de um número negativo).
	e. Sair
Observe que o programa só será finalizado após a digitação da letra E

 * */
