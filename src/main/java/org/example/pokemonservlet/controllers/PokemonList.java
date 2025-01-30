package org.example.pokemonservlet.controllers;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.pokemonservlet.database.DB;
import org.example.pokemonservlet.models.Pokemon;

@WebServlet("/pokemonlist")
public class PokemonList extends HttpServlet {

    public void init() {}

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> The Pokemon list</h1>");
        out.println("<ul>");

        for(int i = 0; i< DB.pokemons.length; i++){
            Pokemon p = DB.pokemons[i];
            out.println("<li><a href=\"viewpokemon?id=" +p.getId() + "\">" + p.getName() + "</a></li>");
        }

        out.println("</ul>");
        out.println("</body></html>");
    }

    public void destroy() {}
}