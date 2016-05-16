package ltp1;
import java.util.*;

public class Lista05Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		//Declaracao de variaveis
		double	valorMercadoria,
				soma = 0,
				media,
				novoValor;
		int 	contador = 0;
		
		//Loop para repetir 10 vezes
		do {
			//Loop para validacao da entrada de dados
			do {
				//Entrada de dados
				System.out.print("Digite o valor da mercadoria R$");
				valorMercadoria = leia.nextDouble();
				
				if (valorMercadoria <= 0) {
					System.out.println("Valor inv�lido. Digite novamente. ");
				}
			} while (valorMercadoria <= 0);
			
			//Processamento
			novoValor = valorMercadoria * 0.9; //Desconto de 10%
			
			//Preparar para resultados finais
			soma = soma + novoValor; //acumular valores em soma
			contador++;
		} while (contador <= 9);
		
		//Saida de informacoes
		System.out.println("Soma R$" + soma);
		media = soma / contador; //Neste ponto o contador sera igual a 10
		System.out.println("Média R$" + media);
		
		leia.close();
	}

}
