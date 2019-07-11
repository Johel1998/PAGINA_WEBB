package listaDAO;

import DAO.Interface_UsuarioDAO;
import XML.UsuarioXML;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.Usuario;

/**
 *
 * @author Ana Elena
 */
public class ListaUsuarioDAO implements Interface_UsuarioDAO{
    private ArrayList<Usuario> listaUsuario;

    public ListaUsuarioDAO() {
        listaUsuario = new ArrayList<>();
    }

    public ArrayList<Usuario> getListaUsuario (){
        return listaUsuario;
    }
    @Override
    public void insertar(Usuario usuario) {
        listaUsuario = UsuarioXML.cargarArchivo();
        listaUsuario.add(usuario);
        UsuarioXML.escribirArchivo(listaUsuario);
        System.out.println(listaUsuario.toString());
        UsuarioXML.cargarArchivo();
    }

    @Override
    public boolean eliminar(Usuario usuario) {
        Iterator<Usuario> i = listaUsuario.iterator();
        Usuario us = null;
        while (i.hasNext()) {
            us = i.next();
            if (us.getCedula()== usuario.getCedula()) {
                return listaUsuario.remove(usuario);
            }
        }
        return false;
    }

    @Override
    public Usuario buscar(int cedula) {
        Iterator<Usuario> i = listaUsuario.iterator();
        Usuario us = null;
        while (i.hasNext()) {
            us = i.next();
            if (us.getCedula()== cedula) {
                return us;
            }
        }
        return null;
    }
    
}
