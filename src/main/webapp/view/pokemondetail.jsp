<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/fragments/header.jspf" %>
<%@ include file="/WEB-INF/fragments/navbar.jspf" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="pokemon" scope="request" type="org.example.pokemonservlet.model.Pokemon"/>

<h2>Pokemon!</h2>

<ul>
    <li>${pokemon.id}</li>
    <li>${pokemon.name}</li>
    <li>${pokemon.color}</li>
    <li>${pokemon.type}</li>
</ul>

<%@ include file="/WEB-INF/fragments/footer.jspf" %>