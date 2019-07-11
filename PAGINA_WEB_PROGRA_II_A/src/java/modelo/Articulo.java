package modelo;

import java.awt.Image;

/**
 *
 * @author JOHEL
 */
public class Articulo {
    private String duenoDelArticulo;
    private String nombreArticulo;
    private int codigo;
    private String precio;
    private Image imagenProducto;

    public Articulo() {
    }

    public Articulo(String duenoDelArticulo, String nombreArticulo, int codigo, String precio, Image imagenProducto) {
        this.duenoDelArticulo = duenoDelArticulo;
        this.nombreArticulo = nombreArticulo;
        this.codigo = codigo;
        this.precio = precio;
        this.imagenProducto = imagenProducto;
    }

    public String getDuenoDelArticulo() {
        return duenoDelArticulo;
    }

    public void setDuenoDelArticulo(String nickUsuarioP) {
        this.duenoDelArticulo = nickUsuarioP;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public Image getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(Image imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    @Override
    public String toString() {
        return "Articulo{" + "duenoDelArticulo=" + duenoDelArticulo + ", nombreArticulo=" + nombreArticulo + ", codigo=" + codigo + ", precio=" + precio + ", imagenProducto=" + imagenProducto + '}';
    }
}
