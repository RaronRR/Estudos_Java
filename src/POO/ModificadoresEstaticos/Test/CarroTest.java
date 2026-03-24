package POO.ModificadoresEstaticos.Test;

import POO.ModificadoresEstaticos.Domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes",275 );
        Carro carro3 = new Carro("BYD", 300);


        Carro.setVelocidadeLimite(180);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
