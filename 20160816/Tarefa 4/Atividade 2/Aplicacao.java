public class Aplicacao{
    public static void main(String[] args){
        Data date1 = new Data(10,3,2000,10,30,10);
        Data date2 = new Data(15,6,2000,23,15,20);
        Data date3 = new Data(5,10,2005);

        date1.imprimir(Data.FORMATO_24H);
        date1.imprimir(Data.FORMATO_12H);

        date2.imprimir(Data.FORMATO_24H);
        date2.imprimir(Data.FORMATO_12H);

        date3.imprimir(Data.FORMATO_24H);
        date3.imprimir(Data.FORMATO_12H);
    }
}