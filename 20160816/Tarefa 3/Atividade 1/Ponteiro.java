class Ponteiro{
    private int valor;
    private int posicao;
    private int limite;
    Boolean hora;
    
    public Ponteiro(){

    }

    public Ponteiro(int valor, int limite, Boolean hora){
        this.limite = limite;
        this.hora = hora;
        this.setValor(valor);
        this.setPosicao();
    }

     public void setPonteiro(int valor, int limite, Boolean hora){
        this.limite = limite;
        this.hora = hora;
        this.setValor(valor);

        this.setPosicao();
    }

    public void setValor(int valor){
        if(valor >= 0 && valor < this.limite){
            this.valor = valor;
        }
        else{
            this.valor = valor%this.limite;
        }
    }
    
    public int getValor(){
        return this.valor;
    }

   

    public void setPosicao(){
        
       int x = this.valor;

        if(this.hora){            
            
            this.posicao = this.valor;            
            
        }
        else{            
            
            this.posicao = this.valor/5;
                        
        }     
    }

    public int getPosicao(){
        return this.posicao;
    }
}