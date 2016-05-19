package ltp1;
import java.util.*;
public class FUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int notas[] = new int[10];

		int qtdAcima = 0, i, somaNotas = 0, notasAbaixo = 0, j, maiorNota = 0;
		
		double media = 0;
		
		double perc;

		String aluno[] = new String[10];
		
		String alunos = "";
		

		for(i = 0; i < 10; i++){

			
			System.out.println("Digite o nome | Digite \"FIM\" para sair: ");
			aluno[i] = leia.next();
			
			
			if(aluno[i].equals("FIM")){
				System.out.print("Saindo...");
				break;	
			}
			
			System.out.println("Digite a nota: ");
			notas[i] = leia.nextInt();
			while(notas[i] < 0 || notas[i] > 100){
				System.out.println("Valor inválido. Digite novamente.");
				notas[i] = leia.nextInt();
			}

			if(notas[i] >= 60){
				System.out.println(aluno[i] + ", você está aprovado!");
			}
			else if(notas[i] >= 25){
				System.out.println(aluno[i] + ", você está em prova especial!");
			}
			else {
				System.out.println(aluno[i] + ", você está reprovado!");
				notasAbaixo++;
			}

			somaNotas += notas[i];

		}
		
		media = somaNotas / i;
		
		for(j = 0; j < i; j++){
			
			if(notas[j] > media){
				qtdAcima++;
			}
			
		}
		// PEGAR MAIOR NOTA
		for (int test = 0; test < notas.length;test++){
			if(maiorNota < notas[test]){
				maiorNota = notas[test];
			}
		}
		// VERIFICAR QUEM TIROU A MAIOR NOTA
		
		
		
		System.out.println("A média é: " + media);
		
		
		System.out.println("A quantidade de alunos acima da média é: " + qtdAcima);
		
		perc = (double) notasAbaixo / i * 100;
		
		System.out.println("O percentual de reprovações é: " + perc);
	
		for(j = 0; j < i; j++){
			
			System.out.println(aluno[j]);

		}
		

		leia.close();
	}

}
