package POO.Heranca.Domain;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do Static Funcionario");
    }

    {
        System.out.println("Dentro de um bloco de inicialização Funcionario");
    }
    {
        System.out.println("Dentro de um bloco de inicialização Funcionario02");
    }


    public Funcionario(String name) {
        super(name);
        System.out.println("Dentro do Construtor do Funcionario ");
    }


    public void imprime() {
        super.imrprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu" + this.name + "recebir" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
