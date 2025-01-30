package org.example.pokemonservlet.database;

import org.example.pokemonservlet.models.Pokemon;

public class DB {

    public static Pokemon[] pokemons = {
            new Pokemon(1, "Pikachu","Elektric","Yellow"),
            new Pokemon(2, "Charmander", "Fire", "Orange"),
            new Pokemon(3, "Squirtle", "Water", "Blue"),
            new Pokemon(4, "Bulbasaur", "Grass", "Green"),
            new Pokemon(5, "Jigglypuff", "Normal", "Pink"),
            new Pokemon(6, "Gengar", "Ghost", "Purple"),
            new Pokemon(7, "Onix", "Rock", "Gray"),
            new Pokemon(8, "Alakazam", "Psychic", "Gold"),
            new Pokemon(9, "Machamp", "Fighting", "Blue-Gray"),
            new Pokemon(10, "Snorlax", "Normal", "Dark Blue")
    };
}
