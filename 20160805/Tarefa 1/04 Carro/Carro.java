
/**
 * Escreva a descrição da classe Carro aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Carro
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Roda[] rodas;
    private Motor motor;
    private Porta[] portas;
    private Tanque tanque;

    /**
     * COnstrutor para objetos da classe Carro
     */
    public Carro()
    {
        rodas = new Roda[4];
        for(int i=0; i<4;i++){
            rodas[i]=new Roda();
        }
        motor = new Motor();
        portas = new Porta[2];
            portas[0] = new Porta();
            portas[1] = new Porta();
        tanque = new Tanque();;
    }
    
    public Carro(String tipoDeCombustivel, String cilindrada,int tamanhoRoda, int tamanhoTanque, int qtdePortas)
    {
        motor = new Motor(tipoDeCombustivel,cilindrada);
        setRodas(rodas,tamanhoRoda);
        setPortas(portas,qtdePortas);  
        tanque = new Tanque(tamanhoTanque);
    }
    
    private void setPortas(Porta[] portas, int qtdePortas){
        portas = new Porta[qtdePortas];
        if(qtdePortas >= 2 && qtdePortas <=5){
            for(int j = 0; j < qtdePortas;j++){
                portas[j] = new Porta();
            }
        }
    }
    
    private void setRodas(Roda[] rodas, int tamanhoRoda){
        rodas = new Roda[4];
        for(int i=0; i<4;i++){
            rodas[i] = new Roda(tamanhoRoda);
        }
    }
    
    public void ligarCarro(){
        motor.ligar();
    }
    
    public void desligarCarro(){
        motor.desligar();
    }
    
   public void abastecerCarro(int litrosAbastecido){
       int litros = litrosAbastecido;
       if(litros > 0){
           litros+=tanque.getQuantidadeCombustivel();
           tanque.setQuantidadeCombustivel(litros);
           System.out.println("Você abasteceu "+litrosAbastecido+" litro(s).\nSeu tanque tem "+ tanque.getQuantidadeCombustivel()+ " litro(s)");
       }
       
   }
}
