package POO.BlocosDeInicilizacao.Domain;

public class Anime {
    private String nome;
    private int[] episodios;
    // O bloco de inicialização (de intacia/ não estatico) sera execultado toda vez que criar
    // um nova instancia de um objeto
    /* 1 - aloca espaço na memoria
       2 - cada atributo e inicializado em valores pradrões
       3 - Bloco de inicialização e execultado
       4 - Cronstrutores é execultado
    */

    {
        System.out.println("dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
    }

    public Anime(){
        for (int episodios : this.episodios){
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
