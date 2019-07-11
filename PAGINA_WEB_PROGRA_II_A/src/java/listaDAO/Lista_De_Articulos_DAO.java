package listaDAO;

import DAO.Interface_ArticuloDAO;
import java.util.Iterator;
import java.util.TreeMap;
import modelo.Articulo;

/**
 *
 * @author JOHEL
 */
public class Lista_De_Articulos_DAO implements Interface_ArticuloDAO{
      public TreeMap<String, Articulo> listaDeArticulos;
      private int consecutivo;
      private static Lista_De_Articulos_DAO instance;

    private Lista_De_Articulos_DAO() {
        listaDeArticulos = new TreeMap<>();
        consecutivo = 1;
    }
      
    public static Lista_De_Articulos_DAO getInstance(){
    
        if (instance == null) {
            return instance = new Lista_De_Articulos_DAO();
        } else {
            return instance;
        }
    }

    @Override
    public void hacerTrueque(Articulo articulo) {
        Iterator<Articulo> itr = listaDeArticulos.values().iterator();
        while (itr.hasNext()) {
            Articulo next = itr.next();
            if (articulo.equals(next)) {
                listaDeArticulos.remove(articulo.getCodigo(), articulo);
            }
        }
    }

    @Override
    public TreeMap<String, Articulo> obtenerArticulos() {
       return listaDeArticulos;
    }

    @Override
    public void insertar(Articulo articulo) {
        articulo.setCodigo(consecutivo);
        consecutivo++;
        listaDeArticulos.put(articulo.getNickUsuarioP(), articulo);
    }

    @Override
    public Articulo buscarArticuloPorCodigo(int codigo) {
        Iterator<Articulo> itr = listaDeArticulos.values().iterator();
        while (itr.hasNext()) {
            Articulo next = itr.next();
            if (next.getCodigo() == codigo) {
                return next;
            }
        }
        return null;
    }
      
}
