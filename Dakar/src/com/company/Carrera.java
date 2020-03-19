package com.company;

import com.company.Vehiculos.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private Double distancia;
    private Double premioEnDolares;
    private String nombre;
    private Integer CantidadDeVehiculosPermitidos;
    private List<Vehiculo> listaDeVehiculos;

    public Carrera(Double distancia, Double premioEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos, List<Vehiculo> listaDeVehiculos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        CantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.listaDeVehiculos = listaDeVehiculos;
    }

    public void darDeAltaAuto(Double velocidad, Double aceleracion,Double anguloDeGiro, String patente){
        if(listaDeVehiculos.size()<10){
            listaDeVehiculos.add()
        }
    }
}
