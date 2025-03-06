package com.transunion.pokemon_app.service;

import com.transunion.pokemon_app.client.PokeApiClient;
import com.transunion.pokemon_app.dto.PokemonDTO;
import com.transunion.pokemon_app.dto.PokemonFilterDTO;
import com.transunion.pokemon_app.repository.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {
    private final PokemonRepository pokemonRepository;
    private final PokeApiClient pokeApiClient;

    public PokemonService(PokemonRepository pokemonRepository, PokeApiClient pokeApiClient) {
        this.pokemonRepository = pokemonRepository;
        this.pokeApiClient = pokeApiClient;
    }

    public void sincronizarPokemonDesdeApi(int idPokeApi){
        PokemonDTO pokemonDTO=pokeApiClient.obtenerPokemonDesdeApi(idPokeApi);
        pokemonRepository.cargarPokemon(pokemonDTO);
    }

    public List<PokemonDTO> buscarPokemones (PokemonFilterDTO filtro){
        return pokemonRepository.buscarPokemones(filtro);
    }
    public void sincronizarTodosLosPokemones() {
        List<Integer> ids = pokeApiClient.obtenerTodosLosIds();
        for (int id : ids) {
            PokemonDTO pokemon = pokeApiClient.obtenerPokemonDesdeApi(id);
            pokemonRepository.cargarPokemon(pokemon);
        }
    }
}
