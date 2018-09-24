package com.finalfantasy.armas.web;

import java.util.ArrayList;

public class Armas {
    //Objetos privados
	private String tipo_arma;
    private String nombre_arma;
	private String at_arma;
	private String damage_arma;
	private String descripcion_arma;
	private String precio_arma;

    //getter y setter del tipo
    public String getTipo_arma() {
        return tipo_arma;
    }

    public void setTipo_arma(String tipo_arma) {
        this.tipo_arma = tipo_arma;
    }

    //getter y setter del nombre_arma
    public String getNombre_arma() {
        return nombre_arma;
    }

    public void setNombre_arma(String nombre_arma) {
        this.nombre_arma = nombre_arma;
    }

    //getter y setter del descripcion_arma
    public String getDescripcion_arma() {
        return descripcion_arma;
    }

    public void setDescripcion_arma(String descripcion_arma) {
        this.descripcion_arma = descripcion_arma;
    }

    //getter y setter del precio_arma
    public String getPrecio_arma() {
        return precio_arma;
    }

    public void setPrecio_arma(String precio_arma) {
        this.precio_arma
		= precio_arma;
    }

}