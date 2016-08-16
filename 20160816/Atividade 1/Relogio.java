class Relogio{
    private Ponteiro ponteiroHora;
    private Ponteiro ponteiroMinuto;
    private Ponteiro ponteiroSegundo;

    public Relogio(){}

    public Relogio(int hora, int minuto, int segundo){
        Ponteiro ponteiroHora = new Ponteiro(hora%12+1);
        Ponteiro ponteiroMinuto = new Ponteiro(minuto%60+1);
        Ponteiro ponteiroSegundo = new Ponteiro(hora%60+1);
    }

    public void acertarRelogio(int hora, int minuto, int segundo){
        this.ponteiroHora.setPonteiro(hora%12+1);
        this.ponteiroMinuto.setPonteiro(minuto%60+1);
        this.ponteiroSegundo.setPonteiro(segundo%60+1);
    }

    public int lerHora(){
        return this.ponteiroHora.getPonteiro();
    }

    public int lerMinuto(){
        return this.ponteiroMinuto.getPonteiro();        
    }

    public int lerSegundo(){
        return this.ponteiroMinuto.getPonteiro();
    }

}