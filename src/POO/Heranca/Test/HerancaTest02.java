package POO.Heranca.Test;

import POO.Heranca.Domain.Endereco;
import POO.Heranca.Domain.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Akira Toriama");
        Endereco endereco = new Endereco();
        endereco.setRua("Rua São Paulo");
        endereco.setCep("000000-00");
        funcionario.setEndereco(endereco);
        funcionario.setCfp("000.000.000.00");
        funcionario.setSalario(100000);
        funcionario.imprime();

    }
}
