package com.transunion.pokemon_app.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BuscarPokemonesRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class BuscarPokemonesRequest {
    @XmlElement(name = "nombre")
    private String nombre;

    @XmlElement(name = "tipo")
    private String tipo;

    @XmlElement(name = "habilidad")
    private String habilidad;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHabilidad() {
        return habilidad;
    }
    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }
}
