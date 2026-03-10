package POO.Classes.Teste;

import POO.Classes.Dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Kami";
        professor.idade = 60;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome);


    }
}
