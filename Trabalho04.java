package ltp1;

import java.util.*;
public class Trabalho04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		int nota = 0, somaNotas = 0;
		// notas s�o entre 0 e 10;
		// -1 sai do programa
		int frequencia[] = {0,0,0,0,0,0,0,0,0,0,0};
		int notas[] = new int[100];
		int i = 0, x;
		
		System.out.println("Ol�, bem vindo ao programa Vetor de Notas e suas frequ�ncias!");
		System.out.println("Para sair do programa � qualquer momento, \n"
				+ "digite a nota com o valor -1");
		
		for (i = 1; i < 101; i++){
			
			System.out.print("Digite a "+(i) +"� nota: " );
			
			nota = leia.nextInt();
			if(nota == -1 ){
				System.out.println("Saindo\n");
				break;
			}else {
				while (nota > 10){
					System.out.print("Valor inv�lido para nota,\ndigite um n�mero entre 0 e 10: ");
					nota = leia.nextInt();
				}
				int indiceNotas;
				// somar notas
				somaNotas+= nota;
				
				// aqui n�s adicionamos 1 ao indice do array que corresponde ao valor da nota
				frequencia[nota]++;
			}
		}
			System.out.print("Nota\t\tFrequ�ncia\n");
			// aqui n�s colocamos os itens do array(frequencias) e suas respectivas notas
			for (x = 0; x < frequencia.length; x++ ){
				System.out.println((x)+"\t\t"+frequencia[x]);
			}
			// tivemos que colocar contador -1 pelo fato dele sair quando digitamos -1, mas adiciona antes ao contador
			System.out.println("\nM�dia de notas: "+ (double)somaNotas / (i - 1));
			
	}

}
