public class Ejemplar {
    private Libro libro;
    private Integer numeroDeEdicion;
    private String ubicacion;

    public Libro getLibro() {
        return libro;
    }

    public Integer getNumeroDeEdicion() {
        return numeroDeEdicion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Ejemplar(Libro libro, Integer numeroDeEdicion, String ubicacion) {
        this.libro = libro;
        this.numeroDeEdicion = numeroDeEdicion;
        this.ubicacion = ubicacion;
    }
}
