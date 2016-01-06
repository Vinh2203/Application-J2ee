
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:import url="/front/include/header.jsp"/>
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/front/css/pagePersonne.css"/>
		<script src="${pageContext.request.contextPath}/front/javascript/pagePersonne.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<c:import url="/front/include/body.jsp"/>
		<c:if test="${sessionScope.user.role == 2 }">
		<c:redirect url="${pageContext.request.contextPath}/front/index.jsp"></c:redirect>
	</c:if>
	
	<div id="zonePersonne" >
		<div id="titre" style="margin-top: 0px; border: solid 0px;"> <p>Les commandes en cours</p></div>
		<div style="margin: 20px;">
		
			<c:forEach var="type" items="${traiter_commande}">
				<form action="${pageContext.request.contextPath}/auth/valideCommandeClient" method="post">
				<input type="hidden" name="id_commande_encours" value='${type.key.idCommande}'>
				<b>
				<p>User Commande : ${type.key.user.name}</p>
				<label>Date Commande : ${type.key.dateCommande}</label>
				<label style="margin-left: 30%;">&Eacute;tat Commande : ${type.key.etatCommande == 1 ? 'En Cours' : 'Valide'}   </label>
				</b>
			<hr style="width: 70%;">
					<c:forEach var="t" items="${type.value}">
  						<p><b >Date Depart 	:</b> ${t.option.transport.dateDept} - <b>Date Retour:</b> ${t.option.transport.dateRetour}</p>
  						
  						<p><b>Ville Depart :</b> ${t.option.transport.ville_dept.nomVille} - <b>Ville Arriv&eacute; :</b> ${t.option.transport.ville_arrive.nomVille}</p>
  						<p><b>Hotel : </b>${t.option.chambre.hotel.nom_hotel} -  ${t.option.chambre.hotel.type_hotel} </p>
  						<p><b>Chambre  :</b> ${t.option.chambre.type_chambre} -  ${t.option.chambre.nombrePersonne} personne(s)</p>
  						 <c:set var="sum">
    						<fmt:parseNumber type="number" pattern="0.0#" value="${t.option.chambre.prix + t.option.transport.prix}"/>
  						</c:set>
  						
  						<p><b>Total Prix :</b> <c:out value="${sum}"></c:out> &euro;</p>
  							<hr style="width: 40%;">
  					</c:forEach>
  					<input style="margin-bottom: 10px;" id='input_trip' type="submit" id='input_trip' value="Valider" >
				<hr>
				<br />
			
				</form>
			</c:forEach>
		</div>	
	</div>	
	

<c:import url="/front/include/footer.jsp"/>