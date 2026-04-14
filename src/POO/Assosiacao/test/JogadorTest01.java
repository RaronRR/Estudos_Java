package POO.Assosiacao.test;

import POO.Assosiacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Neymar");
        Jogador jogador3 = new Jogador("Ronaldinho");
        Jogador jogador4 = new Jogador("Messi");

        Jogador[] jogadores ={jogador1, jogador2, jogador3, jogador4};
        for (Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
