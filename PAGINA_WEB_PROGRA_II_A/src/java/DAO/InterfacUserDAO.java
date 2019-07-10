package DAO;

import modelo.Usuario;

/**
 *
 * @author Ana Elena
 */
public interface InterfacUserDAO {
    public void insertar (Usuario usuario);
    public boolean eliminar (Usuario usuario);
    public Usuario buscar (int cedula);
}
