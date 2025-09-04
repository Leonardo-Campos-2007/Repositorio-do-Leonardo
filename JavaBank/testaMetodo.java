import java.util.Scanner;

public class testaMetodo {

public static void main(String[] args) {
    Conta contadoleo = new Conta();

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor que voce tem na conta: ");
    double valor = scanner.nextDouble();
    contadoleo.saldo = valor;

   // System.out.print("Quanto voce deseja sacar? ");
    //double saque = scanner.nextDouble();
    //contadoleo.saca(saque);
    
    System.out.println(contadoleo.saldo);

    Conta contadaLaura = new Conta();
    contadaLaura.saldo = 1000;

    System.out.println("Conta da Laura antes da transferencia: " + contadaLaura.saldo);
    System.out.println("Conta do Leonardo antes da transferencia: " + contadoleo.saldo);

    contadaLaura.transfere(500, contadoleo);

    System.out.println("Conta da Laura depois da transferemncia :" + contadaLaura.saldo);
    System.out.println("Conta do Leonardo depois da transferencia : " + contadoleo.saldo);
    
    
    


    
}
    
}
