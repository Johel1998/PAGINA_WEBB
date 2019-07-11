package listaDAO;

import DAO.Interface_ArticuloDAO;
import Singleton.ArticuloS;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import modelo.Articulo;

/**
 *
 * @author JOHEL
 */
public class Lista_De_Articulos_DAO implements Interface_ArticuloDAO{
//      public TreeMap<Integer, Articulo> listaDeArticulos;
      private int consecutivo = 1;
      public List <Articulo> listaDeArticulos;
//      private static Lista_De_Articulos_DAO instance;

    public Lista_De_Articulos_DAO() {
        listaDeArticulos = ArticuloS.getInstance().listaArticulos;
    }

      
//    private Lista_De_Articulos_DAO() {
//        listaDeArticulos = new TreeMap<>();
//    }
      
//    public static Lista_De_Articulos_DAO getInstance(){
//        if (instance == null) {
//            return instance = new Lista_De_Articulos_DAO();
//        } else {
//            return instance;
//        }
//    }

    @Override
    public void hacerTrueque(Articulo articulo) {
        Iterator<Articulo> itr = listaDeArticulos.iterator();
        while (itr.hasNext()) {
            Articulo next = itr.next();
            if (articulo.equals(next)) {
                listaDeArticulos.remove(articulo);
//                listaDeArticulos.remove(articulo.getCodigo(), articulo);
            }
        }
    }

//    @Override
//    public TreeMap<String, Articulo> obtenerArticulos() {
//       return listaDeArticulos;
//    }

   @Override
    public boolean insertar(Articulo articulo) {
        Articulo articulon = listaDeArticulos.get(listaDeArticulos.size()-1);
        Articulo articuloCopy = new Articulo(articulo.getDuenoDelArticulo(), articulo.getNombreArticulo(), articulon.getCodigo(), articulo.getPrecio(), articulo.getImagenProducto());
        return listaDeArticulos.add(articuloCopy);
//        listaDeArticulos.put(consecutivo, articuloCopy);
    }
//    public void insertar(Articulo articulo) {
//        Articulo a = listaDeArticulos.get(listaDeArticulos.size()-1);
////        articulo.setCodigo(consecutivo);
////        consecutivo++;
//        listaDeArticulos.put(articulo.getDuenoDelArticulo(), articulo);
//    }
//    public void insertar(Articulo articulo) {
//        articulo.setCodigo(consecutivo);
//        consecutivo++;
//        listaDeArticulos.put(articulo.getDuenoDelArticulo(), articulo);
//    }

    @Override
    public Articulo buscarArticuloPorCodigo(int codigo) {
        Iterator<Articulo> itr = listaDeArticulos.iterator();
        Articulo articulo = null;
        while (itr.hasNext()) {
             articulo = itr.next();
            if (articulo.getCodigo() == codigo) {
                return articulo;
            }
        }
        return null;
    }

    @Override
    public boolean actualizar(Articulo articulo) {
        boolean seInserto = false;
        Articulo actualizarArticulo = buscarArticuloPorCodigo(articulo.getCodigo());
        if (actualizarArticulo != null) {
            actualizarArticulo.setDuenoDelArticulo(articulo.getDuenoDelArticulo());
            actualizarArticulo.setNombreArticulo(articulo.getNombreArticulo());
            actualizarArticulo.setCodigo(articulo.getCodigo());
            actualizarArticulo.setPrecio(articulo.getPrecio());
            actualizarArticulo.setImagenProducto(articulo.getImagenProducto());
            seInserto = true;
        }
        return seInserto;
    }

    @Override
    public TreeMap<String, Articulo> obtenerArticulos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
}
