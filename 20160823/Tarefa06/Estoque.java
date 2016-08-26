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
        System.out.println(" LISTA DE PRODUTOS EM ESTOQUE ");
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
        System.out.println(" LISTA DE SOLICITAÇÕES ");
        for(Solicitacao solicitacao: solicitacoes){
            solicitacao.imprimir();
        }
        System.out.println("Total de Solicitações: "+solicitacoes.size());
    }

    public void buscarProdutos(String nomeProduto){
        
        Boolean encontrado = false;

        Iterator<Produto> it = produtos.iterator();
        
        Locale l = new Locale("pt","BR");
        NumberFormat real = NumberFormat.getCurrencyInstance(l);
        
        while (it.hasNext()) {
            Produto iter = it.next();
            if( nomeProduto.equals( iter.getNome() ) ){ 
                String msg = "Produto "+iter.getNome()+" encontrado! \nCód:"+iter.getCodigoProduto()+
                                "\n Valor: "+iter.getPreco()+" Qtde: "+iter.getQuantidade();
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