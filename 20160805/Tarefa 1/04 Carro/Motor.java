
/**
 * Escreva a descrição da classe Motor aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Motor
{
    private String tipoDeCombustivel;
    private String cilindrada;
    private boolean ligado;

    /**
     * COnstrutor para objetos da classe Motor
     */
    public Motor()
    {
        tipoDeCombustivel = "gasolina";
        cilindrada = "1.0";
        ligado = false;
    }
    
    public Motor(String tipoDeCombustivel, String cilindrada)
    {
        setTipoDeCombustivel(tipoDeCombustivel);
        setCilindrada(cilindrada);
        ligado = false;
    }
    
    public void setTipoDeCombustivel(String tipoDeCombustivel){
       String tipo = tipoDeCombustivel.toLowerCase();
       if(tipo == "flex" || tipo == "gasolina" || tipo == "alcool"){
           this.tipoDeCombustivel = tipoDeCombustivel;
       }
    }
    
    public void setCilindrada(String cilindrada){
       String tipo = cilindrada.toLowerCase();
       if(tipo == "1.0" || tipo == "1.4" || tipo == "1.6"){
           this.cilindrada = cilindrada;
       }
    }
    
    public String getTipoDeCombustivel(){
        
        return tipoDeCombustivel;      
    }
    
    public String getCilindrada(){
       
        return cilindrada;  
    }
    
    public boolean getLigado(){
       
        return ligado;  
    }
    
    public void ligar(){
        ligado = true;
    }
    
     public void desligar(){
        ligado = false;
    }
}
