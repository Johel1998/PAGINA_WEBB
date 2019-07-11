package Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import modelo.Articulo;

/**
 *
 * @author Ana Elena
 */
public class ArticuloS {
    private static ArticuloS instance;
    public List <Articulo> listaArticulos;
//    public TreeMap <Integer, Articulo> listaArticulos;
    
    private ArticuloS(){
        listaArticulos = new ArrayList<>();
    }
    
    public static ArticuloS getInstance (){
        if (instance == null) {
            instance = new ArticuloS();
        }
        return instance;
    }
}
