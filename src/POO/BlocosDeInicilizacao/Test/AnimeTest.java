package POO.BlocosDeInicilizacao.Test;

import POO.BlocosDeInicilizacao.Domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
