import javax.swing.JOptionPane;
import java.util.Random;

public class ContaPoupanca{
    private double saldo;
    private String numeroConta;
    private static int numeroSequencial = 1;
    private boolean primeiroDeposito;


    public ContaPoupanca(){

        this.saldo = 200.0;
        ContaPoupanca.rendimentosMensais();
        
        this.primeiroDeposito = true;

        Random random = new Random();
        this.numeroConta = new String(); 
        this.numeroConta = ""+(numeroSequencial+random.nextInt(1000));
        ContaPoupanca.numeroSequencial+=1%10;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta(){
        return this.numeroConta;
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            if(primeiroDeposito){
                this.rendimentosPromocao();
            }
        }
        else{
            String msg = "Valor de depósito inválido!";
            JOptionPane.showMessageDialog(null,msg); //ver API
        }
    }

    public void sacar(double valor){
        if(valor > 0){
            if(valor <= this.saldo){
                this.saldo -= valor;
            }
            else{
                String msg1 = "Saldo insuficiente.";
                JOptionPane.showMessageDialog(null,msg1); //ver API 
            }
        }
        else{
            String msg2 = "Valor de saque negativo!";
            JOptionPane.showMessageDialog(null,msg2); //ver API

        }
    }

    public void transferir(double valor, ContaPoupanca contaDestino){
        this.depositar(valor);
        contaDestino.sacar(valor);
    }

    private static void rendimentosMensais(){

        this.saldo *= 0.05;

    }

    private void rendimentosPromocao(){

        this.saldo *= 0.02;

    }

    


}