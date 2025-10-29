public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;

    void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            System.out.println("saldo insuficiente");
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            System.out.println("Transferencia feita com sucesso");
             return true;
        }
        else{
            System.out.println("Saldo insuficiente para a transferencia");
            return false;
        }

    }

}
