import java.time.LocalDate;


public class Solicitacao{
    private Usuario usuario;
    private Produto produto;
    private int quantidade;
    private LocalDate dataSolicitacao;

    public Solicitacao(Usuario usuario, Produto produto, int quantidade){
        this.usuario = new Usuario();
        this.usuario = usuario;
        this.produto = produto;
        this.produto.setQuantidade(quantidade);
        this.dataSolicitacao = LocalDate.now();
    }

    public String getUsuario(){
        return usuario.getNome();
    }

    public String getProduto(){
        return produto.getNome();
    }

    public void imprimir(){
        System.out.println("Usuario: "+this.usuario.getNome()+" CPF: "+usuario.getCpf());
        System.out.println("Produto : \n");
        this.produto.imprimir();
        System.out.println("Solicitado em: "+this.dataSolicitacao.toString());
    }
}