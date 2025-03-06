package com.transunion.pokemon_app.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "BuscarPokemonesResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class BuscarPokemonesResponse {
    @XmlElement(name = "pokemon")
    private List<Pokemon> pokemones = new ArrayList<>();

    public List<Pokemon> getPokemones() {
        return pokemones;
    }
    public void setPokemones(List<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }
}
