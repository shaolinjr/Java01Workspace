package ltp1;
import java.util.*;

public class Lista05Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int salarioAtual,somaSalarios = 0,contadorConvenio = 0,funcionariosAcimaContador = 0,contadorFuncionarios = 0;
		char convenio, novoFuncionario; // S ou N
		double mediaSalarios = 0.0, salarioNovo = 0, maiorSalarioValor = 0.0;
		double funcionariosAcima; //Percentual de funcionários com salário acima de 3000 após o aumento
		String nomeFuncionario, maiorSalarioNome = "";
		
		// Início
		System.out.println("Bom dia, seja bem vindo ao sistema de salários da Mountain Eagle");
		do {
			System.out.print("Digite seu nome: ");
			nomeFuncionario = leia.next();
			
			do {
				System.out.print("Digite seu salário atual: R$ ");
				salarioAtual = leia.nextInt();
				
				if (salarioAtual <= 0){
					System.out.println("Salário não pode ser nulo nem negativo");
				}
			}while(salarioAtual <= 0);
			
			do{
				System.out.print("Deseja optar por convênio médico [S/N]? ");
				convenio = leia.next().charAt(0);
				
				if (convenio != 's' && convenio != 'n'){
					System.out.println("Opção inválida, digite novamente.");
				}
			}while(convenio != 's' && convenio != 'n');
			
			switch (convenio){
				case 's':
					if (salarioAtual <= 5000){
						salarioNovo = Math.round((salarioAtual * 1.15) - 75.12);
						System.out.println(nomeFuncionario +" seu novo salário é de:R$ " +salarioNovo);
					}
					else if (salarioAtual <= 10000){
						salarioNovo = Math.round((salarioAtual * 1.10) - 75.12);
						System.out.println(nomeFuncionario +" seu novo salário é de:R$ " +salarioNovo);
					}
					else if (salarioAtual <= 15000){
						salarioNovo = Math.round((salarioAtual * 1.05) - 75.12);
						System.out.println(nomeFuncionario +" seu novo salário é de:R$ " +salarioNovo);
					}
					else {
						salarioNovo = Math.round((salarioAtual * 1.0) - 75.12);
						System.out.println(nomeFuncionario +" seu novo salário é de:R$ " +salarioNovo);
					}
					contadorFuncionarios++;
					if (maiorSalarioValor == 0){
						maiorSalarioValor = salarioNovo;
					}else{
						// Se o salário novo for maior que o maiorSalarioValor, então ele deve ser o maior salário	
						if (salarioNovo > maiorSalarioValor){
							maiorSalarioNome = nomeFuncionario;
						}
					}
					somaSalarios += salarioNovo;
					mediaSalarios = somaSalarios / contadorFuncionarios;
					break;
					
				
				case 'n':
					if (salarioAtual <= 5000){
						salarioNovo = Math.round(salarioAtual * 1.15);
						System.out.println(nomeFuncionario +" seu novo salário é de:R$ " +salarioNovo);
					}
					else if (salarioAtual <= 10000){
						salarioNovo = Math.round(salarioAtual * 1.10);
						System.out.println(nomeFuncionario +" seu novo salário é de:R$ " +salarioNovo);
					}
					else if (salarioAtual <= 15000){
						salarioNovo = Math.round(salarioAtual * 1.05);
						System.out.println(nomeFuncionario +" seu novo salário é de:R$ " +salarioNovo);
					}
					else {
						salarioNovo = Math.round(salarioAtual * 1.0);
						System.out.println(nomeFuncionario +" seu novo salário é de:R$ " +salarioNovo);
					}
					contadorFuncionarios++;
					contadorConvenio++;
					if (maiorSalarioValor == 0){
						maiorSalarioValor = salarioNovo;
						maiorSalarioNome = nomeFuncionario;
					}else{
						// Se o salário novo for maior que o maiorSalarioValor, então ele deve ser o maior salário					
						if (salarioNovo > maiorSalarioValor){
						maiorSalarioNome = nomeFuncionario;
						}
						else if (salarioNovo == maiorSalarioValor){
							maiorSalarioNome = "Todos têm o mesmo salário";
						}
					}
					
					somaSalarios += salarioNovo;
					mediaSalarios = somaSalarios / contadorFuncionarios;
					break;
					
			}
			// Adicionar ao contador funcionários com o salário > 3000 após o aumento			
			if (salarioNovo > 3000){
				funcionariosAcimaContador ++;
			}
			
			
			do {
				System.out.print("Deseja digitar valor para novo funcionário [S/N]? ");
				novoFuncionario = leia.next().charAt(0);
				if(novoFuncionario != 's' && novoFuncionario != 'n'){
					System.out.println("Opção inválida, por favor digite novamente.");
				}
				else if(novoFuncionario == 'n'){
					System.out.println("\n ----------------------------------------------------------- \n");
				}
			}while ( novoFuncionario != 's' && novoFuncionario != 'n');
			
			
		}while(novoFuncionario == 's');
		
		//	mostrar resultados totais:	
		//soma
		System.out.println("\tA soma dos novos salários é de: R$ "+ somaSalarios);
		//media
		System.out.println("\tA media dos novos salários é de: R$ "+ mediaSalarios);
		//% acima de 3000
		System.out.println("\tA % de funcionários com salário acima de 3000 é: "+(double)(funcionariosAcimaContador / contadorFuncionarios)* 100+ " %");
		//nome maior salario
		System.out.println("\tO funcionário com maior salário é: "+ maiorSalarioNome);
	} 

}
/*
 * FUP que receba os salários dos funcionários da empresa XXX. Considere um aumento conforme a tabela abaixo:
 * -------------------------------------|----------------
    Salário <= R$5000,00 				| 15% de aumento 
   -------------------------------------------------------
	R$5000,00 < salario <= R$10000,00 	| 10% de aumento
   -------------------------------------------------------
	R$10000,00 < salario <= R$15000,00	| 5% de aumento
   -------------------------------------------------------
	Salario > R$15000,00				| 0% de aumento
   -------------------------------------------------------
 * Para os funcionários que optarem por convênio médico (S/N) desconte R$75,12.
 * Observe que:
		Não serão aceitos salários negativos ou nulos, se o usuário digitar errado, informe e solicite nova digitação. [ok]
		Para a aceitação do convênio, só aceitar S – Sim ou N – Não, se o usuário digitar errado, informe e solicite nova digitação. [ok]
 * Ao final exiba:
		A soma e a média dos novos salários
		A quantidade de funcionários que não optaram por convênio médico [ok]
		O percentual de funcionários com salário acima de R$3000,00 (após aumento) [ok]
		O nome do funcionário com o maior salário. [ok]
 */
