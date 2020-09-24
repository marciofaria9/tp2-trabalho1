package br.edu.univas.main;
import java.util.Scanner;

public class jogo_da_velha {
static int tamanhoTabuleiro = 3;
	
	public static void main(String[] args) {	
		Scanner leitura = new Scanner(System.in);
			
		String tabuleiro[][] = {
								{"1a","1b","1c"},
								{"2a","2b","2c"},
								{"3a","3b","3c"} 			                             };
		
		instrucao(tabuleiro);
			    
	   System.out.println("Digite o nome do player 1:");
	   String player1 = leitura.nextLine();
	   System.out.println("Sua letra será X");
	   System.out.println();
	   System.out.println("Digite o nome do player 2:");
	   String player2 = leitura.nextLine();
	   System.out.println("Sua letra será O");
	   System.out.println();
		
	   int contadorDeJogadas = 0;
	   int l = 0;
	   String c = "";
	   
		do {
			
			if (contadorDeJogadas % 2 == 0) {
				System.out.println("Vez do "+ player1 );
				System.out.println("Digite a linha:");
				l = leitura.nextInt();
				System.out.println("Digite a coluna");
				leitura.nextLine();
				c = leitura.nextLine();
				
				if (c.equals("a")) {
				tabuleiro[l-1][0] = "X";	
				desenharTabuleiro(tabuleiro);
				
			    if (verificaVencedor(tabuleiro) ) {
			    	imprimeVencedor(contadorDeJogadas, player1,player2);	
					break;
			    	}				
				}
							
				else if (c.equals("b")) {
					tabuleiro[l-1][1] = "X";	
					desenharTabuleiro(tabuleiro);						
					
					if (verificaVencedor(tabuleiro) ) {
				    	imprimeVencedor(contadorDeJogadas, player1,player2);	
				    	break;	
					}				
				}
				
				else if (c.equals("c")) {
					tabuleiro[l-1][2] = "X";
					desenharTabuleiro(tabuleiro);
					
					if (verificaVencedor(tabuleiro) ) {
				    	imprimeVencedor(contadorDeJogadas, player1,player2);	
				    	break;
					}				
				}
				
				
				contadorDeJogadas++;
			}
			else if (contadorDeJogadas % 2 == 1 ) {
				System.out.println("Vez do "+ player2 );
				System.out.println("Digite a linha:");
				l = leitura.nextInt();
				System.out.println("Digite a coluna");
				leitura.nextLine();
				c = leitura.nextLine();	
				
				if (c.equals("a")) {
					tabuleiro[l-1][0] = "O";	
					desenharTabuleiro(tabuleiro);
					
					if (verificaVencedor(tabuleiro) ) {
				    	imprimeVencedor(contadorDeJogadas, player1,player2);	
				    	break;
					}				
				}
				
					else if (c.equals("b")) {
						tabuleiro[l-1][1] = "O";
						desenharTabuleiro(tabuleiro);
						
						if (verificaVencedor(tabuleiro) ) {
					    	imprimeVencedor(contadorDeJogadas, player1,player2);	
					    	break;
						}									
					}
				
					else if (c.equals("c")) {
						tabuleiro[l-1][2] = "O";
						desenharTabuleiro(tabuleiro);
						
						if (verificaVencedor(tabuleiro) ) {
					    	imprimeVencedor(contadorDeJogadas, player1,player2);	
					    	break;
						}				
					}			
				contadorDeJogadas++;
			
			}
			
			
		
		} while (contadorDeJogadas <= 8);
		
		if (contadorDeJogadas == 9 && verificaVencedor(tabuleiro) == false) {
			System.out.println("Deu velha!");
		}
	
	leitura.close();
	}
	
	public static void desenharTabuleiro(String tabuleiro[][]) {
		
		System.out.println("-------------------");	
				
		for (int l = 0; l < tamanhoTabuleiro; l++) {
			
			for ( int c = 0; c < tamanhoTabuleiro; c++) {
				System.out.print("|  " + tabuleiro [l][c] + " " );
		
				
			}
			System.out.print("|");
			System.out.println("");
			System.out.println("-------------------");	
							
		}	
		
	}
	
	public static void instrucao (String[][] tabuleiro){
		
		System.out.println("Jogo da Velha X/0");
	
		System.out.println("-------------------");	
		
		for (int l = 0; l < tamanhoTabuleiro; l++) {
			
			for ( int c = 0; c < tamanhoTabuleiro; c++) {
				System.out.print("|  " + tabuleiro [l][c] + " " );
				
			}
			System.out.print("|");
			System.out.println("");
			System.out.println("-------------------");	
			
		}
		
		
		System.out.println();
		System.out.println("Para realizar a sua jogada, digite primeiro a posição da linha, e depois da coluna que deseja! ");
		System.out.println("Bom jogo!");
		System.out.println();
		
	}

public static boolean verificaVencedor(String[][] tabuleiro) {
	
	     for (int i = 0; i < tamanhoTabuleiro; i ++) {
	 
			
			if (tabuleiro[i][0].equals("X") && tabuleiro[i][1].equals("X") && tabuleiro[i][2].equals("X") ) {		
				
				return true;			
			}
			
			else if (tabuleiro[0][i].equals("X") && tabuleiro[1][i].equals("X") && tabuleiro[2][i].equals("X") ) {
				return true;
			}
					
			
			
			if (tabuleiro[i][0].equals("O") && tabuleiro[i][1].equals("O") && tabuleiro[i][2].equals("O") ) {		
				
				return true;
				
			}
			
			else if (tabuleiro[0][i].equals("O") && tabuleiro[1][i].equals("O") && tabuleiro[2][i].equals("O") ) {
				return true;
			}  
		
		
	     }

	     if(tabuleiro[0][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][2].equals("X")) {
				return true;
			}
			
			else if(tabuleiro[0][2].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][0].equals("X")) {
				return true;

			}
	    
	     if(tabuleiro[0][0].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][2].equals("O")) {
				return true;
			}
			
			else if(tabuleiro[0][2].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][0].equals("O")) {
				return true;

			}
       return false;
       
	}


public static void imprimeVencedor(int contadorDeJogadas, String player1, String player2) {
	if (contadorDeJogadas % 2 == 0 ) {
		System.out.println(player1 + " venceu!" );
	
	}
	
	else if(contadorDeJogadas % 2 == 1) {
		System.out.println(player2 + " venceu!" );
	}
	
	
	}
}
	


