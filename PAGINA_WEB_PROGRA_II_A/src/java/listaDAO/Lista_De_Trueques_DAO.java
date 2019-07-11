package listaDAO;

import DAO.Interface_TruequeDAO;
import java.util.ArrayList;
import java.util.List;
import modelo.Trueque;

/**
 *
 * @author JOHEL
 */
public class Lista_De_Trueques_DAO implements Interface_TruequeDAO{
  private static Lista_De_Trueques_DAO instance;
  public List<Trueque> listaDeTrueques;

    private Lista_De_Trueques_DAO() {
    listaDeTrueques = new ArrayList();
    }
  
    public static Lista_De_Trueques_DAO getInstance(){
        if (instance == null) {
            instance = new Lista_De_Trueques_DAO();
        } 
        return instance;
    }

    @Override
    public void agregarTrueque(Trueque trueque) {
       listaDeTrueques.add(trueque);
    }

    @Override
    public boolean eliminarTrueque(Trueque trueque) {
        return listaDeTrueques.remove(trueque);
    }

    @Override
    public List<Trueque> obtenerTrueque() {
        return listaDeTrueques;
    }
}
