import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;


/**
 * A classe ContadorPalavras faz a contagem de palavras de um determinado texto, mosrando a frequência que
 * uma palavra aparece no texto.
 * 
 * Referência: http://www.devmedia.com.br/contagem-de-frequencias-de-palavras-em-arquivos-texto-em-java/26979
 * 
 * @author Clarissa Alves Soares
 * @version 2016.08.05
 */
public class ContadorPalavras
{
    private String texto;
    private Map<String,Integer> mapaPalavras;

    /**
     * COnstrutor para objetos da classe ContadorPalavras
     */
    public ContadorPalavras(String texto)
    {
        mapaPalavras = new HashMap<String,Integer>();
        setTexto(texto);
    }
    
    public void setTexto(String texto){
        this.texto = texto;
    }
    
    public String getTexto(){
        return texto;
    }
    
    public String[] quebrarTexto(String textoOriginal){
        String caracteres = " #@_\\/.*,;";
        String minusculo = textoOriginal.toLowerCase();
        return minusculo.split("[" + Pattern.quote(caracteres) + "]+");
    }
    
    public void imprimirContagem(Map<String,Integer> mapa){
        //impressão das chaves e valores do Mapa de Palavras e frequencias
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + ":  " + entry.getValue());
	    }
	    mapa.clear();
    }
    
    public void efetuarContagem()
    {
        String[] pedacos = quebrarTexto(getTexto());
        
        for(String palavra: pedacos){
            Integer frequencia = mapaPalavras.get(palavra);
            
            if (frequencia != null) { //se palavra existe, atualiza a frequencia
                    mapaPalavras.put(palavra, frequencia+1);
            }
            else { // se palavra não existe, insire a palavra e inicializa frequencia=1.
                    mapaPalavras.put(palavra,1);
            }
        }
        
        imprimirContagem(mapaPalavras);   
    }
    
    
    
}
