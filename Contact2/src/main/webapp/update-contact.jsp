<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modification du contact</title>
</head>
<body>
<h2> Modification du contact </h2>
<form action="Update2Servlet" method="POST"> Création d'un nouveau contact </br>
<label for="civilite">Civilite :</label>

<select name="civilite" id="civilite">
    <option value="">--Choisir une civilité--</option>
    <option value="M">M</option>
    <option value="Mme">Mme</option>
    <option value="Dr">Dr</option>
    <option value="Me">Me</option>
    <option value="Mlle">Mlle</option>
</select>

<%-- Civilité: <input name="civilite" id="civilite" value="${contact.civilite}"> --%>
Nom : <input name="nom" id="nom" value="${contact.nom}">
Prénom : <input name="prenom" id="prenom" value="${contact.prenom}">
 <input name="id" id="id" type="hidden" value="${contact.id }">
<button type="submit">Modifier </button></form>
</body>
</html>