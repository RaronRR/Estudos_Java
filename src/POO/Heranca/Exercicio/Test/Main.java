package POO.Heranca.Exercicio.Test;

import POO.Heranca.Exercicio.Domain.DVD;
import POO.Heranca.Exercicio.Domain.Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro(1, "Entendendo algoritmos", "Aditya Y. Bhargava");
        DVD dvd = new DVD(1001, "Interestelar", 120 );

        livro.exibirDetalhes();
        System.out.println("----------");
        dvd.exibirDetalhes();
    }
}
