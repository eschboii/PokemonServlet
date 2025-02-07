package org.example.pokemonservlet.database;

import org.example.pokemonservlet.model.Pokemon;

import java.util.ArrayList;

public class DB {

    public static ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>() {
        {
            add(new Pokemon(1, "Pikachu", "Elektric", "Yellow"));
            add(new Pokemon(2, "Charmander", "Fire", "Orange"));
            add(new Pokemon(3, "Squirtle", "Water", "Blue"));
            add(new Pokemon(4, "Bulbasaur", "Grass", "Green"));
            add(new Pokemon(5, "Jigglypuff", "Normal", "Pink"));
            add(new Pokemon(6, "Gengar", "Ghost", "Purple"));
            add(new Pokemon(7, "Onix", "Rock", "Gray"));
            add(new Pokemon(8, "Alakazam", "Psychic", "Gold"));
            add(new Pokemon(9, "Machamp", "Fighting", "Blue-Gray"));
            add(new Pokemon(10, "Snorlax", "Normal", "Dark Blue"));
        }
    };


//    public static Pokemon[] pokemons = {
//            new Pokemon(1, "Pikachu","Elektric","Yellow"),
//            new Pokemon(2, "Charmander", "Fire", "Orange"),
//            new Pokemon(3, "Squirtle", "Water", "Blue"),
//            new Pokemon(4, "Bulbasaur", "Grass", "Green"),
//            new Pokemon(5, "Jigglypuff", "Normal", "Pink"),
//            new Pokemon(6, "Gengar", "Ghost", "Purple"),
//            new Pokemon(7, "Onix", "Rock", "Gray"),
//            new Pokemon(8, "Alakazam", "Psychic", "Gold"),
//            new Pokemon(9, "Machamp", "Fighting", "Blue-Gray"),
//            new Pokemon(10, "Snorlax", "Normal", "Dark Blue")
//    };
}
