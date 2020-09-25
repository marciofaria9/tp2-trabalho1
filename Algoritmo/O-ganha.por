programa {
inclua biblioteca Util
funcao inicio() { //algoritmo para reproduzir o Jogo da Velha

caracter tabuleiro [3][3] = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}}
 

fazerJogada(1, 1, 'X', tabuleiro) 
fazerJogada(0, 2, 'O', tabuleiro) 
fazerJogada(2, 2, 'X', tabuleiro) 
fazerJogada(0, 0, 'O', tabuleiro)
fazerJogada(1, 2, 'X', tabuleiro)
fazerJogada(0, 1, 'O', tabuleiro)

}

funcao fazerJogada(inteiro linha, inteiro coluna, caracter jogada,
caracter tabuleiro[][]) {
inteiro cont = 0
tabuleiro[linha][coluna] = jogada
imprimeTabuleiro(tabuleiro)
cont++
verificaVencedor(tabuleiro,cont)

}
funcao imprimeTabuleiro(caracter tabuleiro[][]) {
limpa()
escreva(tabuleiro[0][0], " | ", tabuleiro[0][1], " | ", tabuleiro[0][2], '\n')
escreva("--+---+---\n")
escreva(tabuleiro[1][0], " | ", tabuleiro[1][1], " | ", tabuleiro[1][2], '\n')
escreva("--+---+---\n")
escreva(tabuleiro[2][0], " | ", tabuleiro[2][1], " | ", tabuleiro[2][2], '\n')

Util.aguarde(1500)
}

funcao verificaVencedor(caracter tabuleiro[][], inteiro cont){
    para (inteiro i = 0; i < 3; i++){
        
        se (tabuleiro[0][i]=='X' e tabuleiro[1][i]=='X' e tabuleiro[2][i]=='X' ) {
            escreva("X venceu!\n")
        }
       se (tabuleiro[i][0]=='X' e tabuleiro[i][1]=='X' e tabuleiro[i][2]=='X' ) {
           escreva("X venceu!\n") 
       }
       
       se (tabuleiro[0][i]=='O' e tabuleiro[1][i]=='O' e tabuleiro[2][i]=='O' ) {
            escreva("O venceu!\n")
        }
       se (tabuleiro[i][0]=='O' e tabuleiro[i][1]=='O' e tabuleiro[i][2]=='O' ) {
           escreva("O venceu!\n") 
        }
        
       se (tabuleiro[0][0]=='X' e tabuleiro[1][1]=='X' e tabuleiro[2][2]=='X' ) {
            escreva("O venceu!\n") 
       }
    
       se (tabuleiro[2][0]=='X' e tabuleiro[1][1]=='X' e tabuleiro[0][2]=='X' ) {
            escreva("X venceu!\n") 
       }
       se (tabuleiro[0][0]=='O' e tabuleiro[1][1]=='O'e tabuleiro[2][2]=='O' ) {
            escreva("O venceu!\n") 
       }
    
       se (tabuleiro[2][0]=='O' e tabuleiro[1][1]=='O' e tabuleiro[0][2]=='O' ) {
            escreva("O venceu!\n") 
       } 
        
    }
 se (cont ==9){
     escreva("Deu velha\n")
 }
    }

}