package modelo;

/**
 *
 * @author JOHEL
 */
public class Trueque {
    private String nombreDelOfertante;
    private String nombreDelRecibidor;
    
    private Articulo enviarArticulo;
    private Articulo recibirArticulo;

    public Trueque(String nombreDelOfertante, String nombreDelRecibidor, Articulo enviarArticulo, Articulo recibirArticulo) {
        this.nombreDelOfertante = nombreDelOfertante;
        this.nombreDelRecibidor = nombreDelRecibidor;
        this.enviarArticulo = enviarArticulo;
        this.recibirArticulo = recibirArticulo;
    }

    public String getNombreDelOfertante() {
        return nombreDelOfertante;
    }

    public void setNombreDelOfertante(String nombreDelOfertante) {
        this.nombreDelOfertante = nombreDelOfertante;
    }

    public String getNombreDelRecibidor() {
        return nombreDelRecibidor;
    }

    public void setNombreDelRecibidor(String nombreDelRecibidor) {
        this.nombreDelRecibidor = nombreDelRecibidor;
    }

    public Articulo getEnviarArticulo() {
        return enviarArticulo;
    }

    public void setEnviarArticulo(Articulo enviarArticulo) {
        this.enviarArticulo = enviarArticulo;
    }

    public Articulo getRecibirArticulo() {
        return recibirArticulo;
    }

    public void setRecibirArticulo(Articulo recibirArticulo) {
        this.recibirArticulo = recibirArticulo;
    }
}
