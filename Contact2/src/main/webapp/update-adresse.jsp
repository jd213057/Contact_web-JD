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
<form action="Update2AdresseServlet" method="POST"> Création d'une nouvelle adresse : </br>

Rue : <input name="rue" id="rue">
Ville : <input name="ville" id="ville">
Code Postal : <input name="codePostal" id="codePostal">
Pays : <input name="pays" id="pays">
 <input name="id" id="id" type="hidden" value="${adresse.id }">
<button type="submit">Modifier </button></form>
</body>
</html>