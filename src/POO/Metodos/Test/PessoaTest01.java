package POO.Metodos.Test;

import POO.Metodos.Dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Raron");
        pessoa.setIdade(17);

        pessoa.imprime();
    }
}
