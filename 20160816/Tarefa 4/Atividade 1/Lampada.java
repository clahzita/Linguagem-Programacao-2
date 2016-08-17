public class Lampada{
    private Boolean ligada;

    public Lampada(Boolean ligada){
        this.ligada = ligada;
    }

    public Boolean isLigada(){
        return this.ligada;
    }

    public void ligar(){
        if(!ligada){
            ligada = true;
        }
    }

     public void desligar(){
        if(ligada){
            ligada = false;
        }
    }

    public void imprimir(){
        if(ligada){
            System.out.println("Lâmpada ligada");
        }
        else{
            System.out. println("Lâmpada desligada");
        }
    }


}