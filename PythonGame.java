
package ltp1;
import java.util.*;
public class PythonGame {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		char userChoice;
		
		System.out.println("Bom dia, você acaba de entrar na clínica Santa Maria.\nAntes de mais nada quero lhe ensinar os comandos do jogo."
				+ "\n\t OBJETIVO: Encontrar a garota desaparecida!"
				+ "\n\t MOVIMENTOS:"
				+ "\n\t Ir para frente - W"
				+ "\n\t Ir para trás - S"
				+ "\n\t Ir para direita - D"
				+ "\n\t Ir para a esquerda - A"
				+ "\n\t Sair do jogo - Q"
				+ "\nA cada rodada o jogador pode realizar uma única ação, portanto escolha com sabedoria.");
		
		
		System.out.print("Sua primeira empreitada começa agora:"
				+ "\nA única coisa que você consegue ver pela frente é um corredor.");
		
		do {
			System.out.print("\nO que deseja fazer?: ");
			
			userChoice = read.next().charAt(0);
			
			switch(userChoice){
			case 'W':
				System.out.println("Você avançou no corredor e viu uma porta à esquerda e outra à direita,\n mas estão à dois passos de distância");
	//			System.out.print("O que deseja fazer?");
				break;
			case 'S':
				System.out.println("Você voltou pro início");
			case 'A':
				System.out.println("Você encontrou um quadro");
				System.out.print("Quer saber mais sobre ele [S/N]?: ");
				userChoice = read.next().charAt(0);
				while (userChoice !=  'S' && userChoice != 'N'){
					System.out.print("Comando inválido, digite novamente: ");
					userChoice = read.next().charAt(0);
				}
				if (userChoice == 'S') {
					System.out.println("Este é um quadro pintado por uma das crianças da clínica e tem a data de 1998.");
					
					break;
				}
				else {
					System.out.println("Tudo bem! Vamos adiante.");
					break;
				}
				
					
			case 'D':
				System.out.println("Você encontrou uma porta semi-aberta");
				System.out.print("Deseja entrar na sala [S/N]?:  ");
				userChoice = read.next().charAt(0);
				while (userChoice !=  'S' && userChoice != 'N'){
					System.out.print("Comando inválido, digite novamente: ");
					userChoice = read.next().charAt(0);
				}
				if (userChoice == 'S'){
					System.out.println("Que legal! Você encontrou uma sala de segurança,aqui tem monitores,\nfitas de vídeo e poeira, mas será que é só isso?");
					System.out.println("Agora você pode: \n\t Sair da sala - E \n\t Ir para frente - W \n\t Ir para trás - S");
					System.out.print("\nO que deseja fazer?: ");
					userChoice = read.next().charAt(0);
					while (userChoice !=  'W' && userChoice != 'S' && userChoice != 'E'){
						System.out.print("Comando inválido, digite novamente: ");
						userChoice = read.next().charAt(0);
					}
					switch(userChoice) {
					case 'E':
						System.out.println("Você saiu da sala de segurança");
						break;
					case 'W':
						System.out.print("Você encontrou uma lanterna ! Uau! Deseja pegá-la? [S/N]: ");
						userChoice = read.next().charAt(0);
						while (userChoice !=  'S' && userChoice != 'N'){
							System.out.print("Comando inválido, digite novamente: ");
							userChoice = read.next().charAt(0);
						}
						if (userChoice == 'S'){
							System.out.println("Ótima escolha, agora você não terá problemas para enxergar!");
							System.out.print("Aperte E para sair da sala");
							userChoice = read.next().charAt(0);
							while (userChoice !=  'E'){
								System.out.print("Comando inválido, digite novamente: ");
								userChoice = read.next().charAt(0);
							}
							System.out.println("Você saiu da sala de segurança");
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
			System.out.println("Comando inválido! Digite novamente por favor:");
		}
		}while (userChoice != 'Q');
		
		
		
		read.close();
	}

}

/* 
	print "Bom dia, você acaba de entrar na clínica Santa Maria. Antes de mais nada quero lhe ensinar os comandos do jogo."
   print "Seu objetivo é encontrar a garota fantasma."
   print "A cada rodada o jogador poderá dar 1 passo e  ir para frente (F), para a direita (D),para a esquerda (E) ou para trás (V)."
   print "Então vamos lá! Você tem um corredor, pode ir para frente para direita ou para esquerda."
   print " Qual caminho gostaria de seguir?"
   
   #  JOGO DE DETETIVE
# -*- coding: utf-8 -*-

############## FUNÇÕES #########################################################################
def esquerda():
   print "Você achou um quadro."
   print "Quer saber mais sobre ele? "
   resposta = raw_input("S/N?: ").upper()
   if resposta == "S":
     print "Este é um quadro pintado por uma das crianças da clínica em 1998."

   elif resposta == "N":
       print "Tudo bem."

def direita():
   print "Você encontrou uma porta semi aberta"
   print "Deseja entrar no quarto?"
   resposta = raw_input("S/N?: ").upper()
   if resposta == "S":
     print "Você encontrou a sala de segurança,aqui tem monitores,fitas de vídeo e poeira,nada mais"
   if resposta == "N":
     possibilidades()
     prox_acao = raw_input("Escolha sua próxima ação:").upper()


def frente():
   print "Você avançou no corredor e viu uma porta à esquerda e outra à direita, mas estão a dois passos de distância"
   prox_acao = raw_input("Escolha sua próxima ação:").upper()

def tras():
   print "Você foi para trás"
   print "Escolha sua próxima ação"

def dentro_sala():
   prox_acao = raw_input("Escolha sua próxima ação:").upper()
   if prox_acao == "D":
     print "Você já está dentro da sala!"
     possiblidade = raw_input("Vá para frente, para trás ou para esquerda:").upper()
     if possiblidade == "E":
       print "Você saiu da sala de seguraça."
       poss_acao()
       
     elif possiblidade == "F":
         frente_sala()
     else:
          tras_sala()
   elif prox_acao == "F":
       frente_sala()
   elif prox_acao == "E":
       print "Você saiu da sala de seguraça."
       possibilidades()
   else:
        tras_sala()

def poss_acao():
    prox_acao = raw_input("Escolha sua próxima ação:").upper()
    if prox_acao == "F":
      print "Tem uma porta à esquerda e outra à direita, mas estão a dois passos de distância"
      prox_acao = raw_input("Escolha sua próxima ação:").upper()
    elif prox_acao == "V":
        print " Você voltou a entrada."
    elif prox_acao == "D":
        direita()
        dentro_sala()
    else:
        print "Comando Inválido."



def possibilidades():
    possiblidade = raw_input("Você pode ir para frente, para trás ou para direita:").upper()
    if possiblidade == "F":
      print "Tem uma porta à esquerda e outra à direita, mas estão a dois passos de distância"
    elif possiblidade == "V":
        print " Você voltou a entrada."
    elif possiblidade == "D":
        direita()
        dentro_sala()
    else:
         print "Comando Inválido."

def tras_sala():
    print "Você esbarrou em uma estante cheia de DVDs e fez muito barulho!"
    sair_sala = raw_input("Aperte E para sair da sala! ").upper()
    if sair_sala == "E":
      print "Você saiu da sala de segurança. "
      poss_acao()
    else:
         print "Comando Inválido."
         sair_sala = raw_input("Aperte E para sair da sala! ").upper()
         if sair_sala == "E":
           print "Você saiu da sala de segurança. "
           prox_acao = raw_input("Escolha sua próxima ação:").upper()


def frente_sala():
    print "Você encontrou uma lanterna. Deseja pegá-la? "
    resposta = raw_input("S/N?: ").upper()
    if resposta == "S":
      print " Muito bem! Agora você não terá problemas para enxergar."
      sair_sala = raw_input("Aperte E para sair da sala! ").upper()
      if sair_sala == "E":
        print "Você saiu da sala de segurança. "
    else:
         print "Tudo bem. Veremos se foi uma boa escolha. "
         possiblidade = raw_input("Você pode ir para trás ou para esquerda:").upper()
         if possiblidade == "V":
           tras_sala()
         else:
              print "Você saiu da sala de segurança. "

############## FUNÇÕES ##############################################################################

#/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

############# EXECUÇÃO DO JOGO ######################################################################

def clinica():
   print "Bom dia, você acaba de entrar na clínica Santa Maria. Antes de mais nada quero lhe ensinar os comandos do jogo."
   print "Seu objetivo é encontrar a garota fantasma."
   print "A cada rodada o jogador poderá dar 1 passo e  ir para frente (F), para a direita (D),para a esquerda (E) ou para trás (V)."
   print "Então vamos lá! Você tem um corredor, pode ir para frente para direita ou para esquerda."
   print " Qual caminho gostaria de seguir?"

   answer = raw_input("Após se decidir, digite a letra e aperte 'enter': ").upper()

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
        prox_acao = raw_input("Escolha sua próxima ação:").upper() # ESPECIFICAR AS DIRECOES #
           # SE FOR PRA DIREITA DENTRO DA SALA

        if prox_acao == "D":
          print "Você já está dentro da sala!"
          possiblidade = raw_input("Vá para frente, para trás ou para esquerda:").upper()
             # SE DEPOIS DA DIREITA IR PARA ESQUERDA
          if possiblidade == "E":
            print "Você saiu da sala de seguraça."
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
            print "Você saiu da sala de seguraça."
            possibilidades()
           # SE FOR PARA TRAS DENTRO DA SALA
        else:
            tras_sala()
                    
                   # CONFIGURAR ACAO APOS SAIR DA SALA

   else:
        tras()
        possibilidades()

##########################################################!!!!!!##########################

#outra = raw_input("Então escolha sua próxima ação: ").upper()///if outra == "E"( em baixo do else)




clinica()






"""elif outra == "D":
             print "Movimento não permitido!"
             nova_2 = raw_input("Vá para frente, para trás ou para esquerda:").upper()
             if nova_2 == "E":
             print " Você achou um quadro."
             elif nova_2 == "F":
                    print "Você encontrou duas portas, mas elas estão a dois passos de distância. "# configurar proxima ação
                
                    if resposta == "S":
                      print " Muito bem! Agora você não terá problemas para enxergar."
                      sair_sala = raw_input("Aperte E para sair da sala! ").upper()
                      if sair_sala == "E":
                        print "Você saiu da sala de segurança. "
                    else:
                         print "Tudo bem. O que deseja fazer agora? "
                         nova_2 = raw_input("Vá para frente, para trás ou para esquerda:").upper()
                         if nova_2 == "V":
                           print "Você esbarrou em uma estante cheia de DVDs e fez muito barulho!"
                           sair_sala = raw_input("Aperte E para sair da sala! ").upper()
                           if sair_sala == "E":
                             print "Você saiu da sala de segurança. "
                           else:
                                sair_sala = raw_input("Aperte E para sair da sala! ").upper()
                                if sair_sala == "E":
                                  print "Você saiu da sala de segurança. "


######################################################################################################
# se ele for para a esquerda o que acontece
   elif answer == "E":
    print " Você achou um quadro de uma criança"
    print " Você quer saber mais sobre o quadro?"
        resposta = raw_input("S/N?: ").upper()
        if resposta == "S":
            print "Este é um quadro pintado por uma das criaças que estava internada aqui em 1998"
        else:
            print "Então qual vai ser sua próxima jogada?"
    else:
         print "Você deu um passo para trás"
         print "Ops! Você já está na entrada da clínica."

# o que acontece depois de ir para frente:
   if answer == "F":
      print "Você tem duas portas à frente, porém elas estão a dois passos de distância.."
      print "O que você irá fazer? "


def pt2():
   resposta_nova = raw_input("Escolha sua próxima ação:").upper()
   if resposta_nova == "D":
      print "Você já está dentro da sala!"
      nova_2 = raw_input("Vá para frente, para trás ou para esquerda:").upper()
      if nova_2 == "E":
         print "Você saiu da sala de seguraça."
      elif nova_2 == "F":
         print "Você encontrou uma lanterna. Deseja pegá-la? "
         resposta = raw_input("S/N?: ").upper()
         if resposta == "S":
            print " Muito bem! Agora você não terá problemas para enxergar."
            sair_sala = raw_input("Aperte E para sair da sala! ").upper()
            if sair_sala == "E":
               print "Você saiu da sala de segurança. "
         else:
              print "Tudo bem. O que deseja fazer agora? "
              nova_2 = raw_input("Vá para frente, para trás ou para esquerda:").upper()
              if nova_2 == "V":
                print "Você esbarrou em uma estante cheia de DVDs e fez muito barulho!"
                sair_sala = raw_input("Aperte E para sair da sala! ").upper()
                     if sair_sala == "E":
                       print "Você saiu da sala de segurança. "
      if nova_2 == "V":
        print "Você esbarrou em uma estante cheia de DVDs e fez muito barulho!"
        resposta_nova = raw_input("Escolha sua próxima ação:").upper()
        if resposta_nova == "E":
          print" Você saiu da sala de segurança."
        else:
             sair_sala = raw_input("Aperte E para sair da sala! ").upper()
             if sair_sala == "E":
               print "Você saiu da sala de segurança. "


   elif resposta_nova == "E":
     print "Você saiu da sala de seguraça."

   elif resposta_nova == "F":
     print "Você encontrou uma lanterna. Deseja pegá-la? "
     resposta = raw_input("S/N?: ").upper()
     if resposta == "S":
        print " Muito bem! Agora você não terá problemas para enxergar."
        sair_sala = raw_input("Aperte E para sair da sala! ").upper()
        if sair_sala == "E":
          print "Você saiu da sala de segurança. "
        else:
          print "Tudo bem. O que deseja fazer agora? "
   else:
       print "Você esbarrou em uma estante de DVDs e fez muito barulho! " #V
       sair_sala = raw_input("Aperte E para sair da sala! ").upper()
       if sair_sala == "E":
         print "Você saiu da sala de segurança. "
# O JOGADOR PODE ACHAR UMA LANTERNA DENTRO DA SALA DE SEGURANÇA, MAS DE QUALQUER FORMA ELE SAIRÁ DA SALA.

pt2()
    
def pt3():
# AGORA DEVEMOS MONTAR A OPÇÃO DE AÇÃO DO PERSONAGEM APÓS SAIR DA SALA, E DAR AS OPÇÕES DE CAMINHO(ESQUERDA, DIREITA, FRENTE) LEMBRANDO QUE
# TEM DUAS PORTAS(E,D) A DOIS PASSOS DELE.
   pt3 = raw_input("O que você quer fazer?")


pt3()
clinica()"""




#####################################
# DEVO PADRONIZAR O USO DAS         #
# RAW_INPUT, CADA PARTE VAI TER     #
# A SUA, MESMO QUE FIQUE COM MAIS   #
# INPUTS, FICARA MAIS ORGANIZADO    #
#                                   #
# CADA NIVEL DE ESPAÇO VAZIO TERA   #
# SUA RAW_INPUT                     #
#                                   #
#                                   #
#                                   #
#                                   #
#                                   #
#####################################

*/