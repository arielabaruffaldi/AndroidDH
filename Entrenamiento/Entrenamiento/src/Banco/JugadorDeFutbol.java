package Banco;

public class JugadorDeFutbol {
    private String nombre;
    private Integer energia;
    private Integer felicidad;
    private Integer goles;
    private Integer experiencia;

    public JugadorDeFutbol (String nombre, Integer energia){
        this.nombre = nombre;
        this.energia = energia;
        this.felicidad = 10;
        this.goles = 0;
        this.experiencia = 0;
    }

    public void hacerGol (){
        energia =energia - 5;
        felicidad = felicidad + 10;
        goles ++;
        System.out.println("GOOOOL!");
    }

    public void correr(){
        energia= energia -10;
        System.out.println("no me dan más las piernas");
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setExperiencia(Integer experiencia) {
        this.experiencia = experiencia;
    }
}
