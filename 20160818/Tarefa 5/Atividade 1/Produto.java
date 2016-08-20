import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Locale;

public class Produto{
    private String nome;
    private double peso;
    private Date validade;

    public Produto(String nome, double peso, String validade){
        this.nome = nome;
        this.peso = peso;
        this.setValidade(validade);    
    }

    public Date getValidade(){
        return this.validade;
    }

    public void setValidade(String dataValidade){
       
        String[] divideDataValidade = dataValidade.split("/");
        int dia = Integer.parseInt(divideDataValidade[0]);
        int mes = Integer.parseInt(divideDataValidade[1]);
        int ano = Integer.parseInt(divideDataValidade[2]);


        Calendar data =  
            new Calendar.Builder()  
                .setDate(ano,mes,dia+1)  
                .setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"))  
                .setLocale(new Locale("pt", "br"))
                .build(); 

        this.validade = data.getTime();       
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getPeso(){
        return this.peso;
    }

    public String imprimeValidade(){
         
         String dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(this.validade);
         
         return dataFormatada;

          /*DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        validade.format(formatador);*/
    }

    
}