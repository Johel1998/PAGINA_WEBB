package DAO;

import java.util.TreeMap;
import modelo.Articulo;

/**
 *
 * @author JOHEL
 */
public interface Interface_ArticuloDAO {
    public void hacerTrueque(Articulo articulo);
    TreeMap<String, Articulo> obtenerArticulos();
    public void insertar(Articulo articulo);
    public Articulo buscarArticuloPorCodigo(int codigo);
}
