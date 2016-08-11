public class Aplicacao{
    public static void main (String [] args){
        Pessoa p = new Pessoa();
        Pessoa p1 = new Pessoa();

        p.setNome("Maria");
        p.setIdade("23");


        p1.setNome("Zé");
        p1.setIdade("20");
        

        System.out.println("Nome de p: " + p.getNome());
        System.out.println("Nome de p1: " + p1.getNome());


    }
}