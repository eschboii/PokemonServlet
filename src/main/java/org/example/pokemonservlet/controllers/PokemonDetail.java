package org.example.pokemonservlet.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.pokemonservlet.database.DB;
import org.example.pokemonservlet.models.Pokemon;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/viewpokemon")
public class PokemonDetail extends HttpServlet {

    @Override
    public void init(){}

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String sPId = req.getParameter("id");

        if(sPId == null || sPId.isEmpty()){
            req.getRequestDispatcher("/pokemonlist").forward(req, resp);
            return;
        }

        int pokemonId = Integer.parseInt(sPId);
        Pokemon thePokemons = null;

        //Gör om id som är int till en sträng
        for(int i = 0; i<DB.pokemons.length; i++){
            if (DB.pokemons[i].getId() == pokemonId){
                thePokemons = DB.pokemons[i];
            }
        }

        PrintWriter out = resp.getWriter();

        out.println("<html><body>");
        out.println("<h1>Pokemon Details</h1>");
        if(thePokemons != null){
            out.println("<h2>The" + thePokemons.getName() + " pokemon is " + thePokemons.getColor() + " and has the type: " + thePokemons.getType() +"</h2>");
            out.println("<li><a href=\"pokemonlist\">Kom tillbaka</a></li>");
        } else {
            out.println("<h2> No Pokemon found</h2>");
        }

        out.println("</body></html>");
    }

    @Override
    public void destroy(){}

}
