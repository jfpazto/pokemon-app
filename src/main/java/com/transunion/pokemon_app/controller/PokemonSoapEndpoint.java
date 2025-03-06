package com.transunion.pokemon_app.controller;
import com.transunion.pokemon_app.dto.PokemonDTO;
import com.transunion.pokemon_app.dto.PokemonFilterDTO;
import com.transunion.pokemon_app.mapper.PokemonMapper;
import com.transunion.pokemon_app.service.PokemonService;
import com.transunion.pokemon_app.soap.BuscarPokemonesRequest;
import com.transunion.pokemon_app.soap.BuscarPokemonesResponse;
import com.transunion.pokemon_app.soap.Pokemon;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class PokemonSoapEndpoint {
    private static final String NAMESPACE_URI="http://prueba-api.com/pokemon/soap";
    private final PokemonService pokemonService;
    public PokemonSoapEndpoint(PokemonService pokemonService){
        this.pokemonService=pokemonService;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "BuscarPokemonesRequest")
    @ResponsePayload
    public BuscarPokemonesResponse buscarPokemones(@RequestPayload BuscarPokemonesRequest request) {
        PokemonFilterDTO filter = new PokemonFilterDTO(
                request.getNombre(),
                request.getTipo(),
                request.getHabilidad()
        );

        List<PokemonDTO> resultado = pokemonService.buscarPokemones(filter);
        List<Pokemon> pokemonesSoap = PokemonMapper.toSoapPokemonList(resultado);
        BuscarPokemonesResponse response = new BuscarPokemonesResponse();
        response.setPokemones(pokemonesSoap);
        return response;
    }
}
