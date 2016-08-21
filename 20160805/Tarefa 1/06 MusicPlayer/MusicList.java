import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A classe MusicList é capaz de armazenar uma lista de nomes de arquivos, permitindo ações como:
 * adcionar/remover nomes de arquivos da lista, listar o conteudo da lista, etc.
 * 
 * @author Clarisa Alves Soares 
 * @version 2016.08.04
 */
public class MusicList
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private List<String> listaDeMusicas;

    /**
     * Construtor para objetos da classe MusicList
     */
    public MusicList()
    {
        // inicializa variáveis de instância
        listaDeMusicas = new ArrayList<String>();
    }
    
    /**
     * Esse método adciona nome de músicas a lista.
     * 
     * @param file Nome da música a ser inserida na lista.
     */
    public void addFile(String file)
    {
        // Adciona nome de musica a lista
        listaDeMusicas.add(file);
    }

     /**
     * Esse método remove um arquivo da lista por posição.
     * 
     * @param number Número da posição em que o arquivo a ser removido se encontra na lista.
     */
    public void removeFile(int number)
    {
        // Remove o nome de musica na posição number
        if(number < listaDeMusicas.size()){
            listaDeMusicas.remove(number);
        } 
    }
    
    /**
     * Esse método remove o primeiro arquivo que contém o parâmetro "name" como uma substring.
     * 
     * @param name Nome a ser buscado entre os nomes dos arquivos.
     */
    public void removeFile(String name)
    {
        boolean isContained = false;
        for(int i=0;i<listaDeMusicas.size();i++){
            if(listaDeMusicas.get(i).toLowerCase().contains(name.toLowerCase())){
                listaDeMusicas.remove(i);
                isContained = true;
                break;
            }
        }
        
        if(!isContained){
            System.out.println("Nenhum arquivo encontrado com a palavra " + name +".");
        }        

    }
    
     /**
     * Esse método mostra o número de arquivos na lista.
     * 
     * @param number Número da posição em que a música a ser removida se encontra na lista.
     */
    public void getNumberOfFiles()
    {
        System.out.println("Número de arquivos na lista: " + listaDeMusicas.size());
    }
    
    /**
     * Esse método mostra os elementos contidos na lista.
     * 
     * @param number Número da posição em que a música a ser removida se encontra na lista.
     */
    public void listFiles()
    {
        if(listaDeMusicas.size() == 0){
            System.out.println("Não há arquivos.");
        }
        else{
            for(int i=0; i<listaDeMusicas.size();i++){
                System.out.println(i+": "+listaDeMusicas.get(i));
            }
        }
    }
    
    /**
     * Esse método usa um objeto SounEngine para tocar o arquivo de nome passado por parâmetro. o número de arquivos na lista.
     * 
     * @param file Nome do arquivo na lista que será tocado, caso seja encontrado.
     */
    public void playFile(String file)
    {
        boolean isContained = false;
        SoundEngine engine = new SoundEngine();
        
        for(int i=0;i<listaDeMusicas.size();i++){
            if(listaDeMusicas.get(i).toLowerCase().contains(file.toLowerCase())){
                engine.playCompletely(file);
                isContained = true;
                break;
            }
        }
        
        if(!isContained){
            System.out.println("Nenhum arquivo encontrado com nome " + file +".");
        }        
        
    }
    
    /**
     * Esse método usa um objeto SounEngine para tocar todos os arquivos da lista.
     * 
     */
    public void playAll()
    {
        SoundEngine engine = new SoundEngine();
        
        for(int i=0;i<listaDeMusicas.size();i++){
            engine.playCompletely(listaDeMusicas.get(i));
        }       
        
    }
}
