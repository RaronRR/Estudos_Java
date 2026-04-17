package POO.Heranca.Domain;

public class Pessoa {
    protected String name;
    protected String cfp;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do Static");
    }

    {
        System.out.println("Dentro de um bloco de inicialização Pessoa");
    }

    public Pessoa(String name) {
        System.out.println("Dentro do Construtor de Pessoa");
        this.name = name;
    }


    public void imrprime() {
        System.out.println(this.name);
        System.out.println(this.cfp);
        System.out.println(this.endereco.getRua() + "" + this.endereco.getCep());
    }

    public String getCfp() {
        return cfp;
    }

    public void setCfp(String cfp) {
        this.cfp = cfp;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
