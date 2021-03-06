
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/front/include/header.jsp" />


<c:import url="/front/include/body.jsp" />

<c:if test="${login == 2}">
<script>
	window.alert("Erreur login/password");
</script>
</c:if>

<c:if test="${login == 1}">
<script>
	window.alert("login deja existe ");
</script>
</c:if>
<div id="zonePersonne">
<div id="titre" style="margin-top: 0px; border: solid 0px;"> <p>Creer votre compte</p></div>
	<div id="zonePersonne_modifier" >
		<form action="${pageContext.request.contextPath}/creerCompte" method="post">
			<label><b>Id Booster : </b></label>
				<hr width="50%" align="left">
				<input type="text"  name="id_user" placeholder="idBooster" required /> 
			<br /><br />
			
			<label><b>Password : </b></label>
				<hr width="50%" align="left">
				<input type="password"  name="password_user" placeholder="Password" required/> 
				<br /><br />
				
			<label><b>Name : </b></label>
				<hr width="50%" align="left">
				<input type="text"  name="name_user" placeholder="Name"  /> 
			<br /><br />	
			
			 <label><b>Email : </b></label>
			<hr width="50%" align="left">
			<input type="text" name="email_user" placeholder="email" /> 
				<br /><br /> 
				
				<label><b>Campus : </b></label>
					<hr width="50%" align="left">
					<select name="campusId">
						<c:forEach items="${listCampus}" var="c">
							<option value="${c.idCampus}">${c.name}</option>
						</c:forEach>
					</select>	
					<div></div>
					
			<input style="margin-top: 52px; margin-left: 1px;" type="submit" class="styled-button-2" value="Valider" />
		</form>
	</div>

</div>
<c:import url="/front/include/footer.jsp" />