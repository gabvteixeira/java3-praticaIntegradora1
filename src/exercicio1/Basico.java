package exercicio1;

public class Basico implements Consulta, Pagamento, Saque{
    @Override
    public void consultar() {
        System.out.println("Consultando saldo...");
    }

    @Override
    public void pagar() {
        System.out.println("Pagando...");
    }

    @Override
    public void sacar() {
        System.out.println("Sacando dinheiro...");

    }

    @Override
    public void transacaoOK() {
        System.out.println("Transacao ok");
    }

    @Override
    public void transacaoNaoOK() {
        System.out.println("Transacao falhada");
    }
}
