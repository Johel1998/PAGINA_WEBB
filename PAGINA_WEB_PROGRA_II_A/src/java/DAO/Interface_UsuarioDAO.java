package DAO;

import modelo.Usuario;

/**
 *
 * @author Ana Elena
 */
public interface Interface_UsuarioDAO {
    public void insertar (Usuario usuario);
    public boolean eliminar (Usuario usuario);
    public Usuario buscar (int cedula);
}
