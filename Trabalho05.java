package ltp1;

import java.util.*;
public class Trabalho05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		// mostrar menu num�rico para determinar a escolha
		int escolha,
			i,
			contadorClientes = 0;
		int valores[] = new int[20];
		double somaValores = 0,
			   media = 0;
		
		
		// Receber os valores pagos em 20 negocia��es banc�rias
		// Condi��es: 
			// Pedir valor devido
			// Perguntar se o cliente vai pagar a vista ou � prazo em 30 dias
				// Se escolher � prazo, ter� um juros de 13%
			// Ao final exibir:
				// media de pagamentos
				// qtd de clientes com divida acima da media
		
		System.out.println("Programa de Negocia��es banc�rias\n");
		
		// for para pegar as dividas e colocar os valores no array
		for (i = 0; i < 21;i++){
			System.out.print("Bom dia, qual o valor da sua d�vida?\n"
					+ "R$ ");
			valores[i] = leia.nextInt();
			
			
			while(valores[i] < 0){
				System.out.print("Valor inv�lido, digite novamente: R$ ");
				valores[i] = leia.nextInt();
			}
			
			System.out.println("Como voc� deseja pagar sua d�vida?\n"
					+ "\t1) � vista\n"
					+ "\t2) � prazo em 30 dias");
			System.out.print("Escolha: ");
			escolha = leia.nextInt();
			
			while(escolha != 1 && escolha != 2){
				System.out.print("Op��o inv�lida, digite novamente: ");
				escolha = leia.nextInt();
			}
			
			if (escolha == 2){
				// valor da divida vai ser acrescido de 13% de juros
				valores[i] += valores[i]* 0.13;
			}
			// somando os valores digitados para depois calcular a media
			somaValores += valores[i];
			
		}
		
		// for para passar pelo array e realizar os calculos para resultados finais
		for (i = 0; i < valores.length;i++){
			media = somaValores/ valores.length;
			if (valores[i]> media){
				contadorClientes++;
			}	
		}
		
		// Resultados finais
		
		// Considera��es:
		// Cada valor de d�vida corresponde a um cliente
		
		System.out.println("M�dia de valores: R$ " + media);
		System.out.println("Quantidade de clientes com d�vida acima da m�dia: " + contadorClientes);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
