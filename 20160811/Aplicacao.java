import java.util.Random;
import java.util.ArrayList;
import java.util.HashSet;

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

        HashSet<String> myset = new HashSet<String>();
        HashSet<String> myset1 = new HashSet<String>();

        myset.add("A");
        myset.add("B");
        myset.add("C");
        myset.add("D");
        myset.add("E");
        myset.add("F");

        myset1.add("A8");
        myset1.add("B7");
        myset1.add("C6");
        myset1.add("D5");
        myset1.add("E4");


        for(String element: myset){
            System.out.println(element);
        }
    }
}