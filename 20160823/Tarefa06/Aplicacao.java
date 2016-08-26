import javax.swing.JOptionPane;


public class Aplicacao{

    public static void main(String[] args){

        Usuario user1 = new Usuario("Ana","06570555444");
        Usuario user2 = new Usuario("Felipe","00855412466");

        Produto prod1 = new Produto("grampeador","papelaria",20,4.50);
        Produto prod2 = new Produto("teclado","informática",5,5.90);
        Produto prod3 = new Produto("mesa","mobilia",10,150.99);

        Estoque estoque = new Estoque();

        estoque.addProduto(prod1);
        estoque.addProduto(prod2);
        estoque.addProduto(prod3);

        estoque.listProdutos();

        estoque.solicitarProduto(user1,prod1,10);
        estoque.solicitarProduto(user2,prod2,10);

        estoque.listProdutos();
        estoque.listSolicitacoes();

        estoque.buscarProdutos("mesa");
        estoque.buscarProdutos("cadeira");
       
       
    }

}