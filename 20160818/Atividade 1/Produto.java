import java.util.Date;

public class Produto{
    private String nome;
    private double peso;
    private Date validade;

    public Produto(String nome, double peso, Date validade){
        this.nome = nome;
        this.peso = peso;
        validade = new Date();
        this.validade = validade;    
    }
}