import java.util.ArrayList;
import java.util.List;

public abstract class Socio {
    private String nombre;
    private String apellido;
    private Integer numeroDeIdentificacion;
    private List<Ejemplar> ejemplares;
    private Integer cantidadMaximaDeLibrosARetirar;

    public Socio(String nombre, String apellido, Integer numeroDeIdentificacion, Integer cantidadMaximaDeLibrosARetirar) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeIdentificacion = numeroDeIdentificacion;
        ejemplares = new ArrayList<>();
        this.cantidadMaximaDeLibrosARetirar = 3;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getNumeroDeIdentificacion() {
        return numeroDeIdentificacion;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public Integer getCantidadMaximaDeLibrosARetirar() {
        return cantidadMaximaDeLibrosARetirar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Socio socio = (Socio) o;
        return numeroDeIdentificacion.equals(socio.numeroDeIdentificacion);
    }



    public Boolean tieneCupo(){
        if(cantidadMaximaDeLibrosARetirar > 0){
           return true;
        }else{
            return false;
        }
    }

    public void tomarPrestadoUnEjemplar(Ejemplar unEjemplar){
        if(tieneCupo()){
            cantidadMaximaDeLibrosARetirar--;
            ejemplares.add(unEjemplar);
        } else {
            System.out.println("No puede retirar mas libros hasta devolver los anteriores");
        }
    }

    public void devolverUnEjemplar(Ejemplar unEjemplar){
        cantidadMaximaDeLibrosARetirar++;
        ejemplares.remove(unEjemplar);

    }

}
