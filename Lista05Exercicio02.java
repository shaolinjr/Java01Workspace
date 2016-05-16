package ltp1;
import java.util.*;

public class Lista05Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int contador = 200;
		
		
		do {
			if(contador % 2 == 0){
				System.out.println(contador);
				contador = contador - 1;
			}
			else {
				contador = contador - 1;
			}
			
		}while(contador >=100);
		
	}

}
