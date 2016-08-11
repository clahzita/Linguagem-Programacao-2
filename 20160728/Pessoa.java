public class Pessoa{
    private String nome;
    private String idade;


    public Pessoa(){
    
    }

    public Pessoa(String nome){
        this.nome = nome;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }
    
    public void setIdade(String idade){
        this.idade = idade;
    }

    public String getIdade(){
        return this.idade;
    }


   
}