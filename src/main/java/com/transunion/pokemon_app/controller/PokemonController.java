package com.transunion.pokemon_app.controller;

import com.transunion.pokemon_app.dto.PokemonDTO;
import com.transunion.pokemon_app.dto.PokemonFilterDTO;
import com.transunion.pokemon_app.service.PokemonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/pokemones")
public class PokemonController {
    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }
    @PostMapping("/sincronizar/{id}")
    public void sincronizar(@PathVariable int id){
        pokemonService.sincronizarPokemonDesdeApi(id);
    }

    @GetMapping
    public List<PokemonDTO> buscar(@RequestParam(required = false) String nombre, @RequestParam(required = false) String tipo,@RequestParam(required = false) String habilidad){
        PokemonFilterDTO filtro=new PokemonFilterDTO(nombre,tipo,habilidad);
        return pokemonService.buscarPokemones(filtro);
    }
}
