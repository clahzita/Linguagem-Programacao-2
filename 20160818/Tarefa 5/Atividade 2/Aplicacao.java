public class Aplicacao{
    public static void main(String[] args){
        String s1 = new String();
        String s2 = new String("ab");
        String s3 = new String("abcdefg");

        Processador formatar = new Processador();

        System.out.println(formatar.processar(s1));
        System.out.println(formatar.processar(s2));
        System.out.println(formatar.processar(s3));
    }
}