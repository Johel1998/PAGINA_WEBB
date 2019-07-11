package DAO;

import java.util.List;
import modelo.Trueque;

/**
 *
 * @author JOHEL
 */
public interface Interface_TruequeDAO {
    public void agregarTrueque(Trueque trueque);
    public boolean eliminarTrueque(Trueque trueque);
    public List<Trueque> obtenerTrueque();
    
}
