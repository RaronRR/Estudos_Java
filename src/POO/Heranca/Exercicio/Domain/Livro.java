package POO.Heranca.Exercicio.Domain;

public class Livro extends ItemBiblioteca {
    private String autor;

    public Livro(int codigo, String titulo, String autor) {
        super(codigo, titulo);
        this.autor = autor;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Nome do autor(a): " + this.autor);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
