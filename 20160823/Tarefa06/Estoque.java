import java.util.ArrayList;

public class Estoque{
    private ArrayList<Produto> produtos;
    private ArrayList<Solicitacao> solicitacoes;

    public void addProduto(Produto produto){
        if(produto.getQuantidade() > 0){
            produtos.add(produto);
        }
        else{
            String msg = "Produto "+ produto.getNome() +" com quantidade inválida."
            JOptionPane.showMessageDialog(null, msg); 
        }
        
    }

    public void removeProduto(Produto produto){

        produtos.remove(produto);
    }
    
    public void listProdutos(){
        for(int i = 0; i < produtos.size(); i++){
            System.out.printf("%s\nNome: %s Qtde: %d Valor: R$ %.2f\nHora Entrada: %s",
                    produtos.get(i).getCodigoProduto(),
                    produtos.get(i).getNome(),
                    produtos.get(i).getQuantidade(),
                    produtos.get(i).getPreco(),
                    produtos.get(i).getHora()
                    );
        }
    }

    public solicitarProduto(Usuario usuario, Produto produto){

    }

    
}