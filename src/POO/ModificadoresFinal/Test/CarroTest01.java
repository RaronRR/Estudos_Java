package POO.ModificadoresFinal.Test;

import POO.ModificadoresFinal.Domain.Carro;
import POO.ModificadoresFinal.Domain.Comprador;
import POO.ModificadoresFinal.Domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Michael");
        carro.COMPRADOR.setNome("Raron");

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        ferrari.imprime();
    }
}
