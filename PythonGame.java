
package ltp1;
import java.util.*;
public class PythonGame {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		char userChoice;
		
		System.out.println("Bom dia, voc� acaba de entrar na cl�nica Santa Maria.\nAntes de mais nada quero lhe ensinar os comandos do jogo."
				+ "\n\t OBJETIVO: Encontrar a garota desaparecida!"
				+ "\n\t MOVIMENTOS:"
				+ "\n\t Ir para frente - W"
				+ "\n\t Ir para tr�s - S"
				+ "\n\t Ir para direita - D"
				+ "\n\t Ir para a esquerda - A"
				+ "\n\t Sair do jogo - Q"
				+ "\nA cada rodada o jogador pode realizar uma �nica a��o, portanto escolha com sabedoria.");
		
		
		System.out.print("Sua primeira empreitada come�a agora:"
				+ "\nA �nica coisa que voc� consegue ver pela frente � um corredor.");
		
		do {
			System.out.print("\nO que deseja fazer?: ");
			
			userChoice = read.next().charAt(0);
			
			switch(userChoice){
			case 'W':
				System.out.println("Voc� avan�ou no corredor e viu uma porta � esquerda e outra � direita,\n mas est�o � dois passos de dist�ncia");
	//			System.out.print("O que deseja fazer?");
				break;
			case 'S':
				System.out.println("Voc� voltou pro in�cio");
			case 'A':
				System.out.println("Voc� encontrou um quadro");
				System.out.print("Quer saber mais sobre ele [S/N]?: ");
				userChoice = read.next().charAt(0);
				while (userChoice !=  'S' && userChoice != 'N'){
					System.out.print("Comando inv�lido, digite novamente: ");
					userChoice = read.next().charAt(0);
				}
				if (userChoice == 'S') {
					System.out.println("Este � um quadro pintado por uma das crian�as da cl�nica e tem a data de 1998.");
					
					break;
				}
				else {
					System.out.println("Tudo bem! Vamos adiante.");
					break;
				}
				
					
			case 'D':
				System.out.println("Voc� encontrou uma porta semi-aberta");
				System.out.print("Deseja entrar na sala [S/N]?:  ");
				userChoice = read.next().charAt(0);
				while (userChoice !=  'S' && userChoice != 'N'){
					System.out.print("Comando inv�lido, digite novamente: ");
					userChoice = read.next().charAt(0);
				}
				if (userChoice == 'S'){
					System.out.println("Que legal! Voc� encontrou uma sala de seguran�a,aqui tem monitores,\nfitas de v�deo e poeira, mas ser� que � s� isso?");
					System.out.println("Agora voc� pode: \n\t Sair da sala - E \n\t Ir para frente - W \n\t Ir para tr�s - S");
					System.out.print("\nO que deseja fazer?: ");
					userChoice = read.next().charAt(0);
					while (userChoice !=  'W' && userChoice != 'S' && userChoice != 'E'){
						System.out.print("Comando inv�lido, digite novamente: ");
						userChoice = read.next().charAt(0);
					}
					switch(userChoice) {
					case 'E':
						System.out.println("Voc� saiu da sala de seguran�a");
						break;
					case 'W':
						System.out.print("Voc� encontrou uma lanterna ! Uau! Deseja peg�-la? [S/N]: ");
						userChoice = read.next().charAt(0);
						while (userChoice !=  'S' && userChoice != 'N'){
							System.out.print("Comando inv�lido, digite novamente: ");
							userChoice = read.next().charAt(0);
						}
						if (userChoice == 'S'){
							System.out.println("�tima escolha, agora voc� n�o ter� problemas para enxergar!");
							System.out.print("Aperte E para sair da sala");
							userChoice = read.next().charAt(0);
							while (userChoice !=  'E'){
								System.out.print("Comando inv�lido, digite novamente: ");
								userChoice = read.next().charAt(0);
							}
							System.out.println("Voc� saiu da sala de seguran�a");
							break;
							
						}
						else {
							break;
						}
				
						
					case 'S': 
						break;
					}
					
					break;
				}
				else {
					break;
				}
				
			case 'Q':
				System.out.println("Saindo do jogo,,, Obrigado por jogar");
				break;
				
			}
		if (userChoice != 'Q'){
			System.out.println("Comando inv�lido! Digite novamente por favor:");
		}
		}while (userChoice != 'Q');
		
		
		
		read.close();
	}

}

/* 
	print "Bom dia, voc� acaba de entrar na cl�nica Santa Maria. Antes de mais nada quero lhe ensinar os comandos do jogo."
   print "Seu objetivo � encontrar a garota fantasma."
   print "A cada rodada o jogador poder� dar 1 passo e  ir para frente (F), para a direita (D),para a esquerda (E) ou para tr�s (V)."
   print "Ent�o vamos l�! Voc� tem um corredor, pode ir para frente para direita ou para esquerda."
   print " Qual caminho gostaria de seguir?"
   
   #  JOGO DE DETETIVE
# -*- coding: utf-8 -*-

############## FUN��ES #########################################################################
def esquerda():
   print "Voc� achou um quadro."
   print "Quer saber mais sobre ele? "
   resposta = raw_input("S/N?: ").upper()
   if resposta == "S":
     print "Este � um quadro pintado por uma das crian�as da cl�nica em 1998."

   elif resposta == "N":
       print "Tudo bem."

def direita():
   print "Voc� encontrou uma porta semi aberta"
   print "Deseja entrar no quarto?"
   resposta = raw_input("S/N?: ").upper()
   if resposta == "S":
     print "Voc� encontrou a sala de seguran�a,aqui tem monitores,fitas de v�deo e poeira,nada mais"
   if resposta == "N":
     possibilidades()
     prox_acao = raw_input("Escolha sua pr�xima a��o:").upper()


def frente():
   print "Voc� avan�ou no corredor e viu uma porta � esquerda e outra � direita, mas est�o a dois passos de dist�ncia"
   prox_acao = raw_input("Escolha sua pr�xima a��o:").upper()

def tras():
   print "Voc� foi para tr�s"
   print "Escolha sua pr�xima a��o"

def dentro_sala():
   prox_acao = raw_input("Escolha sua pr�xima a��o:").upper()
   if prox_acao == "D":
     print "Voc� j� est� dentro da sala!"
     possiblidade = raw_input("V� para frente, para tr�s ou para esquerda:").upper()
     if possiblidade == "E":
       print "Voc� saiu da sala de segura�a."
       poss_acao()
       
     elif possiblidade == "F":
         frente_sala()
     else:
          tras_sala()
   elif prox_acao == "F":
       frente_sala()
   elif prox_acao == "E":
       print "Voc� saiu da sala de segura�a."
       possibilidades()
   else:
        tras_sala()

def poss_acao():
    prox_acao = raw_input("Escolha sua pr�xima a��o:").upper()
    if prox_acao == "F":
      print "Tem uma porta � esquerda e outra � direita, mas est�o a dois passos de dist�ncia"
      prox_acao = raw_input("Escolha sua pr�xima a��o:").upper()
    elif prox_acao == "V":
        print " Voc� voltou a entrada."
    elif prox_acao == "D":
        direita()
        dentro_sala()
    else:
        print "Comando Inv�lido."



def possibilidades():
    possiblidade = raw_input("Voc� pode ir para frente, para tr�s ou para direita:").upper()
    if possiblidade == "F":
      print "Tem uma porta � esquerda e outra � direita, mas est�o a dois passos de dist�ncia"
    elif possiblidade == "V":
        print " Voc� voltou a entrada."
    elif possiblidade == "D":
        direita()
        dentro_sala()
    else:
         print "Comando Inv�lido."

def tras_sala():
    print "Voc� esbarrou em uma estante cheia de DVDs e fez muito barulho!"
    sair_sala = raw_input("Aperte E para sair da sala! ").upper()
    if sair_sala == "E":
      print "Voc� saiu da sala de seguran�a. "
      poss_acao()
    else:
         print "Comando Inv�lido."
         sair_sala = raw_input("Aperte E para sair da sala! ").upper()
         if sair_sala == "E":
           print "Voc� saiu da sala de seguran�a. "
           prox_acao = raw_input("Escolha sua pr�xima a��o:").upper()


def frente_sala():
    print "Voc� encontrou uma lanterna. Deseja peg�-la? "
    resposta = raw_input("S/N?: ").upper()
    if resposta == "S":
      print " Muito bem! Agora voc� n�o ter� problemas para enxergar."
      sair_sala = raw_input("Aperte E para sair da sala! ").upper()
      if sair_sala == "E":
        print "Voc� saiu da sala de seguran�a. "
    else:
         print "Tudo bem. Veremos se foi uma boa escolha. "
         possiblidade = raw_input("Voc� pode ir para tr�s ou para esquerda:").upper()
         if possiblidade == "V":
           tras_sala()
         else:
              print "Voc� saiu da sala de seguran�a. "

############## FUN��ES ##############################################################################

#/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

############# EXECU��O DO JOGO ######################################################################

def clinica():
   print "Bom dia, voc� acaba de entrar na cl�nica Santa Maria. Antes de mais nada quero lhe ensinar os comandos do jogo."
   print "Seu objetivo � encontrar a garota fantasma."
   print "A cada rodada o jogador poder� dar 1 passo e  ir para frente (F), para a direita (D),para a esquerda (E) ou para tr�s (V)."
   print "Ent�o vamos l�! Voc� tem um corredor, pode ir para frente para direita ou para esquerda."
   print " Qual caminho gostaria de seguir?"

   answer = raw_input("Ap�s se decidir, digite a letra e aperte 'enter': ").upper()

   # SE FOR PARA FRENTE NO CORREDOR
   if answer == "F":
     frente()
   # COLOCAR CONTINUIDADE NAS ACOES>||||

   #SE FOR PRA ESQUERDA NO CORREDOR
   if answer == "E":
     esquerda()
     possibilidades()


   # SE FOR PRA DIREITA NO CORREDOR
   elif answer == "D":
        direita()
        prox_acao = raw_input("Escolha sua pr�xima a��o:").upper() # ESPECIFICAR AS DIRECOES #
           # SE FOR PRA DIREITA DENTRO DA SALA

        if prox_acao == "D":
          print "Voc� j� est� dentro da sala!"
          possiblidade = raw_input("V� para frente, para tr�s ou para esquerda:").upper()
             # SE DEPOIS DA DIREITA IR PARA ESQUERDA
          if possiblidade == "E":
            print "Voc� saiu da sala de segura�a."
            poss_acao()
        
           #SE DEPOIS DA DIREITA IR PRA FRENTE NA SALA
          elif possiblidade == "F":
              frente_sala()
             
             #SE DEPOIS DA DIREITA IR PRA TRAS
          else:
               tras_sala()
             

           #SE FOR PRA FRENTE DENTRO DA SALA
        elif prox_acao == "F":
            frente_sala()
        elif prox_acao == "E":
            print "Voc� saiu da sala de segura�a."
            possibilidades()
           # SE FOR PARA TRAS DENTRO DA SALA
        else:
            tras_sala()
                    
                   # CONFIGURAR ACAO APOS SAIR DA SALA

   else:
        tras()
        possibilidades()

##########################################################!!!!!!##########################

#outra = raw_input("Ent�o escolha sua pr�xima a��o: ").upper()///if outra == "E"( em baixo do else)




clinica()






"""elif outra == "D":
             print "Movimento n�o permitido!"
             nova_2 = raw_input("V� para frente, para tr�s ou para esquerda:").upper()
             if nova_2 == "E":
             print " Voc� achou um quadro."
             elif nova_2 == "F":
                    print "Voc� encontrou duas portas, mas elas est�o a dois passos de dist�ncia. "# configurar proxima a��o
                
                    if resposta == "S":
                      print " Muito bem! Agora voc� n�o ter� problemas para enxergar."
                      sair_sala = raw_input("Aperte E para sair da sala! ").upper()
                      if sair_sala == "E":
                        print "Voc� saiu da sala de seguran�a. "
                    else:
                         print "Tudo bem. O que deseja fazer agora? "
                         nova_2 = raw_input("V� para frente, para tr�s ou para esquerda:").upper()
                         if nova_2 == "V":
                           print "Voc� esbarrou em uma estante cheia de DVDs e fez muito barulho!"
                           sair_sala = raw_input("Aperte E para sair da sala! ").upper()
                           if sair_sala == "E":
                             print "Voc� saiu da sala de seguran�a. "
                           else:
                                sair_sala = raw_input("Aperte E para sair da sala! ").upper()
                                if sair_sala == "E":
                                  print "Voc� saiu da sala de seguran�a. "


######################################################################################################
# se ele for para a esquerda o que acontece
   elif answer == "E":
    print " Voc� achou um quadro de uma crian�a"
    print " Voc� quer saber mais sobre o quadro?"
        resposta = raw_input("S/N?: ").upper()
        if resposta == "S":
            print "Este � um quadro pintado por uma das cria�as que estava internada aqui em 1998"
        else:
            print "Ent�o qual vai ser sua pr�xima jogada?"
    else:
         print "Voc� deu um passo para tr�s"
         print "Ops! Voc� j� est� na entrada da cl�nica."

# o que acontece depois de ir para frente:
   if answer == "F":
      print "Voc� tem duas portas � frente, por�m elas est�o a dois passos de dist�ncia.."
      print "O que voc� ir� fazer? "


def pt2():
   resposta_nova = raw_input("Escolha sua pr�xima a��o:").upper()
   if resposta_nova == "D":
      print "Voc� j� est� dentro da sala!"
      nova_2 = raw_input("V� para frente, para tr�s ou para esquerda:").upper()
      if nova_2 == "E":
         print "Voc� saiu da sala de segura�a."
      elif nova_2 == "F":
         print "Voc� encontrou uma lanterna. Deseja peg�-la? "
         resposta = raw_input("S/N?: ").upper()
         if resposta == "S":
            print " Muito bem! Agora voc� n�o ter� problemas para enxergar."
            sair_sala = raw_input("Aperte E para sair da sala! ").upper()
            if sair_sala == "E":
               print "Voc� saiu da sala de seguran�a. "
         else:
              print "Tudo bem. O que deseja fazer agora? "
              nova_2 = raw_input("V� para frente, para tr�s ou para esquerda:").upper()
              if nova_2 == "V":
                print "Voc� esbarrou em uma estante cheia de DVDs e fez muito barulho!"
                sair_sala = raw_input("Aperte E para sair da sala! ").upper()
                     if sair_sala == "E":
                       print "Voc� saiu da sala de seguran�a. "
      if nova_2 == "V":
        print "Voc� esbarrou em uma estante cheia de DVDs e fez muito barulho!"
        resposta_nova = raw_input("Escolha sua pr�xima a��o:").upper()
        if resposta_nova == "E":
          print" Voc� saiu da sala de seguran�a."
        else:
             sair_sala = raw_input("Aperte E para sair da sala! ").upper()
             if sair_sala == "E":
               print "Voc� saiu da sala de seguran�a. "


   elif resposta_nova == "E":
     print "Voc� saiu da sala de segura�a."

   elif resposta_nova == "F":
     print "Voc� encontrou uma lanterna. Deseja peg�-la? "
     resposta = raw_input("S/N?: ").upper()
     if resposta == "S":
        print " Muito bem! Agora voc� n�o ter� problemas para enxergar."
        sair_sala = raw_input("Aperte E para sair da sala! ").upper()
        if sair_sala == "E":
          print "Voc� saiu da sala de seguran�a. "
        else:
          print "Tudo bem. O que deseja fazer agora? "
   else:
       print "Voc� esbarrou em uma estante de DVDs e fez muito barulho! " #V
       sair_sala = raw_input("Aperte E para sair da sala! ").upper()
       if sair_sala == "E":
         print "Voc� saiu da sala de seguran�a. "
# O JOGADOR PODE ACHAR UMA LANTERNA DENTRO DA SALA DE SEGURAN�A, MAS DE QUALQUER FORMA ELE SAIR� DA SALA.

pt2()
    
def pt3():
# AGORA DEVEMOS MONTAR A OP��O DE A��O DO PERSONAGEM AP�S SAIR DA SALA, E DAR AS OP��ES DE CAMINHO(ESQUERDA, DIREITA, FRENTE) LEMBRANDO QUE
# TEM DUAS PORTAS(E,D) A DOIS PASSOS DELE.
   pt3 = raw_input("O que voc� quer fazer?")


pt3()
clinica()"""




#####################################
# DEVO PADRONIZAR O USO DAS         #
# RAW_INPUT, CADA PARTE VAI TER     #
# A SUA, MESMO QUE FIQUE COM MAIS   #
# INPUTS, FICARA MAIS ORGANIZADO    #
#                                   #
# CADA NIVEL DE ESPA�O VAZIO TERA   #
# SUA RAW_INPUT                     #
#                                   #
#                                   #
#                                   #
#                                   #
#                                   #
#####################################

*/