public class Processador{
    StringBuilder tresPrimeiros;

    public String processar(String s){
        if(s.isEmpty()){
            return null;
        }
        else if (s.length() <= 3){
            return s.toUpperCase();

        }
        else{
            tresPrimeiros = new StringBuilder(s.substring(0,3));
            tresPrimeiros.reverse();
            return (tresPrimeiros.toString() + s.substring(3,s.length())).toUpperCase();
        }

        
    }

}