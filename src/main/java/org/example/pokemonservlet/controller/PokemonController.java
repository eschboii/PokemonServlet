package org.example.pokemonservlet.controller;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import static org.example.pokemonservlet.database.DB.pokemons;

@WebServlet("/pokemonlist")
public class PokemonController extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setAttribute("pokemons", pokemons);
        req.getRequestDispatcher("/view/pokemonlist.jsp").forward(req, resp);
    }
}