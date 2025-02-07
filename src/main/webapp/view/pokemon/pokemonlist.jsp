<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/fragments/header.jspf" %>
<%@ include file="/WEB-INF/fragments/navbar.jspf" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>Emiles coola Pokemon!</h2>

<ul>
    <c:forEach items="${pokemons}" var="p">
        <li><a href="/viewpokemon?id=${p.id}">${p.name}</a></li>
    </c:forEach>
</ul>

<%@ include file="/WEB-INF/fragments/footer.jspf" %>