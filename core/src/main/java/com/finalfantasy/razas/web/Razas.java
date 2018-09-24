package com.finalfantasy.razas.web;

import java.util.ArrayList;

public class Razas {
    //Objetos privados
    private String nombre_raza;
    private String mod_stats_raza;
    private String habilidades_raza;

    //getter y setter del nombre
    public String getNombre_raza() {
        return nombre_raza;
    }

    public void setNombre_raza(String nombre_raza) {
        this.nombre_raza = nombre_raza;
    }

    //getter y setter de stats
    public String getMod_stats_raza() {
        return mod_stats_raza;
    }

    public void setMod_stats_raza(String mod_stats) {
        this.mod_stats_raza = mod_stats_raza;
    }

    //getter y setter de habilidades
    public String getHabilidades_raza() {
        return habilidades_raza;
    }
    public void setHabilidades_raza(String habilidades_raza) {
        this.habilidades_raza = habilidades_raza;
    }

}