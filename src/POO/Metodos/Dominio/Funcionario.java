package POO.Metodos.Dominio;

public class Funcionario {
    public String nome;
    public  int idade;
    public double[] salarios;;

    public void imprimiDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario : salarios) {
            System.out.println(salario + " ");
        }

    }

    public void imprimeMediaSalarial(){
        double media = 0;
        for(double salario : salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Media salarial " + media);
     }
}
