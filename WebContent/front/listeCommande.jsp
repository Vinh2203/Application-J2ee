
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:import url="/front/include/header.jsp"/>
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/front/css/pagePersonne.css"/>
		<script src="${pageContext.request.contextPath}/front/javascript/pagePersonne.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<c:import url="/front/include/body.jsp"/>
	
	<div id="zonePersonne" >
		<div id="titre" style="margin-top: 0px; border: solid 0px;"> <p>Vos commandes</p></div>
		<div style="margin: 20px;">
		
			<c:forEach var="type" items="${liste_trip}">

				<b>
				<c:set var="date_commande" value="${type.key.dateCommande}" />
				<label>Date Commande : <fmt:formatDate type="date" value="${date_commande}" /></label>
				<label style="margin-left: 30%;">&Eacute;tat Commande : ${type.key.etatCommande == 1 ? 'En Cours' : 'Valide'}   </label>
				</b>
			<hr style="width: 70%;">
					<c:forEach var="t" items="${type.value}">
					<c:set var="date_dept" value="${t.option.transport.dateDept}" />
					<c:set var="date_retour" value="${t.option.transport.dateRetour}" />
  						<p><b >Date Depart 	:</b> <fmt:formatDate type="date" value="${date_dept}" /> - 
  						<b>Date Retour:</b> <fmt:formatDate type="date" 
           			 value="${date_retour}" /></p>
  						
  						<p><b>Ville Depart :</b> ${t.option.transport.ville_dept.nomVille} - <b>Ville Arriv&eacute; :</b> ${t.option.transport.ville_arrive.nomVille}</p>
  						<p><b>Hotel : </b>${t.option.chambre.hotel.nom_hotel} -  ${t.option.chambre.hotel.type_hotel} </p>
  						<p><b>Chambre  :</b> ${t.option.chambre.type_chambre} -  ${t.option.chambre.nombrePersonne} personne(s)</p>
  						 <c:set var="sum">
    						<fmt:parseNumber type="number" pattern="0.0#" value="${t.option.chambre.prix + t.option.transport.prix}"/>
  						</c:set>
  						
  						<p><b>Total Prix :</b> <c:out value="${sum}"></c:out> &euro;</p>
  							<hr style="width: 40%;">
  					</c:forEach>
				<hr>
				<br />
			</c:forEach>
		</div>	
	</div>	

<c:import url="/front/include/footer.jsp"/>