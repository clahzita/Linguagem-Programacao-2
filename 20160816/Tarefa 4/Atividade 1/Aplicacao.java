public class Aplicacao{
    public static void main(String[] args){
        Lampada lamp = new Lampada(true);
        
        lamp.imprimir();

        lamp.desligar();
        lamp.imprimir();

        lamp.desligar();
        lamp.imprimir();
        
        lamp.ligar();
        lamp.imprimir();

        lamp.ligar();
        lamp.imprimir();


    }
}