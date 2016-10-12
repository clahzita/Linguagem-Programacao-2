package projetoexemploswing.Dominio;

/**
 *
 * @author clah
 */
public class Autor {
    private String nome;
    private String cpf;
    

    public Autor() {
    }

    public Autor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
