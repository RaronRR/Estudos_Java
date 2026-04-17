package POO.Heranca.Test;

import POO.Heranca.Domain.Endereco;
import POO.Heranca.Domain.Funcionario;
import POO.Heranca.Domain.Pessoa;

public class herancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua São paulo");
        endereco.setCep("11111-111");

        Pessoa pessoa = new Pessoa("Raron Rocha");
        pessoa.setCfp("777777777-77");
        pessoa.setEndereco(endereco);

        pessoa.imrprime();
        System.out.println("--------------------");
        Funcionario funcionario = new Funcionario("Oda Sense");
        funcionario.setCfp("102524100");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(100000.00);
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
