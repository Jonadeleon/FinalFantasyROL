package com.finalfantasy.armaduras.web;

import java.util.ArrayList;

public class Armaduras {
    //Objetos privados
	private String tipo_armadura;
    private String nombre_armadura;
	private String defensa_armadura;
	private String defensa_magica_armadura;
	private String especial_armadura;
	private String precio_armadura;

    //getter y setter del tipo
    public String getTipo_armadura() {
        return tipo_armadura;
    }

    public void setTipo_armadura(String tipo_armadura) {
        this.tipo_armadura = tipo_armadura;
    }

    //getter y setter del nombre_armadura
    public String getNombre_armadura() {
        return nombre_armadura;
    }

    public void setNombre_armadura(String nombre_armadura) {
        this.nombre_armadura = nombre_armadura;
    }

    //getter y setter del defensa_armadura
    public String getDefensa_armadura() {
        return defensa_armadura;
    }

    public void setDefensa_armadura(String defensa_armadura) {
        this.defensa_armadura = defensa_armadura;
    }

    //getter y setter del defensa_magica_armadura
    public String getDefesa_magica_armadura() {
        return defensa_magica_armadura;
    }

    public void setDefensa_magica_armadura(String defensa_magica_armadura) {
        this.defensa_magica_armadura = defensa_magica_armadura;
    }

    //getter y setter del especial_armadura
    public String getEspecial_armadura() {
        return especial_armadura;
    }

    public void setEspecial_armadura(String especial_armadura) {
        this.especial_armadura = especial_armadura;
    }

    //getter y setter del precio_armadura
    public String getPrecio_armadura() {
        return precio_armadura;
    }

    public void setPrecio_armadura(String precio_armadura) {
        this.precio_armadura = precio_armadura;
    }

}