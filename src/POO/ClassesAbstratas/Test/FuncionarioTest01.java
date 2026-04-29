package POO.ClassesAbstratas.Test;

import POO.ClassesAbstratas.Dominio.Desenvolvedor;
import POO.ClassesAbstratas.Dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Name", 500);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Sanji", 1000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
