package Banco;

public class Main {

    public static void main(String[] args) {
        // write your code here

        JugadorDeFutbol unJugador = new JugadorDeFutbol("Tevez", 300);
        System.out.println("energia inicial " + unJugador.getEnergia());
        SesionDeEntrenamiento unaSesion = new SesionDeEntrenamiento(100);

        unaSesion.entrenarA(unJugador);
        System.out.println("energia final: " + unJugador.getEnergia());

    }
}
