import java.time.Duration;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.Period;

public class Aplicacao{
    public static void main(String[] args){
        LocalDate nascJames = LocalDate.parse("1955-05-19");
        LocalDate hoje = LocalDate.now();

        Period periodo = Period.between(nascJames,hoje);

        System.out.printf("%s anos, %s mês e %s dias\n", 
            periodo.getYears() , periodo.getMonths(), periodo.getDays());

        LocalTime agora = LocalTime.now();
        LocalTime treshoras = LocalTime.parse("03:00:00");

        Duration duracao = Duration.between(treshoras,agora);
        System.out.printf("%d segundos\n",duracao.getSeconds());
    }
}