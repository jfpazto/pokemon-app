package com.transunion.pokemon_app.client;

import com.fasterxml.jackson.databind.JsonNode;
import com.transunion.pokemon_app.dto.PokemonDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@Component
public class PokeApiClient {
    public PokeApiClient(RestTemplate restTemplate) {
        this.restTemplate=restTemplate;
    }

    private final RestTemplate restTemplate;
    private static final String BASE_URL= "https://pokeapi.co/api/v2/pokemon/";
    public PokemonDTO obtenerPokemonDesdeApi(int idPokeapi){
        String url= BASE_URL + idPokeapi;
        JsonNode response = restTemplate.getForObject(url, JsonNode.class);
        if (response==null){
            throw new RuntimeException("No se obtuvo los datos para el pokemon" + idPokeapi);
        }
        PokemonDTO pokemon= new PokemonDTO();
        pokemon.setIdPokeapi(idPokeapi);
        pokemon.setName(response.get("name").asText());
        pokemon.setHeight(response.get("height").asInt());
        pokemon.setWeight(response.get("weight").asInt());

        List<String> tipos = new ArrayList<>();
        response.get("types").forEach(typeNode -> tipos.add(typeNode.get("type").get("name").asText()));
        pokemon.setTypes(tipos.toArray(new String[0]));

        List<String> habilidades = new ArrayList<>();
        response.get("abilities").forEach(abilityNode -> habilidades.add(abilityNode.get("ability").get("name").asText()));
        pokemon.setAbilities(habilidades.toArray(new String[0]));

        return pokemon;
    }
}
