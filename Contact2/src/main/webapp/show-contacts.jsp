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
<h2> Voici tout les contacts de la BDD </h2>
<table>
<c:forEach items="${contacts}" var ="contact">
<tr><td> ${contact.civilite} </td>
   <td>${contact.nom}</td> 
   <td> ${contact.prenom} </td> <td><a href = "ContactInfoServlet?id=${contact.id}"> Afficher plus d'information (Adresse) </a><a href = "UpdateContactServlet?id=${contact.id}">Modifier</a> <a href = "DeleteContactServlet?id=${contact.id}">Supprimer</a> </td>
 </tr>
   </c:forEach>
</table>
<a href="index.jsp">Retour</a>
</body>
</html>