package ltp1;
import java.util.*;

public class Lista05Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		String nome;
		
		int alunosAcima = 0,nota = 0,contador = 0, notaMenor = 100, somaNotas = 0;
//		double media;
		char resposta; //sair ou nao
		
		do {
			do{
				System.out.print("Digite sua nota: ");
				nota = leia.nextInt();
				
				if(nota > 35 || nota < 0){
					System.out.println("Erro de nota");
				}
			}while(nota > 35 || nota < 0);
			
			if (notaMenor > nota) {
				notaMenor = nota;
			}
			
			
			System.out.print("Digite seu nome: ");
			nome = leia.next(); 
			
			System.out.println(nome + " " + nota);
			double aproveitamento = (100 * nota) /35;
			System.out.println("Aproveitamento: " + aproveitamento + "%") ;
			
			if (aproveitamento > 60){
				alunosAcima++;
			}
			// adicionando notas na variavel
			somaNotas += nota;
			
			contador++;
			
//			Valida��o continuar ou n�o	
			System.out.print("Deseja digitar uma nova nota [S/N]? ");
			resposta = leia.next().charAt(0);
			
			if (resposta == 'n'){
				break;
			}
			
			
		}while(contador < 60 && resposta == 's');
		
		

		System.out.println("Nota menor: "+ notaMenor);
		if (contador >= 2){
		System.out.println("Média da turma:"+ somaNotas / (contador));
		System.out.println("Alunos acima da média: " + alunosAcima);
		}
	}

}
