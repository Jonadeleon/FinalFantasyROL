package com.finalfantasy.items.web;

import java.util.ArrayList;

public class Items {
    //Objetos privados
	private String tipo_item;
    private String nombre_item;
	private String descripcion_item;
	private String precio_item;

    //getter y setter del tipo
    public String getTipo_item() {
        return tipo_item;
    }

    public void setTipo_item(String tipo_item) {
        this.tipo_item = tipo_item;
    }

    //getter y setter del nombre_item
    public String getNombre_item() {
        return nombre_item;
    }

    public void setNombre_item(String nombre_item) {
        this.nombre_item = nombre_item;
    }

    //getter y setter del descripcion_item
    public String getDescripcion_item() {
        return descripcion_item;
    }

    public void setDescripcion_item(String descripcion_item) {
        this.descripcion_item = descripcion_item;
    }

    //getter y setter del precio_item
    public String getPrecio_item() {
        return precio_item;
    }

    public void setPrecio_item(String precio_item) {
        this.precio_item = precio_item;
    }

}