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
		
		// codigo de teste: 29 49 -66 49 91 -122 25 31 -55
		// chave de teste: -1 -2 3 2 3 -5 2 4 5
		
		// chave para decifrar a mensagem ( C )
		// usuario deve digitar a chave
		int chave 				[][] 	= new int[3][3];
		int chaveToNumbersArray [] 		= new int[9];
		int determinante = 0;
		int diagonalPrinc = 1;
		int diagonalSec = 1;
		
		
		// matriz codificada (M x C)
		int codigo 		[][] = new int[3][3];
		
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
		int i = 0;
		// Entrada de dados
		
		// Entrada do código
		// metodo para criar o array de mensagem simples
		
		System.out.print("Digite o código interceptado: ");
		mensagemStringArray = leia.nextLine().split(" ");
		
		// validação do codigo digitado
		while(mensagemStringArray.length != 9){
			System.out.print("Código inválido, insira novamente: ");
			mensagemStringArray = leia.nextLine().split(" ");
		}
		
		// transformamos o Array de tipo String no nosso array do tipo int
		for (int j = 0; j <= 8; j++){
			mensagemToNumbersArray[j] = Integer.parseInt(mensagemStringArray[j]);
		}
		
		// criamos a matriz codigo ( M )	
		
		// linha
		for (int line = 0; line < 3; line++){
			//coluna
			for(int column = 0; column < 3; column++){
				
				mensagem[line][column] = mensagemToNumbersArray[i];
				i++;

			}
		}
		
		// Vamos criar a matriz chave
		
		System.out.print("Digite agora a chave da mensagem (números separados por espaço): ");
		mensagemStringArray = leia.nextLine().split(" ");
		
		while(mensagemStringArray.length != 9){
			System.out.print("Código inválido, insira novamente: ");
			mensagemStringArray = leia.nextLine().split(" ");
		}
		
		// transformamos o Array de tipo String no nosso array do tipo int
		for (int j = 0; j <= 8; j++){
			chaveToNumbersArray[j] = Integer.parseInt(mensagemStringArray[j]);
		}
				
		// criamos a matriz chave ( C )	
		
		// redeclaramos o i para resetar o contador do indice do array de chaves
		i = 0;
		// linha
		for (int line = 0; line < 3; line++){
			//coluna
			for(int column = 0; column < 3; column++){
				
				chave[line][column] = chaveToNumbersArray[i];
				i++;
			}
		}
		
		
		// Matriz ( M x C )
		// Nesse ponto já temos a matriz de mensagem e de chave criadas, agora temos que multiplicar linha x coluna
		
		// linha
		for (int line = 0; line < 3; line++){
			//coluna
			for (int column = 0; column < 3; column++){
				// realizando as multiplicações de linha x coluna
				for (int t = 0; t < 3; t++){
					codigo[line][column] += (mensagem[line][t]*chave[t][column]);
				}
			}
		}
				
		
		System.out.println("Decriptografando...");
		
		
		// calculando o determinante
		// determinante hardcoded
		// Procurar melhor maneira para calcular o determinante..
		for (int princ = 0; princ < 3; princ++){
			diagonalPrinc *= chave[princ][princ];			
		}
		diagonalSec *= chave[0][2]*chave[1][1]*chave[2][0];
		
		determinante = (diagonalPrinc 	+ (chave[0][1]*chave[1][2]*chave[2][0]) + (chave[0][2]*chave[2][1]*chave[1][0])) - 
					   (diagonalSec 	+ (chave[0][1]*chave[1][0]*chave[2][2]) + (chave[0][0]*chave[2][1]*chave[1][2]));
		
		
		System.out.println("Diagonal Princ: "	+ diagonalPrinc);
		System.out.println("Diagonal Sec: "		+ diagonalSec);
		System.out.println("Determinante: "		+determinante);
		
		
				for(int testing : codigo[0]){
					System.out.println("Linha 01 "+ testing);
				}
				
				for(int testing : codigo[1]){
					System.out.println("Linha 02 "+ testing);
				}
				
				for(int testing : codigo[2]){
					System.out.println("Linha 03 "+ testing);
				}
				
		
			
		
	}
		
		
		


}
