package ltp1;

import java.util.*;
public class AA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		char[] alfabeto = {'A','B','C','D','E','F','G','H','I','J',
							'K','L','M','N','O','P','Q','R','S',
							'T','U','V','W','X','Y','Z'};
		List<Character> alfabetoList = new ArrayList<Character>();
		String mensagem;
		char[] mensagemArray;
		int oldIndex = 0;
		List<Character> mensagemList = new ArrayList<Character>();
		
		ArrayList<Integer> mensagemNumeros= new ArrayList<Integer>();
		List<String> mensagemNew = new ArrayList<>();
		
		System.out.print("Digite a mensagem a ser encriptada: ");
		mensagem = leia.nextLine().toUpperCase();
		mensagemArray = mensagem.toCharArray();
		for (int x = 0; x < mensagemArray.length; x++){
			mensagemList.add(mensagemArray[x]);
		}
		for (int y = 0; y < alfabeto.length; y++){
			alfabetoList.add(alfabeto[y]);
		}
		// tivemos que colocar valores iniciais nulos para conter o erro de OutOfBounds
		for (int z = 0; z < 20; z++){
			mensagemNew.add("");
		}
			
		// Verificar se a letra da mensagem é igual à do alfabeto
		// Se for igual, adicionar indice do array de alfabeto no array mensagemNumbers
		for (int a = 0; a <mensagemList.size(); a++){
			
			for (int i = 0;i < alfabetoList.size();i++){
				if (mensagemList.get(a) == alfabetoList.get(i)){
					oldIndex = mensagemList.indexOf(mensagemList.get(a));			
					mensagemNew.add(oldIndex,alfabetoList.get(i).toString());
					int index = alfabetoList.indexOf(alfabetoList.get(i)) + 1;
					mensagemNumeros.add(index);				
				}	
				else {
					// do nothing
				}
			}
		}

		System.out.println("Matriz codigo: "+mensagemNumeros.toString());
		leia.close();
	}

}
