package Banco;

public class SesionDeEntrenamiento {
    private Integer experienciaGanada;

    public SesionDeEntrenamiento(Integer experienciaGanada) {
        this.experienciaGanada = experienciaGanada;
    }

    public void entrenarA(JugadorDeFutbol unJugador) {
        unJugador.correr();
        unJugador.hacerGol();
        unJugador.correr();
        System.out.println("experiencia inicial: " + unJugador.getExperiencia());
        unJugador.setExperiencia(unJugador.getExperiencia() + experienciaGanada);
        System.out.println("experiencia final: " + unJugador.getExperiencia());
    }
}

