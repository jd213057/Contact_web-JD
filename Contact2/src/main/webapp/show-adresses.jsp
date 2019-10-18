<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<h2> Voici toute les adresses de la BDD :</h2>

<table>
<c:forEach items="${adresses}" var ="adresse">
<tr><td> ${adresse.rue} </td>
   <td>${adresse.ville}</td> 
   <td> ${adresse.codePostal} </td> 
   <td> ${adresse.pays} </td>  <td><a href = "UpdateAdresseServlet?id=${adresse.id}">Modifier</a> <a href = "DeleteAdresseServlet?id=${adresse.id}">Supprimer</a> </td>
 </tr>
   </c:forEach>
</table>
<a href="index.jsp">Retour</a>
<meta charset="UTF-8">

</head>
<body>

</body>
</html>