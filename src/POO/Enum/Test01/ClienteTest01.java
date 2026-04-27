package POO.Enum.Test01;

import POO.Enum.Dominio.Cliente;
import POO.Enum.Dominio.TipoCliente;
import POO.Enum.Dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(1000));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(1000));


    }
}
