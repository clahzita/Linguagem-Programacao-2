
/**
 * A classe Tanque instancia objetos que reprensetam um tanque de automóvel.
 * 
 * @author Clarissa Soares 
 * @version 2016.08.05
 */
public class Tanque
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int tamanhoMaximo;
    private int quantidadeCombustivel;

    /**
     * COnstrutor para objetos da classe Tanque
     */
    public Tanque()
    {
       tamanhoMaximo = 50;
       quantidadeCombustivel = 0;
    }

    public Tanque(int tamanhoMaximo)
    {
        setTamanhoMaximo(tamanhoMaximo);
        quantidadeCombustivel = 0;
    }
    
    public void  setTamanhoMaximo(int tamanhoMaximo){
      
       if(tamanhoMaximo >= 30 && tamanhoMaximo <= 60){
           this.tamanhoMaximo = tamanhoMaximo;
       }
    }
    
    public void setQuantidadeCombustivel(int quantidadeCombustivel){
       
       if(quantidadeCombustivel <= tamanhoMaximo){
           this.quantidadeCombustivel = quantidadeCombustivel;
       }else{
           this.quantidadeCombustivel = tamanhoMaximo;
       }
    }
    
    public int  getTamanhoMaximo(){
      
       return tamanhoMaximo;
       
    }
    
    public int getQuantidadeCombustivel(){
       
       return quantidadeCombustivel;
    }
    

}

