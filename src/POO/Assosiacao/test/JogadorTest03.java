package POO.Assosiacao.test;

import POO.Assosiacao.domain.Jogador;
import POO.Assosiacao.domain.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pele");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("---------jogador-------");
        jogador.imprime();
        System.out.println("-----------time--------");
        time.imprime();

    }
}
