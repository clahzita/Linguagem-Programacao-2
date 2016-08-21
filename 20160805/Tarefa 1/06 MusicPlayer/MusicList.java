import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A classe MusicList � capaz de armazenar uma lista de nomes de arquivos, permitindo a��es como:
 * adcionar/remover nomes de arquivos da lista, listar o conteudo da lista, etc.
 * 
 * @author Clarisa Alves Soares 
 * @version 2016.08.04
 */
public class MusicList
{
    // vari�veis de inst�ncia - substitua o exemplo abaixo pelo seu pr�prio
    private List<String> listaDeMusicas;

    /**
     * Construtor para objetos da classe MusicList
     */
    public MusicList()
    {
        // inicializa vari�veis de inst�ncia
        listaDeMusicas = new ArrayList<String>();
    }
    
    /**
     * Esse m�todo adciona nome de m�sicas a lista.
     * 
     * @param file Nome da m�sica a ser inserida na lista.
     */
    public void addFile(String file)
    {
        // Adciona nome de musica a lista
        listaDeMusicas.add(file);
    }

     /**
     * Esse m�todo remove um arquivo da lista por posi��o.
     * 
     * @param number N�mero da posi��o em que o arquivo a ser removido se encontra na lista.
     */
    public void removeFile(int number)
    {
        // Remove o nome de musica na posi��o number
        if(number < listaDeMusicas.size()){
            listaDeMusicas.remove(number);
        } 
    }
    
    /**
     * Esse m�todo remove o primeiro arquivo que cont�m o par�metro "name" como uma substring.
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
     * Esse m�todo mostra o n�mero de arquivos na lista.
     * 
     * @param number N�mero da posi��o em que a m�sica a ser removida se encontra na lista.
     */
    public void getNumberOfFiles()
    {
        System.out.println("N�mero de arquivos na lista: " + listaDeMusicas.size());
    }
    
    /**
     * Esse m�todo mostra os elementos contidos na lista.
     * 
     * @param number N�mero da posi��o em que a m�sica a ser removida se encontra na lista.
     */
    public void listFiles()
    {
        if(listaDeMusicas.size() == 0){
            System.out.println("N�o h� arquivos.");
        }
        else{
            for(int i=0; i<listaDeMusicas.size();i++){
                System.out.println(i+": "+listaDeMusicas.get(i));
            }
        }
    }
    
    /**
     * Esse m�todo usa um objeto SounEngine para tocar o arquivo de nome passado por par�metro. o n�mero de arquivos na lista.
     * 
     * @param file Nome do arquivo na lista que ser� tocado, caso seja encontrado.
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
     * Esse m�todo usa um objeto SounEngine para tocar todos os arquivos da lista.
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
