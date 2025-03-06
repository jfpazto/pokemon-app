package com.transunion.pokemon_app.dto;

public class PokemonDTO {
    private Integer idPokeapi;
    private String name;
    private Integer height;
    private Integer weight;
    private String[] types;
    private String[] abilities;

    public Integer getIdPokeapi() {
        return idPokeapi;
    }

    public void setIdPokeapi(Integer idPokeapi) {
        this.idPokeapi = idPokeapi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    public String[] getAbilities() {
        return abilities;
    }

    public void setAbilities(String[] abilities) {
        this.abilities = abilities;
    }
}
