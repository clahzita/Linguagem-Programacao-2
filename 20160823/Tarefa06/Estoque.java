import java.util.Iterator;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Locale;
import java.text.NumberFormat;

public class Estoque{
    private ArrayList<Produto> produtos;
    private ArrayList<Solicitacao> solicitacoes;


    public Estoque(){
        produtos = new ArrayList<Produto>();
        solicitacoes = new ArrayList<Solicitacao>();
    }



    public void addProduto(Produto produto){
        if(produto.getQuantidade() > 0){
            produtos.add(produto);
        }
        else{
            String msg = "Produto "+ produto.getNome() +" com quantidade inválida.";
            JOptionPane.showMessageDialog(null, msg); 
        }
        
    }

    public void removeProduto(Produto produto){

        produtos.remove(produto);
    }
    
    public void listProdutos(){
        for(Produto produto: produtos){
            produto.imprimir();
        }
    }

    public void solicitarProduto(Usuario usuario, Produto produtoSolicitado, int quantidade){
        if( produtos.contains(produtoSolicitado) &&
                produtos.get(produtos.indexOf(produtoSolicitado)).getQuantidade() > 0 &&
                        produtos.get(produtos.indexOf(produtoSolicitado)).getQuantidade()-quantidade >= 0 ){
            //atualiza valor de quantidade do produto solicitado no estoque
            produtos.get(produtos.indexOf(produtoSolicitado)).setQuantidade( 
                produtos.get(produtos.indexOf(produtoSolicitado)).getQuantidade() - quantidade );
            //Adciona Solictação ana lista de Solicitaçoes
            solicitacoes.add( new Solicitacao(usuario,produtoSolicitado,quantidade) );
        }
        else{      

            String msg = "Produto "+produtoSolicitado.getNome()+" não existe no estoque ou não tem estoque disponível.";
            JOptionPane.showMessageDialog(null, msg);
        }
    }

    public void listSolicitacoes(){
        for(Solicitacao solicitacao: solicitacoes){
            solicitacao.imprimir();
        }
        System.out.println("Total de Solicitações: "+solicitacoes.size());
    }

    public void buscarProdutos(String nomeProduto){
        Iterator<Produto> it = produtos.iterator();
        Boolean encontrado = false;
        
        Locale l = new Locale("pt","BR");
        NumberFormat real = NumberFormat.getCurrencyInstance(l);

        while (it.hasNext()) {
            if( nomeProduto.equals( it.next().getNome() ) ){
                
                String msg = "Informações sobre o Produto: "+it.next().getCodigoProduto()+
                           "\n Nome: "+ it.next().getNome()+" Qtde: "+it.next().getQuantidade()+"\nPreço: "+ real.format(it.next().getPreco());
                
                JOptionPane.showMessageDialog(null, msg);
                
                encontrado = true;
                    
            }
        }
        
        if(!encontrado){
            String msg = "Produto "+nomeProduto+" não encontrado";
            JOptionPane.showMessageDialog(null, msg);
        }
    }

    
}