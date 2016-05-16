

package ltp1;
import java.util.*;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Trabalho_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		double valorDivida, 
			   valorFinal = 0 , 
			   contadorJuros = 0.0, 
			   valorTotal = 0.0,
			   valorTotalJuros = 0.0,
			   valorParcela = 0.0;
		
		int contadorParcela = 0, aVista = 0, cont12 = 0, contPessoas = 0;
		
		int qtdParcelas;
		char novaInsercao = 'x';
		
		for(;;){
			
			
			System.out.print("Digite seu nome: ");
			nome = leia.next();
			
			do {
				System.out.print("Digite o valor da d�vida: ");
				valorDivida = leia.nextDouble();
				if (valorDivida < 0){
					System.out.println("Valor inv�lido");
				}
			}while (valorDivida < 0);
			
			valorTotal += valorDivida;
			
			// juros =  valorDivida * contadorJuros
			// valorFinal = juros + valorDivida
			// valorParcela = valorFinal / contadorParcela
			
			System.out.println("Valor Final \t Juros \t Parcelas \t Valor Parcela");
			
			contadorJuros = 0.0;
			valorFinal = valorDivida;
			contadorParcela = 1;
			System.out.print("   "+valorFinal+ "\t"); 
			System.out.print("  "+contadorJuros * valorDivida+"\t");
			System.out.print("    "+contadorParcela+"\t");
			System.out.print("       "+valorFinal / contadorParcela+"\t\n");
				
			for (contadorParcela = 3 ;contadorParcela <= 12; contadorParcela += 3){
				
				if (contadorParcela == 3){
					contadorJuros = 0.10;
					valorFinal = (valorDivida*contadorJuros) + valorDivida;
					valorParcela = valorFinal / contadorParcela;
					
				}
				else if (contadorParcela == 6){
					contadorJuros = 0.15;
					valorFinal = (valorDivida*contadorJuros) + valorDivida;
					valorParcela = valorFinal / contadorParcela;
					
				}
				else if (contadorParcela == 9){
					contadorJuros = 0.20;
					valorFinal = (valorDivida*contadorJuros) + valorDivida;
					valorParcela = valorFinal / contadorParcela;
					
				}
				else if (contadorParcela == 12){
					contadorJuros = 0.25;
					valorFinal = (valorDivida*contadorJuros) + valorDivida;
					valorParcela = valorFinal / contadorParcela;
					
				}
				
				System.out.print("   "+valorFinal+ "\t"); 
				System.out.print("  "+contadorJuros * valorDivida+"\t");
				System.out.print("    "+contadorParcela+"\t");
				System.out.print("       "+valorParcela+"\t\n");
			}
						
			do {
				
				System.out.print("\nEm quantas parcelas voc� quer dividir? ");
				qtdParcelas = leia.nextInt();
				
				switch (qtdParcelas){
					case 1:
						aVista++;
						valorTotalJuros += valorDivida; 
						break;
						
					case 3:
						contadorJuros = 0.10;
						valorFinal = (valorDivida*contadorJuros) + valorDivida;
						valorTotalJuros += valorFinal;
						break;
						
					case 6:
						contadorJuros = 0.15;
						valorFinal = (valorDivida*contadorJuros) + valorDivida;
						valorTotalJuros += valorFinal;
						break;
						
					case 9:
						contadorJuros = 0.20;
						valorFinal = (valorDivida*contadorJuros) + valorDivida;
						valorTotalJuros += valorFinal;
						break;
						
					case 12:
						contadorJuros = 0.25;
						valorFinal = (valorDivida*contadorJuros) + valorDivida;
						valorTotalJuros += valorFinal;
						cont12++;
						break;
				}
				
				if (qtdParcelas != 1 && qtdParcelas != 3 && qtdParcelas != 6 && qtdParcelas != 9 && qtdParcelas != 12){
					System.out.println("Valor inv�lido");
				}
				
			}while(qtdParcelas != 1 && qtdParcelas != 3 && qtdParcelas != 6 && qtdParcelas != 9 && qtdParcelas != 12);
			
			do {
				System.out.print("Deseja fazer uma nova inser��o?[s/n]: ");
				novaInsercao = leia.next().charAt(0);
				if (novaInsercao !='s' && novaInsercao != 'n'){
					System.out.println("Op��o inv�lida!");
				}
				
			}while(novaInsercao !='s' && novaInsercao != 'n');
			contPessoas++;
			
			
			 if (novaInsercao == 'n'){
				 System.out.println("Saindo...");
				 break;
			 }
			 
		}
		 // Resultados Finais
		 System.out.println("Valor total antes da negocia��o: R$"+valorTotal);
		 System.out.println("Valor total da d�vida ap�s juros: R$"+ valorTotalJuros);
		 System.out.println("M�dia de pagamento sendo considerado a soma do valor total ap�s o acr�scimo de juros"
		 		+ "\ndividido pela quantidade de pessoas que digitaram o valor da d�vida: R$"+ valorTotalJuros/contPessoas);
		 System.out.println("Quantidade de clientes que pagar�o em 12 parcelas: "+cont12);
		 System.out.println("O percentual de pessoas que pagaram � vista: "+ (double) aVista / contPessoas *100+"%");
	}
}
