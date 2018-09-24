package com.finalfantasy.materias.web;

import java.util.ArrayList;

public class Materias {
    //Objetos privados
	private String color_materia;
    private String nombre_materia;
	private String descripcion_materia;
	privare String nivel_materia;
	private String precio_item;

    //getter y setter del color
    public String getColor_materia() {
        return color_materia;
    }

    public void setColor_materia(String color_materia) {
        this.color_materia = color_materia;
    }

    //getter y setter del nombre_materia
    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    //getter y setter del descripcion_materia
    public String getDescripcion_materia() {
        return descripcion_materia;
    }

    public void setDescripcion_materia(String descripcion_materia) {
        this.descripcion_materia = descripcion_materia;
    }

    //getter y setter de nivel_materia
    public String getNivel_materia(){
        return nivel_materia;
    }

    public void setNivel_materia(){
    this.nivel_materia = nivel_materia;
    }

    //getter y setter del precio_materia
    public String getPrecio_materia() {
        return precio_materia;
    }

    public void setPrecio_materia(String precio_materia) {
        this.precio_materia = precio_materia;
    }

}