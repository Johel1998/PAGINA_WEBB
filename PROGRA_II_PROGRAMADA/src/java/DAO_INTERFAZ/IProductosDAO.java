/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO_INTERFAZ;

import Modelo.Producto;
import java.util.List;

/**
 *
 * @author JOHEL
 */
public interface IProductosDAO {
    //Metodos para los productor
    public abstract void insertarProducto(Producto producto);
    public abstract void eliminarProducto(Producto producto);
    public abstract List<Producto> listar();
    public abstract boolean actualizarProducto(Producto producto);
    
    //Metodos para los usuarios
    
    
    /*
     List<Alumno> listar();
    boolean actualizar(Alumno alumno);
    boolean eliminar(Alumno alumno);
    boolean insertar(Alumno alumno);
    Alumno buscar(int id);
    */
            
            
}
