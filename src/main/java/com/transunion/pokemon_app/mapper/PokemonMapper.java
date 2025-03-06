package com.transunion.pokemon_app.mapper;

import com.transunion.pokemon_app.dto.PokemonDTO;
import com.transunion.pokemon_app.soap.Pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PokemonMapper {
    private PokemonMapper() {

    }
    public static Pokemon toSoapPokemon(PokemonDTO dto) {
        Pokemon soap = new Pokemon();
        soap.setIdPokeapi(dto.getIdPokeapi());
        soap.setName(dto.getName());
        soap.setHeight(dto.getHeight());
        soap.setWeight(dto.getWeight());
        soap.setTypes(Arrays.asList(dto.getTypes()));
        soap.setAbilities(Arrays.asList(dto.getAbilities()));
        return soap;
    }

    public static List<Pokemon> toSoapPokemonList(List<PokemonDTO> dtos) {
        return dtos.stream()
                .map(PokemonMapper::toSoapPokemon)
                .collect(Collectors.toList());
    }
}
