package org.example.pokemonservlet.database;

import org.example.pokemonservlet.models.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class DB {

    public static List<Pokemon> pokemons = new ArrayList<>();

    static{
        pokemons.add(new Pokemon(1, "Pikachu","Elektric","Yellow"));
        pokemons.add(new Pokemon(2, "Charmander", "Fire", "Orange"));
        pokemons.add(new Pokemon(3, "Squirtle", "Water", "Blue"));
        pokemons.add(new Pokemon(4, "Bulbasaur", "Grass", "Green"));
        pokemons.add(new Pokemon(5, "Jigglypuff", "Normal", "Pink"));
        pokemons.add(new Pokemon(6, "Gengar", "Ghost", "Purple"));
        pokemons.add(new Pokemon(7, "Onix", "Rock", "Gray"));
        pokemons.add(new Pokemon(8, "Alakazam", "Psychic", "Gold"));
        pokemons.add(new Pokemon(9, "Machamp", "Fighting", "Blue-Gray"));
        pokemons.add(new Pokemon(10, "Snorlax", "Normal", "Dark Blue"));
    }
}
