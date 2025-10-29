public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;

        System.out.println("O saldo da primeira conta eh : "+ primeiraConta.saldo + " reais");

        primeiraConta.saldo += 100;
        System.out.println("O saldo da primeira conta apos o deposito eh  : " + primeiraConta.saldo + " reais");

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
    }
}
