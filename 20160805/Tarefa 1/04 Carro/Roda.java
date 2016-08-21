
/**
 * Escreva a descrição da classe Roda aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Roda
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    //private int larguraTranversal; //(em mm): para 13 -> 165/175 para 14-> 185/195
    //private int porcentagemRoda; //(em %) 13->70 14->60
    private int tamanho; //(em polegadas): 13 ou 14
    private int pressaoPneu;// 165/70R13 175/70R13 sem carga 27/29 com 28/30
                            // 185/60R14 195/60R14 sem carga 28/29 com carga 30/31
    /**
     * COnstrutor para objetos da classe Roda
     */
    public Roda()
    {
       tamanho = 14;
       pressaoPneu = 32;
    }

    public Roda(int tamanho)
    {
        setTamanho(tamanho);
        pressaoPneu = 32;
    }
    
    public void  setTamanho(int tamanho){
      
       if(tamanho >= 13 && tamanho <= 20){
           this.tamanho = tamanho;
       }
    }
    
    public void setPressaoPneu(int pressaoPneu){
       
       if(pressaoPneu >= 0 && pressaoPneu <= 50){
           this.pressaoPneu = pressaoPneu;
       }
    }
    
    public int  getTamanho(){
      
       return tamanho;
       
    }
    
    public int getPressaoPneu(){
       
       return pressaoPneu;
       }
}
    

