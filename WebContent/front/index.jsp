<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:import url="/front/include/header.jsp" />

<c:import url="/front/include/body.jsp" />

<br />



<c:if test="${Validation_Commande == true}">
<script>
	window.alert("Votre commande est valide");
</script>
</c:if>

<c:if test="${test == false}">
<script>
	window.alert("Erreur login/password");
</script>
</c:if>

<div id="zonePersonne">
<div id="titre"> <p>Reserver un tour voyage</p>
	</div>	
	<form  action="search_trip" method="POST" style="margin-top: 10px;margin-left: 73px;">
	<input id="search_campus" placeholder="Name Campus" type="text"
		name="campus" list="name_campus" value="${name_campus}">
	<datalist id="name_campus">
		<c:forEach items="${listCampus}" var="c">
			<option value='${c.name}' >
		</c:forEach>
	</datalist>
	
	<input type="submit" value="Search" class="styled-button-3" /></form>
	
	
	
<div>	
	<c:forEach items="${liste_trip_order}" var="t">
		<c:set var="sum">
				<fmt:parseNumber type="number" pattern="0.0#"
					value="${t.option.chambre.prix + t.option.transport.prix}" />
			</c:set>
			
		<div class="zone_trip">
			<form action="${pageContext.request.contextPath}/auth/AjouterPanier" method="post">
				<p style="margin-left: 10px;"><b>${t.option.transport.ville_dept.nomVille} - ${t.option.transport.ville_arrive.nomVille} </b></p>
					<b style="margin-left: 10px;">Total Prix : <c:out value="${sum}"></c:out>&euro; </b>
					<hr style="width: 60%" color="#eee">
					<c:set var="date_dept" value="${t.option.transport.dateDept}" />
					<c:set var="date_retour" value="${t.option.transport.dateRetour}" />
					<p style="display:none;margin-left: 10px;" id='date_${t.idTrip}' ><b>Date depart :</b> <fmt:formatDate type="date" 
           			 value="${date_dept}" /> <br /><b>Date retour: </b><fmt:formatDate type="date" 
           			 value="${date_retour}" /></p>
					<p style="display:none;margin-left: 10px;" id='ville_${t.idTrip}' ><b>Ville depart :</b>${t.option.transport.ville_dept.nomVille} <br /><b> Ville arrive : </b>${t.option.transport.ville_arrive.nomVille} <br> <b>Transport</b> : ${t.option.transport.idType.type} </p>
					<p style="display:none;margin-left: 10px;" id='hotel_${t.idTrip}' ><b>Hotel : </b>${t.option.chambre.hotel.nom_hotel} -  ${t.option.chambre.hotel.type_hotel}</p>
					<p style="display:none;margin-left: 10px;" id='chambre_${t.idTrip}' ><b>Chambre  :</b> ${t.option.chambre.type_chambre} -  ${t.option.chambre.nombrePersonne} personne(s) </p>
					<input type="hidden"  id ="id_trip" name ="id_trip" value='${t.idTrip}' />
				
				<input id="input_trip_view_${t.idTrip}" value='ViewDetail' class="input_trip_view" type="button"   onclick="viewDetailTrip(${t.idTrip});" />
				<input id='input_trip_hide_${t.idTrip}' class="input_trip_view" style="display: none" type="button" value="Hide"  onclick="hideDetailTrip(${t.idTrip});"  />
				<c:if test="${sessionScope.test == true}"> <input  type="submit" id="panier" value="Ajouter au panier"  class="styled-button-4"></c:if>
			</form>
		</div>
		
	</c:forEach>
	</div>
</div>

<c:import url="/front/include/footer.jsp" />