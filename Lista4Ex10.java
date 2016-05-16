package ltp1;

import java.util.*;
public class Lista4Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double precoAtual, desconto, precoNovo;
		char status;
		
		System.out.print("Digite o valor do produto: ");
		precoAtual = leia.nextDouble();
		
		System.out.print("Você é cliente VIP? (S/N): ");
		status = leia.next().charAt(0);
		if (status == 'S') {
			if (precoAtual <= 300) {
				desconto = precoAtual * 0.05;
				precoNovo = precoAtual - desconto;
				System.out.println("O valor do produto é: R$ "+ precoNovo);
			}
			else if (precoAtual > 300 && precoAtual <= 1000) {
				desconto = precoAtual * 0.10;
				precoNovo = precoAtual - desconto;
				System.out.println("O valor do produto é: R$ "+ precoNovo);
			}
			else {
				desconto = precoAtual * 0.15;
				precoNovo = precoAtual - desconto;
				System.out.println("O valor do produto é: R$ "+ precoNovo);
			}
		}
		else if (status == 'N') {
			if (precoAtual <= 300) {
				desconto = 0;
				precoNovo = precoAtual - desconto;
				System.out.println("O valor do produto é: R$ "+ precoNovo);
			}
			else if (precoAtual >= 300 && precoAtual <= 1000) {
				desconto = precoAtual * 0.05;
				precoNovo = precoAtual - desconto;
				System.out.println("O valor do produto é: R$ "+ precoNovo);
			}
			else {
				desconto = precoAtual * 0.10;
				precoNovo = precoAtual - desconto;
				System.out.println("O valor do produto é: R$ "+ precoNovo);
			}
		}
		else {
			System.out.println("Entrada inválida");
		}
	}

}
