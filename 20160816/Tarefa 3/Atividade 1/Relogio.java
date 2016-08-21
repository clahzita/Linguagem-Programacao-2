class Relogio{
    private Ponteiro ponteiroHora;
    private Ponteiro ponteiroMinuto;
    private Ponteiro ponteiroSegundo;

    public Relogio(){
        ponteiroHora = new Ponteiro();
        ponteiroMinuto = new Ponteiro();
        ponteiroSegundo = new Ponteiro();
    }

    public Relogio(int hora, int minuto, int segundo){
        ponteiroHora = new Ponteiro(hora,13,true);
        ponteiroMinuto = new Ponteiro(minuto,60,false);
        ponteiroSegundo = new Ponteiro(segundo,60,false);
    }

    public void acertarRelogio(int hora, int minuto, int segundo){
        this.ponteiroHora.setPonteiro(hora,24,true);
        this.ponteiroMinuto.setPonteiro(minuto,60,false);
        this.ponteiroSegundo.setPonteiro(segundo,60,false);
    }

    public int lerHora(){
        return this.ponteiroHora.getValor();
    }

    public int lerMinuto(){
        return this.ponteiroMinuto.getValor();        
    }

    public int lerSegundo(){
        return this.ponteiroSegundo.getValor();
    }

     public int lerPosicaoHora(){
         if(this.ponteiroHora.getPosicao() == 0){
             return 12;
         }
         else{
             return this.ponteiroHora.getPosicao();
         }
        
    }

    public int lerPosicaoMinuto(){
        if(this.ponteiroMinuto.getPosicao() == 0){
             return 12;
         }
         else{
             return this.ponteiroMinuto.getPosicao();
         }
                
    }

    public int lerPosicaoSegundo(){
        if(this.ponteiroSegundo.getPosicao() == 0){
             return 12;
         }
         else{
             return this.ponteiroSegundo.getPosicao();
         }
        
    }

}