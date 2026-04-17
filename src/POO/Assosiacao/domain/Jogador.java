package POO.Assosiacao.domain;

public class Jogador {
    private String name;
    private Time time;

    public Jogador(String name, Time time) {
        this.name = name;
        this.time = time;
    }

    public void imprime() {
        System.out.println(this.name);
        if(time != null){
            System.out.println(time.getNome());
        }
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Jogador(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
