import java.util.Scanner;

public class Produtos {

    public String produto;
    public float valor;
    public int quantidadeproduto;

    public Produtos(String produto, float valor, int quantidadeproduto){

        this.produto = produto;
        this.valor = valor;
        this.quantidadeproduto = quantidadeproduto;
    }

    public void cadastrarProduto(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        produto = scan.nextLine();

        System.out.println("Qual o valor do produto: ");
        valor = scan.nextFloat();

        System.out.println("Digite a quantidade vendida");
        





       

    }
    
}
