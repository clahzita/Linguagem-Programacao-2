
/**
 * Escreva a descrição da classe Credit aqui.
 * 
 * @author Clarissa Alves Soares
 * @version v. 0.1 20160802
 */
public class Credit
{
    // variáveis de instância
    private int saldoemcentavos;
    /**
     * COnstrutor para objetos da classe Credit
     */
    public Credit()
    {
        // inicializa variáveis de instância
        saldoemcentavos = 1000;
    }
    
    public Credit(int creditoInicial){
        if(creditoInicial > 0){
            saldoemcentavos = creditoInicial;
        }
        else{
             System.out.println("Você inseriu um valor de inicial negativo: " + creditoInicial);
             saldoemcentavos = 0;
             System.out.println("Seu saldo foi iniciado com 0 centavos de crédito.");
        }
    
    
    }

    /**
     * Método de Acesso que devolve o montante de crédito na conta do usuário
     * 
     * @return     o montante de crédito na conta do usuário 
     */
    public int getSaldoEmCentavos()
    {
        return saldoemcentavos;
    }
    /**
     * Método Modificador que faz alteração em valores de um atributo da classe de maneira protegida.
     * 
     * @param  saldoemcentavos   valor a ser inicializado no campo saldoemcentavos
     */
    public void setSaldoEmCentavos(int saldoemcentavos) {
        if(saldoemcentavos >= 0){
            this.saldoemcentavos = saldoemcentavos;
        }
        else{
             System.out.println("Você inseriu um valor de inicial negativo: " + saldoemcentavos);
             this.saldoemcentavos = 0;
             System.out.println("Seu saldo foi iniciado com 0 centavos de crédito.");
        }
    }
    
    public void topUp(int entrada){
        if(entrada > 0){
            setSaldoEmCentavos(saldoemcentavos+entrada);
        }
        else{
            System.out.println("Você inseriu um valor de recarga negativo: " + entrada);
        }
    }
    
    public void topDown(int saida){
        if(saida >=0){        
            if(saldoemcentavos - saida >= 0){
                setSaldoEmCentavos(saldoemcentavos-saida);
            }
            else{
                System.out.println("Você não tem crédito suficiente para efetuar esta operação.");
            }
        }
        else{
            System.out.println("Falha! Valor de saída negativo: " + saida);
        }
    
    }
}
