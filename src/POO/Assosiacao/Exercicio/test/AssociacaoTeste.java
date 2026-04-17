package POO.Assosiacao.Exercicio.test;

import POO.Assosiacao.Exercicio.Domain.Aluno;
import POO.Assosiacao.Exercicio.Domain.Local;
import POO.Assosiacao.Exercicio.Domain.Professor;
import POO.Assosiacao.Exercicio.Domain.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Cerejeiras");
        Aluno aluno = new Aluno(19, "Luffy");
        Professor professor = new Professor("Pirata", "Barba Branca");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Onde achar o One Piece", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminario(seminariosDisponiveis);
        professor.imprime();
    }

}
