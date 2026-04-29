package POO.Enum.Dominio;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    private int valor;


    TipoCliente(String nomeRelatorio, int valor) {
        this.valor = valor;
    }


    TipoCliente(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
