package org.example.pokemonservlet.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.pokemonservlet.database.DB;

import java.io.IOException;

@WebServlet("/viewpokemon")
public class PokemonDetailController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String pId = req.getParameter("id");

        if (pId == null || pId.isEmpty()) {
            return;
        }

        int id = Integer.parseInt(pId);

        for (int i = 0; i < DB.pokemons.length; i++) {
            if (id == DB.pokemons[i].getId()) {
                req.setAttribute("pokemon", DB.pokemons[i]);
                req.getRequestDispatcher("/view/pokemondetail.jsp").forward(req, resp);
            }
        }
    }
}
