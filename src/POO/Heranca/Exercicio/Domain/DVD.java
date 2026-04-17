package POO.Heranca.Exercicio.Domain;

public class DVD extends ItemBiblioteca {
    private int duracao;

    public DVD(int codigo, String titulo, int duracao) {
        super(codigo, titulo);
        this.duracao = duracao;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Duração: " + this.duracao);
    }
}
