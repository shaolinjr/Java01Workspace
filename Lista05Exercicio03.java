package ltp1;
import java.util.*;

public class Lista05Exercicio03 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);

		int numero;
		int contador = 0;
		
		do{
			do{
				System.out.print("Digite um número inteiro de 0 a 10, sendo 0 para sair do programa: ");
				numero = leia.nextInt();
				
				if (numero > 10 || numero < 0){
					System.out.println("Número inválido, digite novamente");
				}		
			}while(numero > 10 || numero < 0);
			
			// Flag para sair do programa			
			if (numero == 0) {
				System.out.println("Saindo do programa...");
				break;
			}
			
			System.out.println("\nTabuada do "+numero+"\n");
			contador = 0;
			
			do {
				
				System.out.println(numero +" x "+contador+ " = " +  numero * contador);
				
				contador++;	
				
			}while(contador <= 10);
			
	
		}while(true);
		System.out.println("Volte sempre!Obrigado pela preferência");
	}

}
