package org.example.pokemonservlet.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.pokemonservlet.database.DB;
import org.example.pokemonservlet.model.Pokemon;

import java.io.IOException;

@WebServlet("/viewpokemon")
public class PokemonDetail extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
            req.getRequestDispatcher("/view/pokemondetail.jsp").forward(req, resp);;
    }
}
