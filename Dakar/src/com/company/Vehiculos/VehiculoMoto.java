package com.company.Vehiculos;

public class VehiculoMoto extends Vehiculo {
    public VehiculoMoto(Double velocidad, Double aceleracion, Integer anguloDeGiro, String patente, Double peso, Integer ruedas) {
        super(velocidad, aceleracion, anguloDeGiro, patente, peso, ruedas);
            peso = 300.0;
            ruedas = 2;
    }
}
