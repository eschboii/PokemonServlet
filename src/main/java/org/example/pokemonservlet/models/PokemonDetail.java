package org.example.pokemonservlet.models;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/viewpokemon")
public class PokemonDetail extends HttpServlet {

    @Override
    public void init(){}

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){

    }
}
