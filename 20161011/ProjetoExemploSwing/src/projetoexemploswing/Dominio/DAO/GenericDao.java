
package projetoexemploswing.Dominio.DAO;

import java.util.ArrayList;

public interface GenericDao<C> {
    public void inserir(C obj);
    public void apagar(C obj);
    public void alterar(C obj);
    public ArrayList<C> buscarTodos();
    
}
