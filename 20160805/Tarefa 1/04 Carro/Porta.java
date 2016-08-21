
/**
 * A classe Porta trata do objeto porta, em que identifica seu estado (aberta ou fechada).
 * 
 * @author Clarissa Alves Soares
 * @version 2016.08.05
 */
public class Porta
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private boolean aberta;

    /**
     * COnstrutor para objetos da classe Porta
     */
    public Porta()
    {
        aberta = false;//inicialmente, a porta está fechada.
    }

    /**
     * Ação de abrir e fechar a porta. Se aberta está true significa que a porta está aberta,
     * se está false, a porta está fechada.
     * 
     */
    public void setPorta()
    {
       if(aberta){
           aberta = false;
       }
       else{
           aberta = true;
       }
    }
    
    public boolean getPorta(){
        return aberta;
    }
}
