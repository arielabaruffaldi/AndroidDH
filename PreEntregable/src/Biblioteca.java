import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {
    private List<Socio> listaDeSocios;
    private List<Libro> listaDeLibros;
    private List<Prestamo> listaDePrestamos;

    public Biblioteca() {
        listaDeSocios = new ArrayList<>();
        listaDeLibros = new ArrayList<>();
        listaDePrestamos = new ArrayList<>();
    }
    //Buscar cosas
    private Libro buscarLibro(Integer isbn){
        Libro unLibro = null;
        for (Libro trackLibro:listaDeLibros) {
            if(trackLibro.getIsnb().equals(isbn)){
                unLibro = trackLibro;

            }
        }
        return unLibro;
    }

    private Socio buscarSocio(Integer numeroDeIdentificacion){
        Socio unSocio = null;
        for (Socio trackSocio:listaDeSocios) {
            if(trackSocio.getNumeroDeIdentificacion().equals(numeroDeIdentificacion)){
                unSocio = trackSocio;
            }
        }
        return unSocio;
    }

    //Agregar prestamos
    private void agregarPrestamo(Ejemplar ejemplar, Socio socio, Date fecha){
        listaDePrestamos.add(new Prestamo(ejemplar, socio,fecha));
    }
    //PRESTAR
    public void prestar(Integer isbn, Integer numeroDeIdentificacion){
        Socio unSocio = buscarSocio(numeroDeIdentificacion);
        Libro unLibro = buscarLibro(isbn);

        if(unLibro == null || unSocio == null){
            System.out.println("socio o libro no encontrado");
            return;
        }

        if(unLibro.ejemplarDisponible() && unSocio.tieneCupo()){
            Ejemplar ejemplarPrestado = unLibro.prestarEjemplar();
            unSocio.tomarPrestadoUnEjemplar(ejemplarPrestado);
            agregarPrestamo(ejemplarPrestado, unSocio, new Date());
            System.out.println(unSocio.getNombre()+" Tomo prestado "+ejemplarPrestado.getLibro().getNombre()+" y puede retirar"+ unSocio.getCantidadMaximaDeLibrosARetirar()+" libros.");
        }
    }

    public void devolver(Ejemplar ejemplar, Integer numeroDeIdentificacion){
        Socio unSocio = buscarSocio(numeroDeIdentificacion);
        Libro libroADevolver = ejemplar.getLibro();
        libroADevolver.reingresarEjemplar(ejemplar);
        unSocio.devolverUnEjemplar(ejemplar);
        Libro unLibro = buscarLibro(libroADevolver.getIsnb());
        System.out.println("El socio: "+unSocio.getNombre()+" devolvio el libro "+libroADevolver.getNombre()+" y ahora puede retirar "+unSocio.getCantidadMaximaDeLibrosARetirar()+"libros");
    }

    public void prestar(List<Integer> unaListaISBN, Integer numeroDeIdentificacion){

        for (Integer trackIsbn:unaListaISBN) {
            prestar(trackIsbn,numeroDeIdentificacion);
        }
    }

    public void devolver(List<Ejemplar> ejemplares, Integer numeroDeIdentificacion){
        for(Ejemplar trackEjemplar: ejemplares){
            devolver(trackEjemplar, numeroDeIdentificacion);
        }
    }
}
