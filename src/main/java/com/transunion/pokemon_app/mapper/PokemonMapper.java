package com.transunion.pokemon_app.mapper;

import com.transunion.pokemon_app.dto.PokemonDTO;
import com.transunion.pokemon_app.soap.BuscarPokemonesResponse;
import com.transunion.pokemon_app.soap.Pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PokemonMapper {

    private PokemonMapper() {}

    public static Pokemon toSoapPokemon(PokemonDTO dto) {
        Pokemon soap = new Pokemon();
        soap.setIdPokeapi(dto.getIdPokeapi());
        soap.setNombre(dto.getName());
        soap.setAltura(dto.getHeight());
        soap.setPeso(dto.getWeight());
        soap.getTipos().addAll(Arrays.asList(dto.getTypes()));
        soap.getHabilidades().addAll(Arrays.asList(dto.getAbilities()));
        return soap;
    }

    public static BuscarPokemonesResponse toSoapResponse(List<PokemonDTO> dtos) {
        List<Pokemon> pokemonesSoap = dtos.stream()
                .map(PokemonMapper::toSoapPokemon)
                .collect(Collectors.toList());

        BuscarPokemonesResponse response = new BuscarPokemonesResponse();
        response.getPokemones().addAll(pokemonesSoap);  // Este es el patrón correcto según tu clase.
        return response;
    }
}
