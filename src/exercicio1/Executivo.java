package exercicio1;

public class Executivo implements Deposito, Transferencia{
    @Override
    public void depositar() {
        System.out.println("Depositando...");
    }

    @Override
    public void transacaoOK() {
        System.out.println("Transacao ok");
    }

    @Override
    public void transacaoNaoOK() {
        System.out.println("Transacao falhada");
    }

    @Override
    public void transferir() {
        System.out.println("Transferindo...");
    }
}
