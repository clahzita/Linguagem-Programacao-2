import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner;

class Aplicacao{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String mensagem = entrada.nextLine(); //nextLine converte Scanner para String
        Mensagem msgUsuario = new Mensagem(mensagem); 

        ArrayList<Mensage> msgRespostas = new ArrayList<Mensage>();

        msgRespostas.add(new Message("Deslique o computador e tire da tomada.")); //travado
        msgRespostas.add(new Message("Verifique se o cabo está conectado.")); //conexão
        msgRespostas.add(new Message("Desconcete o cabo e ligue novamente.")); //mouse

        Analise analisePalavras = new Analise();

        
        String[] arrayPalavras = entrada.nextLine().trim().toLowerCase().split(" ");
        for(String palavra: arrayPalavras){
            System.out.println(palavra);

        }
       
        

    }
}