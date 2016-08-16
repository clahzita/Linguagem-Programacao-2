class Fracao{
    private double numerador;
    private double denominador;

    public Fracao(){
        this.numerador = 1;
        this.denominador = 1;

    }

    public Fracao(double numerador; double denominador){
        this.numerador = numerador;
        if(denominador != 0){
            this.denominador = denominador;
        }
        
    }
    public double getNumerador(){
        return this.numerador;
    }

     public double getDenominador(){
        return this.numerador;
    }

    public void setFracao(double numerador; double denominador){
        this.numerador = numerador;
        if(denominador != 0){
            this.denominador = denominador;
        }
    }

    public Fracao somaFracao(Fracao x){
        numeradorResultado = x.getNumerador() * this.numerador;
        denominadorResultado = x.getDenominador() * this.denominador;
        Fracao resultado = new Fracao(numeradorResultado,denominadorResultado);
        return resultado;
    }

    public void exibirFracao(){
        System.out.println(getNumerador+"/"getDenominador);
    }





}