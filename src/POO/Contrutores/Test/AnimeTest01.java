package POO.Contrutores.Test;


import POO.Contrutores.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("One piece", "Manga", 1200, "Shounen");
        anime.imprime();
    }
}
