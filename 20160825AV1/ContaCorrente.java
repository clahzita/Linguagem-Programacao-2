import javax.swing.JOptionPane;
import java.util.Random;

public class ContaCorrente{
    private double saldo;
    private String numeroConta;
    private int numeroSequencial = 1;

    public ContaCorrente(){
        saldo = 0.0;

        Random random = new Random();
        numeroConta = new String(); 
        numeroConta = ""+numeroSequencial+random.nextInt(1000);
        numeroSequencial++;
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

    public void transferir(double valor, ContaCorrente contaDestino){
        this.depositar(valor);
        contaDestino.sacar(valor);
    }

    public double calcularSaldo(){
        return this.saldo * 1.05;
    } 


}