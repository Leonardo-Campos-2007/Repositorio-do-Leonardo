public class testeReferencia {
    public static void main(String[] args) {
        Conta primeirConta = new Conta();
        primeirConta.saldo = 300;
        System.out.println("Saldo da primeira conta eh " + primeirConta.saldo + " reais");

        Conta segundaConta = new Conta();
        segundaConta.saldo = 100;

        System.out.println("Saldo da sengunda conta eh " + segundaConta.saldo + "reais");

        segundaConta.saldo += 100;
        System.out.println("Saldo da segunda conta apos o deposito vai ficar " + segundaConta.saldo + " reais");

        System.out.println("Saldo  da primeira conta vai ficar " + primeirConta.saldo + " reais");

        if(primeirConta == segundaConta){
            System.out.println("Sãoa mesma conta ");
            
            }else{
                System.out.println("São contas diferentes");
        }

        System.out.println(primeirConta);
        System.out.println(segundaConta);
    }

}
