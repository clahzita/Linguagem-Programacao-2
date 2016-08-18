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
        this.dia = dia%30+1;
        this.mes = mes%30+1;
        this.ano = ano;
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
        System.out.println("ok");

    }

}