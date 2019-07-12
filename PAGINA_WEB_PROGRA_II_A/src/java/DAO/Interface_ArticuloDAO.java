package DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import modelo.Articulo;

/**
 *
 * @author JOHEL
 */
public interface Interface_ArticuloDAO {
    public void hacerTrueque(Articulo articulo);
//    TreeMap<String, Articulo> obtenerArticulos();
    public boolean insertar(Articulo articulo);
    public Articulo buscarArticuloPorCodigo(int codigo);
    public boolean actualizar(Articulo articulo);
    List <Articulo> obtenerArticulo();
}
