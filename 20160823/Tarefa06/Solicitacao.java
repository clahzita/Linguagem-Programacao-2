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
        this.quantidade = quantidade;
        this.dataSolicitacao = LocalDate.now();
    }

    public String getUsuario(){
        return usuario.getNome();
    }

    public String getProduto{
        return produto.getNome();
    }
}