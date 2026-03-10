package POO.Classes.Teste;

import POO.Classes.Dominio.Carros;

public class CarroTest01 {
    public static void main(String[] args) {
        Carros carros = new Carros();
        Carros carros02 = new Carros();

        carros.name = "Corola";
        carros.model = "V2";
        carros.year = 2026;

        System.out.println(carros.name);
        System.out.println(carros.model);
        System.out.println(carros.year);

        System.out.println("-------------");

        carros02.name = "Jeep";
        carros02.model = "4x4";
        carros02.year = 2014;

        System.out.println(carros02.name);
        System.out.println(carros02.model);
        System.out.println(carros02.year);

    }
}
