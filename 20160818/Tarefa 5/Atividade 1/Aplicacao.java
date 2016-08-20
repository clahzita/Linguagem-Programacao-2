import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;

public class Aplicacao{
    public static void main(String[] args){
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        produtos.add(new Produto("Feijão",2.5,"04/10/2020"));
        produtos.add(new Produto("Café",1.0,"01/01/2022"));
        produtos.add(new Produto("Beterraba",0.9,"12/11/2017"));


        String impressao = new String();
        for(int i=0; i< produtos.size(); i++){
            
            System.out.printf("%d) %12s %09.2f %s\n", 
                i+1,
                produtos.get(i).getNome(),
                produtos.get(i).getPeso(),
                produtos.get(i).imprimeValidade());
            
        }
        System.out.println();
    }
}