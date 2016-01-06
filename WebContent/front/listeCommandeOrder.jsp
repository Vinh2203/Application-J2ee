
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:import url="/front/include/header.jsp"/>
		<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/front/css/pagePersonne.css"/>
		<script src="${pageContext.request.contextPath}/front/javascript/pagePersonne.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<c:import url="/front/include/body.jsp"/>


<br />
<c:if test="${sessionScope.test == true}">
<div class="zone_panier">
		<a href="${pageContext.request.contextPath}/auth/ViewPanierOrder" >
		<input type="image" src="${pageContext.request.contextPath}/front/image/panier.png">
		</a>
		<div id="number_trip">${number_trip_order}</div>
	</div>
</c:if>	
	<div id="zonePersonne">
		<div id="titre" style="margin-top: 0px; border: solid 0px;"> <p>Votre panier</p></div>
		<div style="margin: 20px;">	
			
			<c:forEach items="${liste_trip}" var="type">
				<div id="panier_temp_${type.id_panier_temp}">
			
				<form action="${pageContext.request.contextPath}/auth/DeletePanierOrder" method="post">
					<input type="hidden" value="${type.id_panier_temp}" name="id_panier_temp" />
				<p><b >Date Depart 	:</b> ${type.trip.option.transport.dateDept} - <b>Date Retour: </b>${type.trip.option.transport.dateRetour}</p>
				
				<p><b>Ville Depart :</b> ${type.trip.option.transport.ville_dept.nomVille} - <b>Ville Arriv&eacute; : </b>${type.trip.option.transport.ville_arrive.nomVille}</p>
				<p><b>Hotel : </b>${type.trip.option.chambre.hotel.nom_hotel} -  ${type.trip.option.chambre.hotel.type_hotel} </p>
				<p><b>Chambre  :</b> ${type.trip.option.chambre.type_chambre} -  ${type.trip.option.chambre.nombrePersonne} personne(s)</p>
				 <c:set var="sum">
						<fmt:parseNumber type="number" pattern="0.0#" value="${type.trip.option.chambre.prix + type.trip.option.transport.prix}"/>
				</c:set>
				<p><b>Total Prix :</b> <c:out value="${sum}"></c:out> &euro;</p>
				<input id='input_trip' type="submit" value="Supprimer" />
				</form>	
			<hr style="width: 50%;" />
			</div>
			</c:forEach>
		</div >		
				<c:if test="${number_trip_order != 0}">
				<a style="margin-left: 20px;" href="${pageContext.request.contextPath}/auth/ValiderCommande" >
					<input style="margin-bottom: 10px;" id='input_trip' type="submit" id='input_trip' value="Valider" >
				</a>
				</c:if>
	</div>	

<c:import url="/front/include/footer.jsp"/>