 
import java.util.Iterator;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Locale;
import java.text.NumberFormat;

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

        while(iter.hasNext()){
            ContaCorrente c = iter.next();
            System.out.println( "Numero da Conta: "+c.getNumeroConta()+
            " Saldo: " + nf.format( c.getSaldo() ));
        }

    }

    public void listaPoupanca(){   
        Locale l = new Locale("pt","BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(l);

        Iterator<ContaPoupanca> iter = poupancas.iterator();

        while(iter.hasNext()){
            ContaPoupanca c = iter.next();
            System.out.println( "Numero da Conta: "+c.getNumeroConta()+
            " Saldo: " + nf.format( c.getSaldo() ));
        }

    }

    public void listaContaInvestimento(){   
        Locale l = new Locale("pt","BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(l);

        Iterator<ContaInvestimento> iter = investimentos.iterator();

        while(iter.hasNext()){
            ContaInvestimento c = iter.next();
            System.out.println( "\nNumero da Conta: "+c.getNumeroConta()+
            " Saldo: " + nf.format( c.getSaldo() )+"\n");
        }

    }

    public void listaTodasContas (String numeroConta, double saldoConta){
        System.out.println("Lista de Todas as Contas Bancárias:");
        this.listaContaCorrente();
        this.listaPoupanca();
        this.listaContaInvestimento();

    }

}