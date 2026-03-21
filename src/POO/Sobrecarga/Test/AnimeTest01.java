package POO.Sobrecarga.Test;

import POO.Sobrecarga.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("One piece", "Manga", 1200, "Shounen");
        anime.imprime();
    }
}
