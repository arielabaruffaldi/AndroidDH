import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Libro {
    private String nombre;
    private Integer isnb;
    private String autor;
    private List<Ejemplar> listaDeEjemplares;

    public Libro(String nombre, Integer isnb, String autor) {
        this.nombre = nombre;
        this.isnb = isnb;
        this.autor = autor;
        listaDeEjemplares = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getIsnb() {
        return isnb;
    }

    public String getAutor() {
        return autor;
    }

    public List<Ejemplar> getListaDeEjemplares() {
        return listaDeEjemplares;
    }

    public void agregarEjemplar(Ejemplar ejemplar){
        listaDeEjemplares.add(ejemplar);
    }

    public Boolean ejemplarDisponible(){
        return !listaDeEjemplares.isEmpty();
    }
    public Ejemplar prestarEjemplar(){
        return listaDeEjemplares.remove(0);
    }

    public void reingresarEjemplar(Ejemplar unEjemplar){
        listaDeEjemplares.add(unEjemplar);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return isnb.equals(libro.isnb);
    }


}
