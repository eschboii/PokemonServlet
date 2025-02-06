<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/fragments/header.jspf" %>
<%@ include file="/WEB-INF/fragments/navbar.jspf" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="pokemons" scope="request" type="org.example.pokemonservlet.model.Pokemon[]"/>

<h2>Emiles coola Pokemon!</h2>

<ul>
    <c:forEach items="${pokemons}" var="p">
        <li>${p.name}</li>
    </c:forEach>
</ul>

<%@ include file="/WEB-INF/fragments/footer.jspf" %>