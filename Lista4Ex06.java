package ltp1;

import java.util.*;
public class Lista4Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if (idade > 0 && idade <= 120){
			if (idade <=7){
				System.out.println("Sua classificação é: Infantil A");
			}
			else if (idade >= 8 && idade <=10){
				System.out.println("Sua classificação é: Infantil B");
			}
			else if (idade >=11 && idade <=13) {
				System.out.println("Sua classificação é: Juvenil A");
			}
			else if (idade >=14 && idade <=17) {
				System.out.println("Sua classificação é: Juvenil B");
			}
			else {
				System.out.println("Sua classificação é: Adulto");
			}
		}
		else {
			System.out.println("Digite uma idade entre 0 e 120 anos");
		}
	}

}
