package POO.Assosiacao.Exercicio.Domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor(String especialidade, String nome) {
        this.especialidade = especialidade;
        this.nome = nome;
    }

    public Professor(String especialidade, String nome, Seminario[] seminario) {
        this.especialidade = especialidade;
        this.nome = nome;
        this.seminario = seminario;
    }

    public void imprime() {
        System.out.println("-------------");
        System.out.println("Professor" + this.nome);
        if (this.seminario == null) return;
        System.out.println("## Seminario cadastrado ##");
        for (Seminario seminario : this.seminario) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAluno()) {
                System.out.println("Aluno:" + aluno.getNome());
            }

        }

    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
