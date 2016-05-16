package ltp1;

import java.util.*;

public class Lista4Ex01 {

	public static void main(String[] args) {
		
		// macas = 1,30 se < 12
		// macas = 1,00 se >= 12
		Scanner leia = new Scanner(System.in);
		
		int apples;
		double total;
		
		System.out.print("Digite quantas maçãs foram compradas: ");
		apples = leia.nextInt();
		
		if(apples < 12) {
			total = apples * 1.30;
			System.out.print("Sua compra foi de: " + total);
		}
		
		else {
			total = apples * 1.00;
			System.out.print("Sua compra foi de: " + total);
			
		}
		
	}

}
