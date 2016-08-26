import java.util;
import java.text.NumberFormat;
import java.util.Locale; 


public class Banco{
    private int numeroTotalContas;
    private ArrayList<ContaPoupanca> poupancas;
    private ArrayList<ContaCorrente> correntes;
    private ArrayList<ContaInvestimento> investimentos;


    public Banco(){
        numeroTotalContas = 0;
        poupancas = new ArrayList<ContaPoupanca>();
        correntes = new ArrayList<ContaCorrente>();
        investimentos = new ArrayList<ContaInvestimento>();

    } 

    public int getNumeroTotalContas(){
        return this.numeroTotalContas;
    }

    public void armazenaContaCorrente(ContaCorrente novaconta){
        correntes.add(novaconta);
        numeroTotalContas++;
    }

    public void armazenaContaInvestimento(ContaInvestimento novaconta){
        investimentos.add(novaconta);
        numeroTotalContas++;
    }

    public void armazenaContaPoupanca(ContaPoupanca novaconta){
        poupancas.add(novaconta);
        numeroTotalContas++;
    }

    public void listaContaCorrente(){   
        Locale l = new Locale("pt","BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(l);

        Iterator<ContaCorrente> iter = correntes.iterator();

        for(iter.hasNext()){
            System.out.println( "Numero da Conta: "+iter.next().getNumeroConta()+
            " Saldo: " + nf.format( iter.next().getSaldo() ));
        }

    }

    public void listaPoupanca(){   
        Locale l = new Locale("pt","BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(l);

        Iterator<ContaPoupanca> iter = correntes.iterator();

        for(iter.hasNext()){
            System.out.println( "Numero da Conta: "+iter.next().getNumeroConta()+
            " Saldo: " + nf.format( iter.next().getSaldo() ));
        }

    }

    public void listaContaInvestimento(){   
        Locale l = new Locale("pt","BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(l);

        Iterator<ContaInvestimento> iter = correntes.iterator();

        for( iter.hasNext() ){

            System.out.println( "Numero da Conta: "+iter.next().getNumeroConta()+
            " Saldo: " + nf.format( iter.next().getSaldo() ));
        }

    }

    public void listaTodasContas (String numeroConta, double saldoConta){
        this.listaContaCorrente();
        this.listaPoupanca();
        this.listaContaInvestimento();

    }

}