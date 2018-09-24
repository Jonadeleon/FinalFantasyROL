package com.finalfantasy.escudos.web;

import java.util.ArrayList;

public class Escudos {
    //Objetos privados
	private String tipo_escudo;
	private String defensa_escudo;
	private String defensa_magica_escudo;
	private String descripcion_escudo;
	private String precio_escudo;

    //getter y setter del tipo
    public String getTipo_escudo() {
        return tipo_escudo;
    }

    public void setTipo_escudo(String tipo_escudo) {
        this.tipo_escudo = tipo_escudo;
    }

	//getter y setter de defensa_escudo
	public String getDefensa_escudo(){
		return defensa_escudo;
	}
	
	public void setDefensa_escudo(String defensa_escudo){
		this.defensa_escudo = defensa_escudo;
	}
	
	//getter y setter de defensa_magica_escudo
	public String getDefensa_magica_escudo(){
		return defensa_magica_escudo;
	}
	
	public void setDefensa_magica_escudo(String defensa_magica_escudo){
		this.defensa_magica_escudo = defensa_magica_escudo;
	}
	
    //getter y setter del descripcion_escudo
    public String getDescripcion_escudo() {
        return descripcion_escudo;
    }

    public void setDescripcion_escudo(String descripcion_escudo) {
        this.descripcion_escudo = descripcion_escudo;
    }

    //getter y setter del precio_escudo
    public String getPrecio_escudo() {
        return precio_escudo;
    }

    public void setPrecio_escudo(String precio_escudo) {
        this.precio_escudo = precio_escudo;
    }

}