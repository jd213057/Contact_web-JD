<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AllContacts</title>
</head>
<body>
<h2> Profil du contact : </h2>
<h4> ${contact.civilite} </h4><h4> ${contact.nom} </h4><h4> ${contact.civilite} </h4><h4> ${contact.prenom} </h4>

<h3> Adresse(s) connue(s) </h3>
<table>
<c:forEach items="${contact.adresses} " var ="adresse">
<tr><td> ${adresse.rue} </td>
   <td>${adresse.codePostal}</td> 
   <td> ${adresse.ville} </td> 
   <td> ${adresse.pays} </td>  <td><a href = "ContactInfoServlet?id=${contact.id}"> Afficher plus d'information (Adresse) </a><a href = "UpdateAdresseServlet?id=${adresse.id}">Modifier</a> <a href = "DeleteContactServlet?id=${adresse.id}">Supprimer</a> </td>
 </tr>
   </c:forEach>
</table>
<a href="index.jsp">Retour</a>
</body>
</html>