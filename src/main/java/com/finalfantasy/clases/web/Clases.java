package com.finalfantasy.clases.web;

import java.util.ArrayList;

public class Clases {
    //Objetos privados
    private String nombre_clase;
    private String mod_stats_clase;
    private String dpv_clase;
    private String dpm_clase;
    private String paradigma_clase;
    private String licencias_clase;
    private String habilidades_clase;

    //getter y setter del nombre
    public String getNombre_clase() {
        return nombre_clase;
    }

    public void setNombre_clase(String nombre_clase) {
        this.nombre_clase = nombre_clase;
    }

    //getter y setter de stats
    public String getMod_stats_clase() {
        return mod_stats_clase;
    }

    public void setMod_stats_clase(String mod_stats_clase) {
        this.mod_stats_clase = mod_stats_clase;
    }

    //getter y setter de dpv
    public String getDpv_clase() {
        return dpv_clase;
    }

    public void setDpv_clase(String dpv_clase) {
        this.dpv_clase = dpv_clase;
    }

    //getter y setter de dpm
    public String getDpm_clase() {
        return dpm_clase;
    }
    public void setDpm_clase(String dpm_clase) {
        this.dpm_clase = dpm_clase;
    }

    //getter y setter de paradigma
    public String getParadigma_clase() {
        return paradigma_clase;
    }
        public void setParadigma_clase(String paradigma_clase) {
        this.paradigma_clase = paradigma_clase;
    }

    //getter y setter de licencias
    public String getLicencias_clase() {
        return licencias_clase;
    }
    public void setLicencias_clase(String licencias_clase) {
        this.licencias_clase = licencias_clase;
    }

    //getter y setter de habilidades
    public String getHabilidades_clase() {
        return habilidades_clase;
    }
    public void setHabilidades_clase(String habilidades_clase) {
        this.habilidades_clase = habilidades_clase;
    }

}