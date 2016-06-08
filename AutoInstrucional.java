package aula_01;
import java.util.*;
public class AutoInstrucional {
	
	/* Integrantes: 
	
			- Arthur de Castro L. Pires
			- Bruno Piron
			- Fabrício Vidal
			- Jean Augusto
			- João Paulo Theodoro de Moraes
		
			- SALA: 1DA
	*/
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		// Formula para decifrar: M = (M x C) x C^-1
		
		// codigo de teste: 29 49 -66 49 91 -122 25 31 -55
		// chave de teste: -1 -2 3 2 3 -5 2 4 -5
		
		// codigo de teste 15 -10 18 108 29 34 15 5 4
		// chave de teste  5 2 1 0 -1 1 2 0 1
		
		// codigo de teste 26 59 6 26 -5 23 35 42 16
		
		// chave de teste 1 -1 1 1 3 0 1 0 1
		
		// chave para decifrar a mensagem ( C )
		// usuario deve digitar a chave
		int 	chave 				[][] 	= new int[3][3],
				chaveToNumbersArray [] 		= new int[9],
				determinante = 0,
				diagonalPrinc = 1,
				diagonalSec = 1,
				msg = 0;
		
		// matriz de cofatores de C 
		double cofatores [][] = new double[3][3];
		
		// matriz mensagem ( M )
		int mensagem 		[][] = new int[3][3];
		
		// matriz codificada ( M x C )
		double mensagemCodificada 	[][] = new double[3][3];
		String mensagemStringArray [];
		String chaveStringArray [];
		int mensagemToNumbersArray [] = new int[9];
		
		// array resposta
		char resposta[] = new char[9];
		
		// array com as letras para formar a mensagem
		char alfabeto	[] 		= {	'#','A','B','C','D','E','F','G','H','I','J',
									'K','L','M','N','O','P','Q','R','S',
									'T','U','V','W','X','Y','Z'	};
		int i = 0, t, line, column;
		
		// ENTRADA DE DADOS
		
		// ENTRADA DA MENSAGEM CODIFICADA
		
		// Método para criar o array de mensagem simples
		System.out.print("Digite o código interceptado: ");
		mensagemStringArray = leia.nextLine().split(" ");
		
		// Validação do codigo digitado
		while(mensagemStringArray.length != 9){
			System.out.print("Código inválido, insira novamente: ");
			mensagemStringArray = leia.nextLine().split(" ");
		}
		
		// Vamos criar a matriz chave
		System.out.print("Digite agora a chave da mensagem (números separados por espaço): ");
		chaveStringArray = leia.nextLine().split(" ");
		
		// Validação da chave digitado
		while(mensagemStringArray.length != 9){
			System.out.print("Código inválido, insira novamente: ");
			chaveStringArray = leia.nextLine().split(" ");
		}
		
		// transformamos o Array de tipo String no nosso array do tipo int
		for (int j = 0; j <= 8; j++){
			mensagemToNumbersArray[j] = Integer.parseInt(mensagemStringArray[j]);
			chaveToNumbersArray[j] = Integer.parseInt(chaveStringArray[j]);
		}
				
		// criamos a matriz chave ( C )	
		// redeclaramos o i para resetar o contador do indice do array de chaves
		i = 0;
		// linha
		for (line = 0; line < 3; line++){
			//coluna
			for(column = 0; column < 3; column++){
				
				mensagemCodificada[line][column] = mensagemToNumbersArray[i];
				chave[line][column] = chaveToNumbersArray[i];				
				i++;
			}
		}
		
		// calculando o determinante
		for (int princ = 0; princ < 3; princ++){
			diagonalPrinc *= chave[princ][princ];			
		}
		
		diagonalSec *= chave[0][2]*chave[1][1]*chave[2][0];
		
		determinante = (diagonalPrinc 	+ (chave[0][1]*chave[1][2]*chave[2][0]) + (chave[0][2]*chave[2][1]*chave[1][0])) - 
					   (diagonalSec 	+ (chave[0][1]*chave[1][0]*chave[2][2]) + (chave[0][0]*chave[2][1]*chave[1][2]));
		
//		System.out.println("Diagonal Princ: "	+ diagonalPrinc);
//		System.out.println("Diagonal Sec: "		+ diagonalSec);
//		System.out.println("Determinante: "		+ determinante);
		
		// Verificar det != 0 para que seja possível qualquer a matriz inversa da chave
		if (determinante == 0){
			System.out.println("Determinante de Matriz Chave = 0, chave inválida");
		}
		else {
			
			// calculando os cofatores e transpondo ao mesmo tempo
			cofatores[0][0] = ((chave[1][1] * chave[2][2]) - (chave[1][2] * chave [2][1])) / determinante ;
			cofatores[1][0] = -1*((chave[1][0]* chave[2][2]) - (chave[1][2] * chave [2][0])) / determinante;
			cofatores[2][0] = ((chave[1][0]* chave[2][1]) - (chave[1][1] * chave [2][0])) / determinante;
			
			
			cofatores[0][1] = -1* ((chave[0][1]* chave[2][2]) - (chave[0][2] * chave [2][1])) / determinante;
			cofatores[1][1] = ((chave[0][0]* chave[2][2]) - (chave[0][2] * chave [2][0])) / determinante;
			cofatores[2][1] = -1* ((chave[0][0]* chave[2][1]) - (chave[0][1] * chave [2][0])) / determinante;
			
			cofatores[0][2] = ((chave[0][1]* chave[1][2]) - (chave[0][2] * chave [1][1])) / determinante;
			cofatores[1][2] = -1* ((chave[0][0]* chave[1][2]) - (chave[0][2] * chave [1][0])) / determinante;
			cofatores[2][2] = ((chave[0][0]* chave[1][1]) - (chave[0][1] * chave [1][0])) / determinante;
			
//		for (line = 0; line < 3; line++){
//						
//			//coluna
//			for(column = 0; column < 3; column++){
//				
//				if (line != column){
//					double aux = cofatores[line][column];
//					cofatores[line][column] = cofatores [column][line];
//					cofatores [column][line] = aux;
//					
//				}
//			}
//		}
			
			for (line = 0; line < 3; line++){
				
				//coluna
				for(column = 0; column < 3; column++){
					
					//multiplicacao da matriz de cofatores transposta pela matriz codificada
					for (t = 0; t < 3; t++){
						mensagem[line][column] += (mensagemCodificada[line][t] * cofatores[t][column]);
					}
//					System.out.println((line + 1)+" "+(column + 1)+ ": "+mensagem[line][column]);						
					// Adicionando os caracteres no array de resposta
					resposta[msg] = alfabeto[mensagem[line][column]];
					msg++;
				}	
			}
		}
		leia.close();
		// Mostrando o resultado
		System.out.println("\nMensagem decriptada: \n");
		for (int show = 0; show < resposta.length; show++){
			System.out.print(resposta[show]);
		}
	}
}
