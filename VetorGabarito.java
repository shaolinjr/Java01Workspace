package aula_01;
import java.util.*;
public class VetorGabarito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		char gabarito[] = new char[10];
		//char opcoes[] = {'a', 'b', 'c', 'd', 'e'};
		char sair;
		
		String nomeAluno[] = new String[5];
		char respostaAluno[] = new char[10];
		String alunosTotal = "";
		
		int i, aluno, k, nota = 0, somaNota = 0, zerouBurro = 0, acimaMedia = 0;
		
		double media = 0;
		
		System.out.println("Bom dia, digite o gabarito da prova");
		
		// Gabarito
		for(i = 0; i < gabarito.length; i++){
			System.out.print("Digite a resposta da questão "+ (i+1) + ": ");
			gabarito[i] = leia.next().charAt(0);
		}
		System.out.println("\nAmbiente do aluno inicializado\n");
		
		//Aluno
		for (aluno = 0; aluno < nomeAluno.length; aluno++){
			System.out.print("Bom dia, qual o seu nome?: ");
			nomeAluno[aluno] = leia.next();
			nota = 0;
			
			for(i = 0; i < gabarito.length; i++){
				System.out.print("Digite a resposta da questão "+ (i+1) + ": ");
				respostaAluno[i] = leia.next().charAt(0);
			}
			
			// calculo da nota do aluno
			for (k = 0; k < respostaAluno.length; k++ ){
				
				if (respostaAluno[k] == gabarito[k]){
					nota++;
				}
			}
			// fazer calculos para resultado final
			
			//somando notas
			somaNota += nota;
			
			// verificando zeros
			if (nota == 0){
				zerouBurro++;
			}
			// verificando totais
			else if (nota == 10){
				alunosTotal += nomeAluno[aluno]+ " ";
			}
			
			System.out.println(nomeAluno[aluno]+ " sua nota é: "+nota);
			
			do {
				
				System.out.print("Deseja finalizar o programa [S / N]?: ");
				sair = leia.next().charAt(0);
				
			}while(sair != 'S' && sair != 'N');
			
			if (sair == 'S'){
				media = (double) somaNota / (aluno + 1);
				if (nota > media){
					acimaMedia++;
				}
				break;
			}
			
		}
		
		
		// Resultados finais
		System.out.println("Soma das notas: " + somaNota);
		
		System.out.println("Media das notas: " + media);
		
		System.out.println((double) zerouBurro / (aluno+1) * 100 +"% dos alunos do campus zeraram a prova");
		
		System.out.println("Pessoas que tiraram total: "+alunosTotal);
	}

}
