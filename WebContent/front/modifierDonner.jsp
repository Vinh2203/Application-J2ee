<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:import url="/front/include/header.jsp" />
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/front/css/pagePersonne.css" />
<script
	src="${pageContext.request.contextPath}/front/javascript/pagePersonne.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<c:import url="/front/include/body.jsp" />
<c:if test="${sessionScope.user.role == 2 }">
	<c:redirect url="${pageContext.request.contextPath}/front/index.jsp"></c:redirect>
</c:if>

<c:if test="${changerment == true}">
<script>
	window.alert("Le changement est enregristre");
</script>
</c:if>
<div id="zonePersonne">
	<div id="titre" style="margin-top: 0px; border: solid 0px;">
		<p>Changer les donnes</p>
	</div>
	<form action="${pageContext.request.contextPath}/auth/modifierDonne" method="post">
		<input id="search_campus" placeholder="Qu-est-ce-que vous voulez changer ?" type="text"
			name="campus" list="name_campus" value="${name_search}">
		<datalist id="name_campus">
			<option value='Ville'>
			<option value='Type Transport'>
			<option value='Tour voyage'>
			<option value='Campus'>
		</datalist>
		<input type="submit" value="Search" class="styled-button-3" />
	</form>
	<br>
	<div style="margin-left:10px;">
	<c:choose >		
	<c:when test="${sessionScope.test_ville == true}">
		<div>
			<c:forEach items="${list_ville}" var="v">
				<form action="${pageContext.request.contextPath}/auth/modifierDonne"
					method="post">
					<b>Nom Ville :</b><input type="text"  name="nom_ville" value="${v.nomVille}"> <br>
					<input type="hidden" name="id_ville" value="${v.idVille}"> 
					<b>Nom Pays :</b><input type="text" name="nom_pays" value="${v.pays}"> 
					<br>
					<input style="margin-top:5px;"  id='input_trip' type="submit" value="Valider" />
				</form>
				<hr color="#eee" width="80%">
			</c:forEach>
		</div>
	</c:when>
	
	<c:when test="${sessionScope.test_campus  == true }">
	<div>
		<c:forEach items="${list_campus}" var="c">
			<form action="${pageContext.request.contextPath}/auth/modifierDonne"
				method="post">
				<b>Campus :</b><input type="text" name="nom_campus" value="${c.name}" /> <br>
				<input type="hidden" name="id_campus" value="${c.idCampus}">
				<b>Ville :</b><select name="ville">
					<c:forEach items="${list_ville}" var="v">
					<option value="${v.idVille}" <c:if test="${v.idVille eq c.ville.idVille }">selected="selected"</c:if> >${v.nomVille}</option>
					</c:forEach>
				</select>
				<br>
				<input style="margin-top:5px;" id='input_trip' type="submit" value="Valider" />
			</form>
			<hr color="#eee" width="80%">
		</c:forEach>
	</div>
	</c:when>
	
	<c:when test="${sessionScope.test_type == true }">
	<div>
		<c:forEach items="${list_type}" var="t">
			<form action="${pageContext.request.contextPath}/auth/modifierDonne"
				method="post">
				<b>Type Transport : </b><input type="text" name="type" value="${t.type}"> 
				<input type="hidden" name ="id_type" value="${t.idType}">
				<br>
				<input style="margin-top:5px;" id='input_trip' type="submit" value="Valider" />
			</form>
			<hr color="#eee" width="80%">
		</c:forEach>
	</div>
	</c:when>
	
	<c:when test="${sessionScope.test_trip  == true }">
	<div>
		<c:forEach items="${list_trip}" var="t">
			<form action="${pageContext.request.contextPath}/auth/modifierDonne"
				method="post">
				<b>Date Depart :</b> <input name="date_dept" type="date" value="${t.option.transport.dateDept}"> <br>
				<b>Date Retour :</b> <input name="date_retour" type="date" value="${t.option.transport.dateRetour}"> <br>
				<b>Ville Depart :</b> 
				<select name="ville_dept">
					<c:forEach items="${list_ville}" var="v">
					<option value="${v.idVille}" <c:if test="${v.idVille eq t.option.transport.ville_dept.idVille }">selected="selected"</c:if> >${v.nomVille}</option>
					</c:forEach>
				</select>
				<br>
				<b>Ville Retour :</b> 
				<select name="ville_arrive">
					<c:forEach items="${list_ville}" var="v">
					<option value="${v.idVille}" <c:if test="${v.idVille eq t.option.transport.ville_arrive.idVille  }">selected="selected"</c:if> >${v.nomVille}</option>
					</c:forEach>
				</select>
				<br>
				<b>Campus :</b> 
				<select name="campus">
					<c:forEach items="${list_campus}" var="v">
					<option value="${v.idCampus}" <c:if test="${v.idCampus eq t.campus.idCampus  }">selected="selected"</c:if> >${v.name}</option>
					</c:forEach>
				</select>
				
				<input type="hidden" value="${t.idTrip}" name="id_trip">
				<input type="hidden" value="${t.option.transport.idTransport}" name="id_transport">
				<input type="hidden" value="${t.option.idOption}" name="id_option">
				<br>
				<input  style="margin-top:5px;" id='input_trip' type="submit" value="Valider" />
			</form>
			<hr color="#eee" width="80%">
		</c:forEach>
	</div>
	</c:when>
	</c:choose>
	</div>
</div>

<c:import url="/front/include/footer.jsp" />