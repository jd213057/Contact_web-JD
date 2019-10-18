<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contacts</title>
</head>
<body>
<h2> Recherche des contacts </h2>
<form action="ContactServlet" method="POST"> <button type="submit"> Obtenir la liste complète des contacts </button></form>
<form action="AdresseServlet" method="POST"> <button type="submit"> Obtenir la liste complète des adresses </button></form>
<form action="AddContactServlet" method="POST"> Création d'un nouveau contact </br>

<label for="civilite">Civilite :</label>

<select name="civilite" id="civilite">
    <option value="">--Choisir une civilité--</option>
    <option value="M">M</option>
    <option value="Mme">Mme</option>
    <option value="Dr">Dr</option>
    <option value="Me">Me</option>
    <option value="Mlle">Mlle</option>
</select>
<!-- Civilité: <input name="civilite" id="civilite"> -->
Nom : <input name="nom" id="nom">
Prénom : <input name="prenom" id="prenom">
<button type="submit">Créer </button></form></br>
<form action="AddAdresseServlet" method="POST"> Création d'une nouvelle adresse : </br>

Rue : <input name="rue" id="rue">
Ville : <input name="ville" id="ville">
Code Postal : <input name="codePostal" id="codePostal">
Pays : <input name="pays" id="pays">
<button type="submit">Créer </button></form>

</body>
</html>