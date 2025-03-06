package com.transunion.pokemon_app.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;
@XmlAccessorType(XmlAccessType.FIELD)
public class Pokemon {
    @XmlElement(name = "idPokeapi")
    private int idPokeapi;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "height")
    private int height;

    @XmlElement(name = "weight")
    private int weight;

    @XmlElement(name = "types")
    private List<String> types;

    @XmlElement(name = "abilities")
    private List<String> abilities;

    public int getIdPokeapi() {
        return idPokeapi;
    }

    public void setIdPokeapi(int idPokeapi) {
        this.idPokeapi = idPokeapi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<String> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<String> abilities) {
        this.abilities = abilities;
    }
}
