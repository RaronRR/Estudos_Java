package POO.ModificadoresEstaticos.Domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    /*
    * 0 - Bloco de inicialização é executado quando JVM carregar classe
    * 1 - Aloca o objeto em espaço de memória
    * 2 - Todo atributo é inicializado de forma padrão
    * 3 - Bloco de inicialização em iniciado
    * 4 - Construtor é executado
    * 6 - Caso seja criado mais bloco de inicialização estático, ele ira iniciar em ordem
    * 7 - Também pode ter um bloco de inicialização não estático
    **/
    static {
        System.out.println("dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
    }

    public Anime(){
        for (int episodios : Anime.episodios){
            System.out.print(episodios + " " );
        }
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}
