package POO.Assosiacao.test;

import POO.Assosiacao.domain.Jogador;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Jogador jogador = new Jogador(input.nextLine());

        jogador.imprime();
    }
}
