package com.company;

public class FuegoIndividual implements Explotables{
    private String ruido;

    public FuegoIndividual (String ruido){
        this.ruido = ruido;
    }

    public void explotar(){
        System.out.println("Hago ruido como un fuego individual");
    }
}
