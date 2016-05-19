package ltp1;
import java.util.*;
public class VetorGabarito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		char gabarito[] = new char[10];
		//char opcoes[] = {'a', 'b', 'c', 'd', 'e'};
		char sair;
		
		String nomeAluno[] = new String[4500];
		char respostaAluno[] = new char[4500];
		String alunosTotal[] = new String[4500];
		
		int i, aluno, k, nota = 0, somaNota = 0, zerouBurro = 0, acimaMedia = 0;
		
		double media = 0;
		System.out.println("Ambiente do professor inicializado\n");
		System.out.println("Bom dia, digite o gabarito da prova\n");
		
		// Gabarito
		for(i = 0; i < gabarito.length; i++){
			System.out.print("Digite a resposta da questão "+ (i+1) + ": ");
			gabarito[i] = leia.next().charAt(0);
			while(gabarito[i] != 'a' && gabarito[i] != 'b' && gabarito[i] != 'c' && gabarito[i] != 'd' && gabarito[i] != 'e'){
				System.out.print("Resposta inválida, digite novamente: ");
				gabarito[i] = leia.next().charAt(0);
			}
		
		}
		System.out.println("\n-----------------------------------------------------\n");
		System.out.println("Ambiente do aluno inicializado\n");
		
		//Aluno
		for (aluno = 0; aluno < nomeAluno.length; aluno++){
			System.out.print("Bom dia, qual o seu nome?: ");
			nomeAluno[aluno] = leia.next();
			nota = 0;
			
			for(i = 0; i < gabarito.length; i++){
				System.out.print("Digite a resposta da questão "+ (i+1) + ": ");
				respostaAluno[i] = leia.next().charAt(0);
				while(respostaAluno[i] != 'a' && respostaAluno[i] != 'b' && respostaAluno[i] != 'c' && respostaAluno[i] != 'd' && respostaAluno[i] != 'e'){
					System.out.print("Resposta inválida, digite novamente: ");
					respostaAluno[i] = leia.next().charAt(0);
				}
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
				alunosTotal[aluno] = nomeAluno[aluno];
			}
			
			System.out.println(nomeAluno[aluno]+ " sua nota é: "+nota);
			media = (double) somaNota / (aluno + 1);
			if (nota > media){
				acimaMedia++;
			}
			
			if (aluno + 1 == nomeAluno.length){
				System.out.println("\nNumero máximo de entradas, mostrando resultados finais\n");
				break;
			}
			
			do {
				System.out.print("Deseja finalizar o programa [S / N]?: ");
				sair = leia.next().charAt(0);
				if (sair != 'S' && sair != 'N'){
					System.out.println("Resposta inválida, digite novamente.");
					
				}
			}while(sair != 'S' && sair != 'N');
			
			if (sair == 'S'){
				break;
			}
			
		}
		
		
		// Resultados finais
		System.out.println("\n\tSoma das notas: " + somaNota);
		
		System.out.println("\tMedia das notas do campus: " + media);
		
		System.out.println("\t"+(double) zerouBurro / (aluno+1) * 100 +"% dos alunos do campus zeraram a prova");
		
		System.out.println("\tPessoas que tiraram total: ");
		
		for (int index = 0; index < alunosTotal.length; index++){
			if (alunosTotal[index] != null){
				System.out.println("\t"+alunosTotal[index]);
			}
		}
		leia.close();
	}

}
