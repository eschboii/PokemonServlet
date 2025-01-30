package org.example.pokemonservlet.controllers;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.pokemonservlet.database.DB;
import org.example.pokemonservlet.models.Pokemon;

import static org.example.pokemonservlet.database.DB.pokemons;

@WebServlet("/pokemonlist")
public class PokemonList extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        // resp.setContentType("text/html");
        req.setAttribute("pokemons", pokemons);
        req.getRequestDispatcher("/views/pokemons.jsp").forward(req, resp);

//        PrintWriter out = resp.getWriter();
//        out.println("<html><body>");
//        out.println("<h1> The Pokemon list</h1>");
//        out.println("<ul>");
//
//        for(int i = 0; i< DB.pokemons.length; i++){
//            Pokemon p = DB.pokemons[i];
//            out.println("<li><a href=\"viewpokemon?id=" +p.getId() + "\">" + p.getName() + "</a></li>");
//        }
//
//        out.println("</ul>");
//        out.println("</body></html>");
    }

    public void destroy() {
    }
}