package POO.Metodos.Test;

import POO.Metodos.Dominio.Estudante;
import POO.Metodos.Dominio.ImprimeEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimeEstudante impressora = new ImprimeEstudante();

        estudante01.nome = "Midorya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 19;
        estudante02.sexo = 'F';

       estudante01.imprime();
       estudante02.imprime();

    }
}
