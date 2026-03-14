package POO.Metodos.Test;

import POO.Metodos.Dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Francsico Raron da Silva Rocha";
        funcionario.idade = 19;
        funcionario.salarios = new double[]{1200,988,2000};
        funcionario.imprimiDados();
        funcionario.imprimeMediaSalarial();
    }
}
