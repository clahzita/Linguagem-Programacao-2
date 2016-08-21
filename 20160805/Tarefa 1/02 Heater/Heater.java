
/**
 * Escreva a descrição da classe Heater aqui.
 * 
 * @author Clarissa Alves Soares
 * @version 20160802
 */
public class Heater
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int temperature;
    private int max;
    private int min;
    private int increment;

    /**
     * COnstrutor para objetos da classe Heater
     */
    public Heater(int max, int min)
    {
        temperature = 15;
        this.min = min;
        this.max = max;
        increment = 5;
    }
    
    /**
     * Método de acesso que retorna o valor de temperature
     * 
     * @return     o valor de temperature
     */
    public int getTemperature()
    {
        return temperature;
    }
    
    public void setIncrement(int increment){
        if(increment > 0){
            this.increment = increment;
        }
        else{
            System.out.println("Valor de increment deve ser maior que zero.");
        }
    }
    /**
     * Método que altera o valor de temperatura para cima.
     */
        public void warmer()
    {
        if((temperature + increment) <= max){
            temperature = temperature + increment;
        }
        else{
            temperature = max;
            System.out.println("Temperatura máxima atingida!");
        }
    }
    
    /**
     * Método que altera o valor de temperatura para baixo
     * 
     */
    public void cooler()
    {
        if((temperature - increment) >= min){
            temperature = temperature - increment;
        }
        else{
            temperature = min;
            System.out.println("Temperatura mínima atingida!");
        }
    }
}
