package modelo;

import java.awt.Image;

/**
 *
 * @author JOHEL
 */
public class Articulo {
    private String nickUsuarioP;
    private String nombre;
    private int codigo;
    private String precio;
    private Image imagenProducto;

    public Articulo() {
    }

    public Articulo(String nickUsuarioP, String nombre, int codigo, String precio, Image imagenProducto) {
        this.nickUsuarioP = nickUsuarioP;
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.imagenProducto = imagenProducto;
    }

    public String getNickUsuarioP() {
        return nickUsuarioP;
    }

    public void setNickUsuarioP(String nickUsuarioP) {
        this.nickUsuarioP = nickUsuarioP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return "Articulo{" + "nickUsuarioP=" + nickUsuarioP + ", nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", imagenProducto=" + imagenProducto + '}';
    }
}
