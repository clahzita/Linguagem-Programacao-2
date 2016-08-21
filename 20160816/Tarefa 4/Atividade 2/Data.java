public class Data{
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int minuto;
    private int segundo;
    public static final int FORMATO_12H = 12;
    public static final int FORMATO_24H = 24;


    public Data(int dia, int mes, int ano){
        this.dia = dia%30;
        this.mes = mes%30;
        this.ano = ano;
        this.hora = -1;
        this.minuto = -1;
        this.segundo = -1;
    }

    public Data(int dia, int mes, int ano, int hora, int minuto, int segundo){
        this(dia,mes,ano);
        this.hora = hora%24;
        this.minuto = minuto%60;
        this.segundo = segundo%60;
    }

    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public int getAno(){
        return this.ano;
    }

    public int getHora(){
        return this.hora;
    }

    public int getMinuto(){
        return this.minuto;
    }

    public int getSegundo(){
        return this.segundo;
    }

    public void imprimir(int formato){
        if(this.hora == -1){
                System.out.printf("%d/%d/%d\n",this.dia,this.mes,this.ano);
        }
        else{
            if(formato == this.FORMATO_24H){
                System.out.printf("%d/%d/%d %d:%d:%d\n",
                    this.dia, this.mes, this.ano,
                    this.hora, this.minuto, this.segundo);
            }
            else{
                System.out.printf("%d/%d/%d %d:%d:%d %s\n",
                    this.dia, this.mes, this.ano,
                    this.hora%12, this.minuto, this.segundo,this.getAMPM());
            }
        }      

    }

    public String getAMPM(){
         if(this.hora >= 0 && this.hora < 12){
            return "AM";
        }
        else{
            return "PM";
        }
    }

}