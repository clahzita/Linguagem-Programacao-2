public class Prova{
    private double notaParte1;
    private double notaParte2;

    public Prova(){
        this.notaParte1 = 0.0;
        this.notaParte2 = 0.0;
    }

    public Prova(double notaParte1, double notaParte2){
        this.notaParte1 = notaParte1;
        this.notaParte2 = notaParte2;
    }

    public double calcularNotaTotal(){
        double soma = this.notaParte1+this.notaParte2;
        if(soma > 0.0 && soma < 10.0){
            return soma;
        }
        return 0.0;
    }


}