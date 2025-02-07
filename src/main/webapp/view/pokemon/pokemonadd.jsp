<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/fragments/header.jspf" %>
<%@ include file="/WEB-INF/fragments/navbar.jspf" %>

<form method="POST" action="/addpokemon">
<div class="mb-3">
    <label for="name" class="form-label">Name</label>
    <input type="text" class="form-control" name="name" id="name" placeholder="Pikachu">
</div>

<div class="mb-3">
    <label for="color" class="form-label">Color</label>
    <input type="text" class="form-control" name="color" id="color" placeholder="Green">
</div>

<div class="mb-3">
    <label for="type" class="form-label">Type</label>
    <input type="text" class="form-control" name="type" id="type" placeholder="Electric">
</div>
    <input type="submit" value="Add" class="btn btn-primary">
</form>

<%@ include file="/WEB-INF/fragments/footer.jspf" %>