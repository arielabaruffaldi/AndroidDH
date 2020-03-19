package com.company.Vehiculos;

public class Vehiculo {
    private Double velocidad;
    private Double aceleracion;
    private Integer anguloDeGiro;
    private String patente;
    private Double peso;
    private Integer ruedas;

    public Vehiculo(Double velocidad, Double aceleracion, Integer anguloDeGiro, String patente, Double peso, Integer ruedas) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
        this.peso = peso;
        this.ruedas = ruedas;
    }
}
