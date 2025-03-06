package com.transunion.pokemon_app.repository;

import com.transunion.pokemon_app.dto.PokemonDTO;
import com.transunion.pokemon_app.dto.PokemonFilterDTO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameterValue;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.List;

@Repository
public class PokemonRepository {
    private final JdbcTemplate jdbcTemplate;

    public PokemonRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void cargarPokemon(PokemonDTO pokemon){
        String sql = "CALL cargar_pokemon(?,?,?,?,?,?)";
        jdbcTemplate.update(sql, pokemon.getIdPokeapi(),pokemon.getName(),pokemon.getHeight(),pokemon.getWeight(),pokemon.getTypes(),pokemon.getAbilities());
    }

    public List<PokemonDTO> buscarPokemones(PokemonFilterDTO filter){
        String sql = "SELECT * FROM buscar_pokemones(?,?,?)";
        return jdbcTemplate.query(sql,
                new Object[]{filter.getNombre(), filter.getTipo(), filter.getHabilidad()},
                new int[]{Types.VARCHAR, Types.VARCHAR, Types.VARCHAR},
                (rs, rowNum) -> {
                    PokemonDTO pokemon = new PokemonDTO();
                    pokemon.setIdPokeapi(rs.getInt("id_pokeapi"));
                    pokemon.setName(rs.getString("nombre"));
                    pokemon.setHeight(rs.getInt("height"));
                    pokemon.setWeight(rs.getInt("weight"));
                    pokemon.setTypes((String[]) rs.getArray("tipos").getArray());
                    pokemon.setAbilities((String[]) rs.getArray("habilidades").getArray());
                    return pokemon;
                }
        );
    }
}
