import java.util.Random;
import java.util.ArrayList;

class Aplicacao{
    public static void main(String[] args){
        Random randomGenerator = new Random();

        ArrayList<Message> mensagens = new ArrayList<Message>();

        mensagens.add(new Message("Felicidade, quando passa, dói."));
        mensagens.add(new Message("Tristeza, quando dói, passa."));
        mensagens.add(new Message("É tudo uma questão de tempo."));
        mensagens.add(new Message("Morte, quando chega, mata"));
        mensagens.add(new Message("Vida, quando vem, mata"));


        int index = randomGenerator.nextInt(mensagens.size());
        System.out.println(mensagens.get(index).getText());

    }
}