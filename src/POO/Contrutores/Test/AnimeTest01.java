package POO.Contrutores.Test;


import POO.Contrutores.Dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece", "Historia e Aventura", 1200, "Shonen", "Mappa");
        anime.imprime();
    }
}
