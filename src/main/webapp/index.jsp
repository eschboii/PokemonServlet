<%@ page import="org.example.pokemonservlet.database.DB" %>
<%@ page import="org.example.pokemonservlet.models.Pokemon" %>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    Pokemon[] pokemons = DB.pokemons;
    request.setAttribute("pokemons", pokemons);
%>

<!DOCTYPE html>
<html>
<head>
    <title>Pokemon list</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
          crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>
    <style>
        .grit {
            background-color: lightseagreen;
        }

        .gritfit {
            background-color: lightsalmon;
        }
    </style>
</head>
<body>
    <%@include file="WEB-INF/fragments/header.jspf"%>

    <div class="container">
        <div class="row">
            <div class="col grit">
                <h2><%= "Hello Nerd!" %></h2>
                <p>
                    <a href="pokemonlist">Pokemonlistan</a>
                    <a href="pokemon/add">Add Pokemon</a>
                </p>
            </div>
        </div>
        <div class="row">
            <div class="col grit">
                <h2>Emiles coola Pokemon!</h2>
                <ul>
                    <c:forEach items="${pokemons}" var="p">
                        <c:if test="${p.name != \"Pikachu\"}">
                            <li>${p.name}</li>
                        </c:if>
                    </c:forEach>
                </ul>
            </div>
        </div>
    </div>
<br>
<img src="https://cdn-icons-png.flaticon.com/512/25/25231.png" alt="No picz" width=200 height=200/>
<br>
</body>
</html>