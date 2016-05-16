package ltp1;
import java.util.*;
public class AutoInstrucional {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// Formula para decifrar: M = (M x C) x C^-1
		
		// DONE Array alfabeto para gerar a resposta da mensagem
		// DONE Matriz para conter a matriz codigo
		// DONE Matriz para conter a matriz chave
		// DONE Matriz para conter mensagem
		
		// chave para decifrar a mensagem ( C )
		int chave 		[][] 	= { {-1,-2,3}, {2,3,-5}, {2,4,-5} };
		
		// matriz codificada (M x C)
		int codigo 		[][];
		
		// matriz código ( M )
		int mensagem 	[][] = new int[3][3];
		String mensagemStringArray [];
		int mensagemToNumbersArray [] = new int[9];
		// array resposta
		char resposta 	[];
		
		// array com as letras para formar a mensagem
		char alfabeto	[] 		= {'#','A','B','C','D','E','F','G','H','I','J',
								'K','L','M','N','O','P','Q','R','S',
								'T','U','V','W','X','Y','Z'};
		
		// Entrada de dados
		
		// Entrada do código
		// metodo para criar o array de mensagem simples
		System.out.println("Digite o código interceptado: ");
		mensagemStringArray = leia.nextLine().split(" ");
		
		System.out.println("its size "+mensagemStringArray.length);
		// transformamos o Array de tipo String no nosso array do tipo int
		for (int j = 0; j <= 8; j++){
			mensagemToNumbersArray[j] = Integer.parseInt(mensagemStringArray[j]);
		}
		
		// criamos a matriz codigo ( M )
		
		// k = linha
		// 
		for (int k = 0; k < 2; k++){
			for (int i = 0; i <= 8; i++){
			
				if (i <3){
					mensagem[0][k] = mensagemToNumbersArray[i];
					
					
					
				}
				else if(i < 6){
					mensagem[1][k] = mensagemToNumbersArray[i];
					
				}
				else {
					mensagem[2][k] = mensagemToNumbersArray[i];
				}
				
				
				
			}
			
			
			
		}
		
		
		
	}

}
