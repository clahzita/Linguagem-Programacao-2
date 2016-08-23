import java.util.Random;
import java.time.LocalTime;

public class Produto{
    private String nome;
    private String codigoProduto;
    private int quantidade;
    private double preco;
    private LocalTime hora;

    public Produto(String nome, String codigoProduto, int quantidade, double preco){
        this.nome = nome;
        Random random = new Random();
        this.codigoProduto = "PROD-"+"-"+codigoProduto+"-"+ random.nextInt(999);
        this.quantidade = quantidade;
        this.preco = preco;
        this.hora = LocalTime.now();
    }   

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public void setPreco(double quantidade){
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }

    public String getCodigoProduto(){
        return codigoProduto;
    }

    public String getHora(){
        return this.hora.toString();
    }

    


}